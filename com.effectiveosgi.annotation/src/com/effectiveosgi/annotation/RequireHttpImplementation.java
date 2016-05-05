package com.effectiveosgi.annotation;

import java.lang.annotation.*;

import org.osgi.namespace.implementation.ImplementationNamespace;

import aQute.bnd.annotation.headers.RequireCapability;

@RequireCapability(
		ns = ImplementationNamespace.IMPLEMENTATION_NAMESPACE,
		filter = "(&(" + ImplementationNamespace.IMPLEMENTATION_NAMESPACE + "=" + RequireHttpImplementation.HTTP_SPECIFICATION_NAME + ")"
				+"${frange;${version;==;" + RequireHttpImplementation.HTTP_SPECIFICATION_VERSION + "}})"
		)
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface RequireHttpImplementation {

	public static String HTTP_SPECIFICATION_NAME = "osgi.http";

	public static String HTTP_SPECIFICATION_VERSION = "1.0.0";

}