import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2Module {

    static Logger log = LogManager.getLogger(Log4j2Module.class);

    public void call() {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
