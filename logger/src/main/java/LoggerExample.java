import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LoggerExample {

    private final static Logger LOGGER = LoggerFactory.getLogger(LoggerExample.class);

    String allLogs () {
        LOGGER.info("Ínfó");
        LOGGER.debug("DeBug");
        LOGGER.trace("TrAce");
        LOGGER.warn("WarnIng");
        LOGGER.error("ERror");

        return "done";
    }

}
