import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloConfig {
    @Bean
    @Scope("prototype")
    public Hello hello(){
        return new Hello();
    }
}
