package Assignment11_4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Assignment11_4.MaximumElementInArrayList.max;
import static org.junit.jupiter.api.Assertions.*;

class MaximumElementInArrayListTest {

    @Test
    void testMax() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 3);
        list.add(1, 343);
        list.add(2, 8);
        list.add(3, 12);
        list.add(4, 2);
        assertEquals(343, max(list));
    }
}