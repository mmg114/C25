import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase10 {


    private static final Logger logger = Logger.getLogger(Clase10.class.getName());

    public static void main(String[] args) {

            logger.setLevel(Level.OFF);


        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);


        //log
        System.out.println("Esto es un log de info");
        logger.info("Esto es un log de info");
        logger.severe("esto es un server");


    }
}
