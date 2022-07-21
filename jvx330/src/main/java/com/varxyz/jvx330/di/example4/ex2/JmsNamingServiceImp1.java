package com.varxyz.jvx330.di.example4.ex2;

public class JmsNamingServiceImp1 implements NamingService{

	@Override
	public Object lookup(String name) {
		return "JMS: " + name;
	}
}
