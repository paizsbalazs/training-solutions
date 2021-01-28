package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    @Test
    public void TestCreate() {

        TemplateMerger templateMerger = new TemplateMerger();
        Employee e1 = new Employee("Tibor", 1983);
        Employee e2 = new Employee("Balazs", 1976);
        List<Employee> es = new ArrayList<>();
        es.add(e1);
        es.add(e2);
        Path path = Path.of("employee.txt");
        System.out.println(templateMerger.merge(path, es));

    }

}