package com.liberty;

import java.util.Random;

public class Core {
	
	private static Random random = new Random();
	
	public static boolean isSuccess() {
		int value = random.nextInt(100);
		return value <= 1 ? false : true;
	}

}
