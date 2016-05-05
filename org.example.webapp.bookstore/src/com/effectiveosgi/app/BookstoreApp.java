package com.effectiveosgi.app;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import com.effectiveosgi.annotation.*;

@Component(
		property = {
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + "=/www",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + "=/bookstore/*"
		})
@RequireWebComponent(name = "cart-list")
@RequireHttpImplementation
public class BookstoreApp extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

}