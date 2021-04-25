import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jModule2 {

    private static final Logger log = LoggerFactory.getLogger(Slf4jModule2.class);

    public void call() {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
