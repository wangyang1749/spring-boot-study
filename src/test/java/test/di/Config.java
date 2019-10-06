package test.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class Config {
    @Bean("B")
    @Profile("prod")
    public B2 b2(){
        return new B2();
    }
}
