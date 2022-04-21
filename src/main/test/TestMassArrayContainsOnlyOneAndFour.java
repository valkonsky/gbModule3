import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayContainsOnlyOneAndFour {

    public static Stream<Arguments> dataForСontainsOnlyFourAndOne(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1,1,1,4,4,1,4,4},true));
        list.add(Arguments.arguments(new int[]{1,1,1,1,1,1},false));
        list.add(Arguments.arguments(new int[]{4,4,4,4},false));
        list.add(Arguments.arguments(new int[]{1,4,4,1,1,4,3},false));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForСontainsOnlyFourAndOne")
    void massTestArrayContainsOnlyFourAndOne(int[] input,boolean flag){
        Assertions.assertEquals(flag, main.java.Main.arrayContainsOnlyFourAndOne(input));
    }

}
