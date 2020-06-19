package com.dejim;

import java.util.Random;

public class HelloMule {

	public static void main(String[] args) {
		String str = "Hello Mule!";		
		System.out.println(str);
	}
	
	public static String helloWho(String who) {
		return who + new Random().nextInt();
	}

}
