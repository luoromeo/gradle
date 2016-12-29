package design.uranus.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author zhanghua.luo
 * @Description
 * @Date 2016/12/29 0029
 */
public class MessageServiceTest {
	private MessageService messageService;

	@Before
	public void setUp() {
		messageService = new MessageService();
	}

	@Test
	public void getMessage_ShouldReturnMessage() {
		assertEquals("Hello World!", messageService.getMessage());
	}
}
