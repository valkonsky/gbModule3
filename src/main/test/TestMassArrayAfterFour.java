import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayAfterFour {

    public static Stream<Arguments> dataForArray4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{ 1,2,4,4,2,3,4,1,7},new int[]{1,7}));
        list.add(Arguments.arguments(new int[]{1,2,4,4,2,4},new int[]{}));
        list.add(Arguments.arguments(new int[]{1,2,4,4,1,7,5,6,1},new int[]{1,7,5,6,1}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForArray4")
    public void massTestArrayAfterFour(int[] input, int[] output){
        Assertions.assertArrayEquals(output, main.java.Main.arrayAfterFour(input));
    }
}
