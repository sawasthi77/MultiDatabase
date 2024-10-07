package com.multiDatabase.jpa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(com.multiDatabase.jpa.annotation)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - startTime;

        logger.info("{} executed in {} ms", joinPoint.getSignature(), executionTime);

        return proceed;
    }
}
