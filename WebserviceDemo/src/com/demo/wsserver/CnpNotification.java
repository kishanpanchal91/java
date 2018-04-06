package com.demo.wsserver;

import javax.jws.WebService;

import my.yes.ecservices.EcNotificationRequest;
import my.yes.ecservices.EcNotificationResponse;

@WebService
public class CnpNotification {

	public EcNotificationResponse sendNotification(EcNotificationRequest ec) {
		
		EcNotificationResponse response=null;
		System.out.println("Inside Webservice method"+System.currentTimeMillis());
		try {
			Thread.sleep(180000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response;
	}
}
