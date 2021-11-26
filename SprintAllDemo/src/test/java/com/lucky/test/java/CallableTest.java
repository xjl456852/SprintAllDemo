package com.lucky.test.java;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {

	public Integer call() throws Exception {

		return new Integer(3);

	}

	public static void main(String[] args) throws Exception {
		Callable<Integer> test = new CallableTest();
		final Integer result = test.call();
		System.out.println(result);
		if (result != null) {
			FutureTask<Integer> f = new FutureTask<Integer>(
					new Callable<Integer>() {
						public Integer call() throws Exception {
							return result;
						}
					});
			f.run();

		}

	}

}
