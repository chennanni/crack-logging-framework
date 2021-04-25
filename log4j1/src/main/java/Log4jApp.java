import org.apache.log4j.Logger;

public class Log4jApp {

    static Logger log = Logger.getLogger(Log4jApp.class);
    public static void main(String[] args) {
        log.debug("Debug");
        log.info("Info");
        log.error("Error");
    }

}
