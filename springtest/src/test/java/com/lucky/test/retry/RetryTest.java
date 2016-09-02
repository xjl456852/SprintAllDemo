package com.lucky.test.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//关于调用失败重试的例子
public class RetryTest {

	private static final Logger log = LoggerFactory.getLogger(RetryTest.class);

	public String retry(int retryTimes, int sleepSeconds) throws Exception {
		int cur_time = 0;
		for (; cur_time < retryTimes; ++cur_time) {
			try {
				// 做自己的业务逻辑
				return "";
			} catch (Exception e) {
				// 失败的话，会再次循环，这里需要暂停一会
				log.warn("cannot reach, will retry" + cur_time + "...."
						+ e.toString());
				try {
					Thread.sleep(sleepSeconds * 1000);
				} catch (InterruptedException e2) {
				}
			}
		}
		
		

		log.warn("finally failed");
		throw new Exception();

	}
}
