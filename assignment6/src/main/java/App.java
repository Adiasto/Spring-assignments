import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello = context.getBean(Hello.class);
        hello.setMessage("Contents of Hello's Singleton bean");
        System.out.println(hello.getMessage());

        Hello hello2 = context.getBean(Hello.class);
        System.out.println(hello2.getMessage());
    }
}
