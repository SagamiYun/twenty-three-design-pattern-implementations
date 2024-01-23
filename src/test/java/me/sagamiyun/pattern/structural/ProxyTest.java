package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.proxy.DatabaseService;
import me.sagamiyun.pattern.structural.proxy.ProxyDatabaseService;
import me.sagamiyun.pattern.structural.proxy.RealDatabaseService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author SagamiYun
 * <p>@ClassName ProxyTest</p>
 * <p>@Description 代理模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class ProxyTest {
    @Test
    public void testQuery() {
        DatabaseService realDatabaseService = new RealDatabaseService();
        DatabaseService proxyDatabaseService = new ProxyDatabaseService(realDatabaseService);

        // Capture the standard output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String testSql = "SELECT * FROM users";
        proxyDatabaseService.query(testSql);

        String expectedOutput = "Log: " + testSql + "\r\n" + "Executing query: " + testSql + "\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
