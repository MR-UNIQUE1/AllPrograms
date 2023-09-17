package objects;
import org.apache.logging.log4j.*;

import demo.gg;
public class LoggerDemo extends gg {
		public static void main(String[] args) {
		Logger log = LogManager.getLogger(LoggerDemo.class.getName());
	}

}
