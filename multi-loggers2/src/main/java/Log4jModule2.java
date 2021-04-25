import org.apache.log4j.Logger;

public class Log4jModule2 {

    static Logger log = Logger.getLogger(Log4jModule2.class);

    public void call() {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
