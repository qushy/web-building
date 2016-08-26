package com.github.emailtohl.building.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.ThreadContext;

/**
 * Servlet Filter implementation class PreSecurityLoggingFilter
 */
//@WebFilter("/*")
@SuppressWarnings("unused")
public class PreSecurityLoggingFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public PreSecurityLoggingFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String id = UUID.randomUUID().toString();
		ThreadContext.put("id", id);
		try {
			((HttpServletResponse) response).setHeader("Request-Id", id);
			chain.doFilter(request, response);
		} finally {
			ThreadContext.remove("id");
			ThreadContext.remove("username");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}