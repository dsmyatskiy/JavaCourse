package sandbox;

import org.testng.*;
import org.testng.annotations.*;

import static sandbox.Point.*;

public class DistanceTest {

    @Test
    public void checkDistance() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(6, 1);

        assert distance(point1, point2) == 5;
    }

    @Test
    public void checkDistanceInZeroPoints() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        Assert.assertEquals(distance(point1, point2), 0);
    }
}
