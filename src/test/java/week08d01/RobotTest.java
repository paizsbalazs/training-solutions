package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void RobotTestCreate() {

        Robot robot = new Robot();
        //System.out.println(robot.move("FFFFFFFFFFLLLLLLLLLJBBBBB"));
        assertEquals("x: -4 y: 1", robot.move("FFFFFFFFFFLLLLLLLLLJBBBBB"));
    }
}
