import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
    private static Logger logger;
    protected int num = 1;
    Calendar calendar = new GregorianCalendar();
    DateFormat df = new SimpleDateFormat("dd.MM.yyy HH:mm:ss ");

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + df.format(calendar.getTime()) + num++ + "] " + msg);
    }
}
