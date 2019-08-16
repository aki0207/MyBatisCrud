package spring.test;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldTest {
	public static void main(String[] args) {



		ApplicationContext context = new FileSystemXmlApplicationContext(
				"file:/Users/nagami/Documents/workspace-sts-ver2/MyBatis/WebContent/WEB-INF/SpringTest.xml");

		SpringBean bean = (SpringBean) context.getBean("helloWorld");
		bean.show();
	}
}