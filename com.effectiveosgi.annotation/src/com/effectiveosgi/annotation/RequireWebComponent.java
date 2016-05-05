package com.effectiveosgi.annotation;

import java.lang.annotation.*;

import aQute.bnd.annotation.headers.RequireCapability;

@RequireCapability(
		ns = "com.effectiveosgi.webcomponent",
		filter = "(com.effectiveosgi.webcomponent=${name})",
		effective = "active"
		)
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface RequireWebComponent {
	String name();
}
