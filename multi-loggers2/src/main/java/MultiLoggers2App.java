public class MultiLoggers2App {

    public static void main(String[] args) {
        Log4j2Module2 m1 = new Log4j2Module2();
        Log4jModule2 m2 = new Log4jModule2();
        Slf4jModule2 m3 = new Slf4jModule2();
        m1.call();
        m2.call();
        m3.call();
    }

}
