package com.tns.classsessions.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		Testing t = new Testing();
		int output = t.countA("PAVAN");
		assertEquals(2,output);
		
	}

}
