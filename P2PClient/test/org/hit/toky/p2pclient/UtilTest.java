package org.hit.toky.p2pclient;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.hit.toky.p2pclient.*;

/**
 * @author 	 tokysky (HIT-CS-ICES) 
 * @time	  于2015年7月3日上午10:35:46
 *
 * @description 
 **/

public class UtilTest {

	private static String filePath;
	Util util = new Util();
	/**
	 * @description
	 * @throws java.lang.Exception void
	 * 
	 */
	@Before
	public void setUp() throws Exception {
		filePath = ".\\test.txt";
	}

	/**
	 * {@link org.hit.toky.p2pclient.Util#getFileLength(java.lang.String)} 的测试方法。
	 */
	@Test
	public void testGetFileLengthString() {
		assertEquals("3718", util.getFileLength(".\\test.txt"));
	}

	/**
	 * {@link org.hit.toky.p2pclient.Util#getFileLength(long)} 的测试方法。
	 */
	@Test
	public void testGetFileLengthLong() {
		assertEquals("3.63KB", util.getFileLength(util.getFileLength(".\\test.txt")));
	}

	/**
	 * {@link org.hit.toky.p2pclient.Util#RegMatcher(java.lang.String, java.lang.String)} 的测试方法。
	 */
	@Test
	public void testRegMatcher() {
		fail("尚未实现");
	}

	/**
	 * {@link org.hit.toky.p2pclient.Util#IntToByte(int)} 的测试方法。
	 */
	@Test
	public void testIntToByte() {
		fail("尚未实现");
	}

	/**
	 * {@link org.hit.toky.p2pclient.Util#ByteToInt(byte[])} 的测试方法。
	 */
	@Test
	public void testByteToInt() {
		fail("尚未实现");
	}

}
