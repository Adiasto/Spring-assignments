import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello = context.getBean(Hello.class);
        System.out.print(hello.message);
    }
}
