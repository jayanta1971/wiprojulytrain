package com.wipro.servdemo.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/login")
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		String country=req.getParameter("country");
		if(country.equalsIgnoreCase("cnt1"))
		{
			return;
		}
		else {
			System.out.println("--Filter---");
			chain.doFilter(req, res);
		}
		
	}

}
