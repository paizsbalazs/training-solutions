package week13d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {


    @Test
    public void TestCreate() {

        City city = new City();
        System.out.println(city.getLongestNameCity());


    }

}