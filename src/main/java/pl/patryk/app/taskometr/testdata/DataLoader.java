package pl.patryk.app.taskometr.testdata;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final Faker faker;

    @Override
    public void run(String... args) throws Exception {

    }
}
