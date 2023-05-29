package test;

import org.apache.log4j.Logger;

/**
 * 
 * @author zam
 * 
 * @2020年4月18日
 * 
 */
public class LogsTest {

	private static Logger logger = Logger.getLogger(LogsTest.class);

	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		// System.out.println("This is println message.");

		// 记录debug级别的信息

		logger.debug("This is debug message.666");

		// 记录info级别的信息

		logger.info("This is info message.");

		// 记录error级别的信息

		logger.error("This is error message.");

	}

}