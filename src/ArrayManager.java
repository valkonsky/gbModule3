import java.util.ArrayList;
import java.util.Arrays;

public class ArrayManager<T> {
    public T[] getArr() {
        return arr;
    }

    private T[] arr;

    void swap(T[]arr,int firstPosition, int secondPosition){
        this.arr = arr;
        T toFirst = arr[secondPosition];
        T toSecond = arr[firstPosition];
        arr[firstPosition] = toFirst;
        arr[secondPosition] = toSecond;
    }

    ArrayList<T> changeToArrayList(T[]arr){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }


}
