package week07d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListTest {

    @Test
    public void CreateNumberListTest() {

        NumberList numberList = new NumberList();
        System.out.println(numberList.isIncreasing(Arrays.asList(1,2,3,4)));

    }
}
