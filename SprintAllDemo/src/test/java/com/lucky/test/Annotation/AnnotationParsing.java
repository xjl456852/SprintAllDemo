package com.lucky.test.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.springframework.asm.commons.TryCatchBlockSorter;

public class AnnotationParsing {

	public static void main(String[] args) {
		try {
			for (Method method : AnnotationParsing.class.getClassLoader()
					.loadClass("com.lucky.test.Annotation.AnnotationTest").getMethods()) {
				if (method.isAnnotationPresent(MethodInfo.class)) {
					try {
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '"
									+ method + "' : " + anno);
						}
						MethodInfo methodAnno = method
								.getAnnotation(MethodInfo.class);
						if (methodAnno.version()== 1) {
							System.out.println("Method with revision no 1 = "
									+ method);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
