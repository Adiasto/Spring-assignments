

import clairvoyant.spring.assignments.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
    ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    Hello hello=(Hello) context.getBean("hello");
    hello.setMessage("Contents of Hello's Singleton bean");
    System.out.println(hello.getMessage());
    Hello hello2=(Hello) context.getBean("hello");
    System.out.println(hello.getMessage());

    }
}
