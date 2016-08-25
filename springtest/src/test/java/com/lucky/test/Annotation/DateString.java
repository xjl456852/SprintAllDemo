package com.lucky.test.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@CustomerValidator
/*
 * @Target是用来定义该注解将可以应用在什么地方 FIELD表示该注解应用在一个属性上
 * 
 * @Rectetion 用来定义该注解在哪一个级别可以使用 RUNTIME表示运行时
 */
public @interface DateString {

	String pattern() default "yyyy-MM-dd HH:mm:ss";

	String errorCode() default "must date";

	String message() default "must be date pattern";

}
