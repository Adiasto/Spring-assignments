package clairvoyant.spring.assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class App
{
    public static void main(String args[])
    {
     BeanFactory bean=new XmlBeanFactory(new FileSystemResource("bin.xml"));
        Hello hello=(Hello) bean.getBean("hello");
        System.out.print(hello.message);
    }
}
