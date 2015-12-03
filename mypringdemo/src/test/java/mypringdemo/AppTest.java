package mypringdemo;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import mypringdemo.app.App;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue( true );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static TestSuite suite() {
		return new TestSuite(App.class);
	}

}
