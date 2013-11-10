package com.gps.git.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTest {

	@Test
	public void test() {
		Eclass eclass = new Eclass() {
			
			@Override
			public boolean didIt() {
				return false;
			}
		};
		assertTrue(eclass.didIt());
	}

}
