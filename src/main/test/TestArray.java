import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {

    @Test
    void test1arrayAfterFour(){
        int[] input  = new int[]{1,3,4,5,5,6,8};
        int[] output  = new int[]{5,5,6,8};
        Assertions.assertArrayEquals(output, main.java.Main.arrayAfterFour(input));
    }

    @Test
    void test2arrayAfterFour(){
        int[] input  = new int[]{1,3,5,5,6,8};
        Assertions.assertThrows(RuntimeException.class,()->{
            main.java.Main.arrayAfterFour(input);
        });
    }

    @Test
    void test1arrayContainsOnlyOneAndFour(){
        int[] input  = new int[]{1,3,4,5};
        Assertions.assertFalse(main.java.Main.arrayContainsOnlyFourAndOne(input));
    }

    @Test
    void test2arrayContainsOnlyOneAndFour(){
        int[] input  = new int[]{1,4,1};
        Assertions.assertTrue(main.java.Main.arrayContainsOnlyFourAndOne(input));
    }
}
