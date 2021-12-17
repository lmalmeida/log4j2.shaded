package lmalmeida;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Log4j2Test
{
    public static void main( String[] args )
    {

        Logger logger = LogManager.getLogger();
        logger.error("Hello World");
    }
}
