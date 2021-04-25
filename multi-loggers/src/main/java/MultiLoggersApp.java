public class MultiLoggersApp {

    public static void main(String[] args) {
        Log4j2Module m1 = new Log4j2Module();
        Log4jModule m2 = new Log4jModule();
        Slf4jModule m3 = new Slf4jModule();
        m1.call();
        m2.call();
        m3.call();
    }

}
