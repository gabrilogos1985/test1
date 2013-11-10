package com.gps.git.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTest {

	private final class EClassImp implements Eclass {
		@Override
		public boolean didIt() {
			return true;
		}
		
		public void setTimer(int timer){
			
		}
	}

	@Test
	public void test() {
		Eclass eclass = new EClassImp();
		
		assertTrue(eclass.didIt());
	}

}
