package com.java.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sample {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is the before condition");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is the after condition ");
	}

	@Test
	void test() {
		System.out.println("This is the 1 test cases ");
	}
	@Test 
	void Test1 () {
		System.out.println("This is the 2 test cases");
	}

}
