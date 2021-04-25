import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j2LogbackApp {

    private static final Logger logger = LoggerFactory.getLogger(Slf4j2LogbackApp.class);

    public static void main(String[] args) {
        logger.debug("Debug");
        logger.info("Info");
        logger.error("Error");
    }

}
