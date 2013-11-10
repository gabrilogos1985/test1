package com.gps.git.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTest {

private Eclass eclass = new EClassImp();

	private final class EClassImp implements Eclass {
		@Override
		public boolean didIt() {
			return true;
		}
	}

	@Test
	public void test() {		
		assertTrue(eclass.didIt());
	}

}
