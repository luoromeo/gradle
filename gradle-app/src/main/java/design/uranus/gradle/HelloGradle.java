package design.uranus.gradle;

import org.apache.log4j.Logger;

/**
 * @Author zhanghua.luo
 * @Description
 * @Date 2016/12/29 0029
 */
public class HelloGradle {
	private static final Logger LOGGER = Logger.getLogger(HelloGradle.class);

	public static void main(String[] args) {
		MessageService messageService = new MessageService();

		String message = messageService.getMessage();
		LOGGER.info("Received message: " + message);
	}
}
