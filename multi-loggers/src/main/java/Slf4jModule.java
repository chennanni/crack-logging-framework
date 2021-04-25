import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jModule {

    private static final Logger log = LoggerFactory.getLogger(Slf4jModule.class);

    public void call() {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
