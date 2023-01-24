package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLogger(){
        logger = Logger.INSTANCE;
        logger.log("Singleton");
    }

    @Test
    void testLogger(){
        //When
        String result = logger.getLastLog();

        //Then
        Assertions.assertEquals("Singleton", result);
    }
}