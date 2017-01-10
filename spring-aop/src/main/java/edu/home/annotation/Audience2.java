package edu.home.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {

    @Pointcut("execution(* edu.home.annotation.Performer2.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("@Before:The audience is taking their seats.....");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("@Before:The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("@AfterReturning:CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("@AfterThrowing:Boo! We want our money back!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("@Around:***The audience is taking their seats***");
            System.out.println("@Around:***The audience is turning off their cellphones***");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("@Around:***CLAP CLAP CLAP CLAP CLAP***");
            System.out.println("@Around:***The performance took:" + (end - start) + " milliseconds***");
        }
        catch (Throwable e) {
            System.out.println("@Around:***Boo! We want our money back***!");
        }
    }
}
