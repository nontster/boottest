package co.nontster.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTestApplicationTests {

	@MockBean
	private SomeService mockedSomeService;
	
	 
	@Test
	public void testSomeMethod() {
		when(mockedSomeService.call()).thenReturn("called");
		
		MyComponent component = new MyComponent(mockedSomeService);
		
		assertNotNull(component);
		assertThat(component.call(), is("called"));
	}

}
