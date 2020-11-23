/**
 * 
 */
package com.liberty;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author swanandm
 *
 */
public class Test1 {
	
	@Test
	@DisplayName("T1-T1")
	public void test1() {
		assertTrue(Core.isSuccess(), "Failed at test4");
	}
	
	@Test
	@DisplayName("T1-T2")
	public void test2() {
		assertTrue(Core.isSuccess(), "Failed at test4");
	}
	
	@Test
	@DisplayName("T1-T3")
	public void test3() {
		assertTrue(Core.isSuccess(), "Failed at test4");
	}
		
	@Test
	@DisplayName("T1-T4")
	public void test4() {
		assertTrue(Core.isSuccess(), "Failed at test4");
	}

}
