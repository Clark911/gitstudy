package oobss;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!   cv
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.logzTest("你好！");
    }

    public void logzTest (String message){
        Logger logger = LogManager.getLogger(App.class);
        logger.warn(message);
    }
}
