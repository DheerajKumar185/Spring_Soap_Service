package com.tech.doks.spring.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.tech.doks.spring.soap.HelloWorld;

@WebService
public class HelloWorldWS{

	//DI via Spring
		HelloWorld helloWorldBo;

		@WebMethod(exclude=true)
		public void setHelloWorldBo(HelloWorld helloWorldBo) {
			this.helloWorldBo = helloWorldBo;
		}

		@WebMethod(operationName="getHelloWorld")
		public String getHelloWorld() {
			
			return helloWorldBo.getHelloWorld();
			
		}
 
}