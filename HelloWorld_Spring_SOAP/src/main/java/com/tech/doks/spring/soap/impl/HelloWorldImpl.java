package com.tech.doks.spring.soap.impl;

import com.tech.doks.spring.soap.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	public String getHelloWorld(){
		return "JAX-WS + Spring!";
	}
	
}