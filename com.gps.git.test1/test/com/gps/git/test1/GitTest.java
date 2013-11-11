package com.gps.git.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTest {
	private static final String PREFIX_MSG="Data: ";
    private Eclass eclass = new EClassImp();
	private final class EClassImp implements Eclass {
		@Override
		public boolean didIt() {
			return true;
		}

		public void setTimer(final int timer, final boolean data) {
			System.out.println(PREFIX_MSG + timer + data);
		}
	}

	@Test
	public void test() {
		assertTrue(eclass.didIt());
		new EClassImp().setTimer(-3,true);;
		((EClassImp)eclass).setTimer(10,true);
	}

}
