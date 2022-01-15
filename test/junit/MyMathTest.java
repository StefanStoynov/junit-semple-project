package junit;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    MyMath myMath;

    @BeforeClass
    public static void setup() {
        System.out.println("Before Class");
    }

    @BeforeEach
    private void initEach() {
        myMath = new MyMath();
        System.out.println("test");
    }


    @Test
    public void testWithTreeNumbers() {
        int result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, myMath.sum(new int[]{}));
    }


    @Test
    public void testTwoArraysEquals() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        assertArrayEquals(arr1, arr2);
    }
}