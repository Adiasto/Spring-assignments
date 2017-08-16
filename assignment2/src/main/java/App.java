

import clairvoyant.spring.assignment.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
    ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    Hello hello=(Hello) context.getBean("hello");
    System.out.print(hello.message);
    }
}