import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonLogApp {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonLogApp.class);
        log.debug("CommonLogApp - Debug");
        log.info("CommonLogApp - Info");
        log.error("CommonLogApp - Error");
    }
}