package pl.patryk.app.taskometr.testdata;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoaderConfig {

    @Bean
    public Faker faker() {
        return new Faker();
    }
}
