package week12d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    public void TestNumberStatCreate() {

        NumberStat numberStat = new NumberStat(List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4));
        System.out.println(numberStat.getOne());

    }

}