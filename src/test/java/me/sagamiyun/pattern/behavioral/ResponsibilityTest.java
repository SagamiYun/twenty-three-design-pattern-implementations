package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.responsibility.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author SagamiYun
 * <p>@ClassName ResponsibilityTest</p>
 * <p>@Description 责任链模式测试类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class ResponsibilityTest {

    @Test
    public void testResponsibility(){
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Level.INFO, "This is an information.");
        loggerChain.logMessage(Level.WARNING, "This is a warning level message.");
        loggerChain.logMessage(Level.ERROR, "This is an error information.");
    }

    @Test
    public void testChainOfResponsibility() {
        Logger loggerChain = ResponsibilityTest.getChainOfLoggers();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        loggerChain.logMessage(Level.INFO, "This is an information.");
        assertTrue(outContent.toString().contains("Standard Console::Logger: This is an information."));

        outContent.reset();

        loggerChain.logMessage(Level.WARNING, "This is a warning level message.");
        assertTrue(outContent.toString().contains("File::Logger: This is a warning level message."));
        assertTrue(outContent.toString().contains("Standard Console::Logger: This is a warning level message."));

        outContent.reset();

        loggerChain.logMessage(Level.ERROR, "This is an error information.");
        assertTrue(outContent.toString().contains("Error Console::Logger: This is an error information."));
        assertTrue(outContent.toString().contains("File::Logger: This is an error information."));
        assertTrue(outContent.toString().contains("Standard Console::Logger: This is an error information."));
    }


    /*
     * 按照日志级别的顺序（Info < Warning < Error）将这些记录器链接起来
     */
    private static Logger getChainOfLoggers(){

        Logger errorLogger = new ErrorLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.WARNING);
        Logger consoleLogger = new ConsoleLogger(Level.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
