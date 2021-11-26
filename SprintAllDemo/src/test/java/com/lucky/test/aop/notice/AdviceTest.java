package com.lucky.test.aop.notice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 切面，通知的类
 */
public class AdviceTest {

	public void adviceTest(JoinPoint joinPoint) {
		System.out.println("参数一共有" + joinPoint.getArgs().length + "个");
		int i = 0;
		for (Object object : joinPoint.getArgs()) {

			System.out.println("第" + i + "个参数是:" + joinPoint.getArgs()[i]);
			i++;
		}
		System.out.println("我是aop，我进去了");
	}

	public Object adviceTest2(ProceedingJoinPoint joinPoint) throws Throwable {

		try {
			System.out.println(joinPoint.getArgs().toString());
			System.out.println(joinPoint.getClass().getName());
			System.out.println(joinPoint.getKind().toString());
			System.out.println(joinPoint.getSignature().getDeclaringTypeName()
					.toString());
			System.out.println(joinPoint.getSourceLocation().toString());
			System.out.println("调用的方法是：" + joinPoint.getSignature().getName());
			System.out.println("调用的类是："
					+ joinPoint.getTarget().getClass().getName());
			System.out.println("日志开始时间");
			return joinPoint.proceed(joinPoint.getArgs());
		} catch (Exception e) {
			throw e;
		} finally {
			System.out.println("日志结束时间");
		}

	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"test-aop.xml");
		ctx.start();
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.sayHello("你好吗");
	}
}
