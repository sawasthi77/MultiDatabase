package com.multiDatabase.jpa.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;


public class LoggingInterceptors implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptors.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        logger.info("Incoming request from URL", request.getRequestURI());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        // Log response details after the controller has processed the request
        logger.info("Response status: {}", response.getStatus());
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Log information after request completion
        if (ex != null) {
            logger.error("Request resulted in exception: ", ex);
        }
        logger.info("Request completed: URL = {}, Method = {}", request.getRequestURL(), request.getMethod());
    }
}
