package com.demo.wsserver;

import javax.xml.ws.Endpoint;

public class RunService {

	public static void main(String[] args) {
        
		  System.out.println("Web Service started.");
		  Endpoint.publish("http://localhost:8080/WebserviceDemo", new CnpNotification());
	 		//  Endpoint.publish("http://"+args[0]+":8080/WebserviceDemo", new CnpNotification());

		 }
}
