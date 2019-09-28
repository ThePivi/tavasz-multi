import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerExampleTest {

    @Test
    void logSomethingTest () {
        LoggerExample loggerExample = new LoggerExample();

        Assertions.assertEquals("done", loggerExample.allLogs());
    }

}
