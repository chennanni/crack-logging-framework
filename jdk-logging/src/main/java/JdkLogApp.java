import java.util.logging.Logger;

public class JdkLogApp {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("JdkLogApp - Info");
        logger.warning("JdkLogApp - Warn");
        logger.severe("JdkLogApp - Severe");
    }
}