import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j2Log4j2App {

    private static final Logger logger = LoggerFactory.getLogger(Slf4j2Log4j2App.class);

    public static void main(String[] args) {
        logger.debug("Debug");
        logger.warn("warn");
        logger.error("Error");
    }

}
