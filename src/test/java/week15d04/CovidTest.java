package week15d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CovidTest {

    @Test
    void getHighestInHungary() {

        Path path = Path.of("data.csv");

        Covid covid = new Covid();

        System.out.println(covid.readFromFile(path));

    }
}