import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2App {

    static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
