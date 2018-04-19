package com.demo.wsclient;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.demo.wsserver.CnpNotification;
import com.demo.wsserver.CnpNotificationService;
import com.sun.xml.internal.ws.client.BindingProviderProperties;

import my.yes.ecservices.EcNotificationRequest;
import my.yes.ecservices.EcNotificationResponse;


public class WSClient {
	

	public static void main(String[] args) {
		
		URL url = null;
		String timeout = null;
		ClassLoader classLoader = null;
		Properties properties = null;	
		QName ecServicesQName = new QName("http://wsserver.demo.com/", "CnpNotificationService");
		EcNotificationResponse eNotificationResponse = null;

			try {
					url = new URL("http://localhost:8080/WebserviceDemo?wsdl");
					timeout = "30000";
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				CnpNotificationService service1 = new CnpNotificationService(url, ecServicesQName);
				CnpNotification port1 = service1.getCnpNotificationPort();
				System.out.println("Connected...");
				Map<String, Object> requestContext = ((BindingProvider) port1).getRequestContext();
				// // Set timeout params
				Integer timeOut = timeout == null ? 240000 : Integer.parseInt(timeout); // 4 minutes(< 5 minutes of default jboss timeout) by default if not set in property file
				requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, timeOut); // Timeout in millis
				requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, timeOut); // Timeout in millis
			/*	LOGGER.info("Request [requestId=" + ec.getRequestId() + ", templateId=" + ec.getTemplateId() + ", toAddress=" + ec.getToAddress()
				+ ", yesId=" + ec.getYesId() + ", messageKeyValues=" + (ec.getMessageKeyValues().getMessage() != null ? ec.getMessageKeyValues().getMessage().toString() : null) + "]");
			*/	// ((BindingProvider)port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://yesservices.yes.my/ecservices/v1/EcNotificationService");
				// System.out.println("port after using Binding Provider:"+port1.toString());
				long timeTaken = System.currentTimeMillis();
				
				
				ExecutorService executorService = Executors.newFixedThreadPool(5);
				
				
				for (int i = 0; i < 5; i++) {
					executorService.submit(new WorkerT());
				}
				
				executorService.shutdown();
				
				/*LOGGER.info("Response [responseId=" + eNotificationResponse.getResponseId() + ", responseStatus=" + eNotificationResponse.isResponseStatus()
						+ ", responseDescription=" + eNotificationResponse.getResponseDescription() + "], totalTime [" + (System.currentTimeMillis() - timeTaken) + " ms]");
			*/
				
			} catch (Exception e) {
				System.out.println("In catch");
				e.printStackTrace();
				eNotificationResponse = new EcNotificationResponse();
				eNotificationResponse.setResponseStatus(false);
				eNotificationResponse.setResponseDescription("Not able to connect YTL CNP");
				eNotificationResponse.setResponseId("NOT_ABLE_CONNECT_YTLCNP");
			}
//			LOGGER.info("Notification Published Successfully");		}

		
	}
}



class WorkerT implements Runnable{

	@Override
	public void run() {
		URL url = null;
		String timeout = null;
		ClassLoader classLoader = null;
		Properties properties = null;	
		QName ecServicesQName = new QName("http://wsserver.demo.com/", "CnpNotificationService");
		EcNotificationResponse eNotificationResponse = null;

			try {
					url = new URL("http://localhost:8080/WebserviceDemo?wsdl");
					timeout = "30000";
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				CnpNotificationService service1 = new CnpNotificationService(url, ecServicesQName);
				CnpNotification port1 = service1.getCnpNotificationPort();
				System.out.println("Connected...");
				Map<String, Object> requestContext = ((BindingProvider) port1).getRequestContext();
				// // Set timeout params
				Integer timeOut = timeout == null ? 240000 : Integer.parseInt(timeout); // 4 minutes(< 5 minutes of default jboss timeout) by default if not set in property file
				requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, timeOut); // Timeout in millis
				requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, timeOut); // Timeout in millis
			/*	LOGGER.info("Request [requestId=" + ec.getRequestId() + ", templateId=" + ec.getTemplateId() + ", toAddress=" + ec.getToAddress()
				+ ", yesId=" + ec.getYesId() + ", messageKeyValues=" + (ec.getMessageKeyValues().getMessage() != null ? ec.getMessageKeyValues().getMessage().toString() : null) + "]");
			*/	// ((BindingProvider)port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://yesservices.yes.my/ecservices/v1/EcNotificationService");
				// System.out.println("port after using Binding Provider:"+port1.toString());
				long timeTaken = System.currentTimeMillis();
				System.out.println(port1.sendNotification());
				

				
				/*LOGGER.info("Response [responseId=" + eNotificationResponse.getResponseId() + ", responseStatus=" + eNotificationResponse.isResponseStatus()
						+ ", responseDescription=" + eNotificationResponse.getResponseDescription() + "], totalTime [" + (System.currentTimeMillis() - timeTaken) + " ms]");
			*/
				
			} catch (Exception e) {
				System.out.println("In catch");
				e.printStackTrace();
				eNotificationResponse = new EcNotificationResponse();
				eNotificationResponse.setResponseStatus(false);
				eNotificationResponse.setResponseDescription("Not able to connect YTL CNP");
				eNotificationResponse.setResponseId("NOT_ABLE_CONNECT_YTLCNP");
			}
		
	}
	
}