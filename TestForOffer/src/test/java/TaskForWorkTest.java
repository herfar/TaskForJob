import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TaskForWorkTest {

    @Test
    void calculate() {
        TaskForWork taskForWork = new TaskForWork();
        int [] arr = new int[] {1, 1, 1, 0, 3, 3, 4};
        HashMap<Integer, Integer> actual = taskForWork.calculate(arr);
        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 3);
        expected.put(0, 1);
        expected.put(3, 2);
        expected.put(4, 1);
        assertEquals(expected, actual);
    }
}