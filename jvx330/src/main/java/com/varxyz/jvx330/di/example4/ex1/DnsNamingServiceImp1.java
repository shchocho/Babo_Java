package com.varxyz.jvx330.di.example4.ex1;

public class DnsNamingServiceImp1 implements NamingService{
	@Override
	public Object lookup(String name) {
		return "DNS: " + name;
	}
}
