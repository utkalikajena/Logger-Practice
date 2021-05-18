package com.bridgelabz.login;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerDemo {
	
	private static Logger logger = Logger.getLogger(LoggerDemo.class);
    public static void main(String aegs[]) {
    	System.out.println("hii");
    	Layout layout = new PatternLayout("%d %m %n");
    	try {
    	Appender appender = new FileAppender(layout,"log4j.log");
    	
    	logger.addAppender(appender);
    	
    	logger.debug("debug message");
    	logger.info("info message");
    	logger.warn("warn message");
    	logger.error("error message");
        logger.fatal("fatal message");  
        demo1();
        demo2();
        demo3();
        appender.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public static void demo1() {
    	logger.debug("debug message");
    	logger.info("info message");
    }
    public static void demo2() {
    	logger.debug("debug message");
    	logger.info("info message");
    }
    public static void demo3() {
    	logger.debug("debug message");
    	logger.info("info message");
    }
}
