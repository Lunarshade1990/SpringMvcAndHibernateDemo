package com.lunarshade.customertracker.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private static Logger log = Logger.getLogger(CRMLoggingAspect.class.getName());

    @Pointcut("execution(* com.lunarshade.customertracker.controller.*.*(..))")
    private void forControllerPackage() {}

    @Pointcut("execution(* com.lunarshade.customertracker.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.lunarshade.customertracker.dao.*.*(..))")
    private void forDaoPackage() {}

    @Pointcut("forDaoPackage() || forControllerPackage() || forServicePackage()")
    private void forAppFlow() {}

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        log.info("@Before: calling method: " + method);
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg->log.info(arg.toString()));
    }

    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String method = joinPoint.getSignature().toShortString();
        log.info("@AfterReturning: calling method: " + method);
        log.info("Result: " + result);
    }
}
