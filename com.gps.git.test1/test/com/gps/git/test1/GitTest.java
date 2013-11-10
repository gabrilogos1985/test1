package com.gps.git.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTest {

	private final class EClassImp implements Eclass {
		@Override
		public boolean didIt() {
			return true;
		}
		public void setTimer(final int timer, final boolean data){
			
		}
	}

	@Test
	public void test() {
		Eclass eclass = new EClassImp();
		
		assertTrue(eclass.didIt());
	}

}
