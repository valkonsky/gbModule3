import fruits.Apple;
import fruits.Box;
import fruits.Orange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayManager<Integer> arrayManager = new ArrayManager<>();
        Integer[] arr = new Integer[]{4,234,234,2,345,34,12,5,32,4234,2,34,234,23,4};
        arrayManager.swap(arr,1,3);
        for (int i = 0; i < arrayManager.getArr().length; i++) {
            System.out.print(arrayManager.getArr()[i] + " ");
        }
        System.out.println(" ");

        System.out.println("-------------------");


        ArrayManager<String> arrayManager2 = new ArrayManager<>();
        String[] arr2 = new String[]{"a","b","c","d","e","f"};
        arrayManager2.swap(arr2,1,3);
        for (int i = 0; i < arrayManager2.getArr().length; i++) {
            System.out.print(arrayManager2.getArr()[i] + " ");
        }

        ArrayList<Integer> arrCopy;
        arrCopy = arrayManager.changeToArrayList(arr);
        System.out.println(arrCopy);


        //----------


        Apple apple1 = new Apple();
        Apple apple2= new Apple();
        Apple apple3= new Apple();
        Apple apple4= new Apple();
        Apple apple5= new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addAll(apple1,apple2,apple3,apple4,apple5);
        appleBox2.addAll(apple1,apple2,apple3,apple4,apple5);
        orangeBox.addAll(orange1,orange2,orange3,orange4,orange5);
        //System.out.println(appleBox.getBoxWeight());
        //System.out.println(orangeBox.getBoxWeight());
        System.out.println(appleBox.compare(appleBox2));

        appleBox.replace(appleBox2);
        System.out.println(appleBox.size());
    }
}
