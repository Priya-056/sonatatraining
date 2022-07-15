package com.sonata.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class EmployeeInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception
	{
		System.out.println("prehandle method");
		return false;
	}
	public void postHandle(HttpServletRequest request, HttpServletResponse response,Object handler,@Nullable ModelAndView modelAndView)throws Exception
	{
		System.out.println("posthandle method");
	}
	
     
     public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,@Nullable Exception ex)throws Exception
     {
    	 System.out.println("aftercompletion method");
     }
	

}
