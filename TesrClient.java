package springcoreex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesrClient {
  public static void main(String[] args) {
    // start the container
    ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
    // get the object
    Emp e = (Emp) appContext.getBean("emp");
    e.info();
    Student s = (Student) appContext.getBean("stu");
         s.stuInfo();
  }

}
