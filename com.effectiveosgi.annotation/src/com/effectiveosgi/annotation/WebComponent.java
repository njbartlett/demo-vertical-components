package com.effectiveosgi.annotation;

import java.lang.annotation.*;

import aQute.bnd.annotation.headers.*;

@ProvideCapability(ns = "com.effectiveosgi.webcomponent")
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface WebComponent {
	String name();
	String version() default "0.0.0";
}
