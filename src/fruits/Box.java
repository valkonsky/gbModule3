package fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public float getBoxWeight(){
     float result=0f;
     for (Fruit fruit : fruits) {
         result+=fruit.getWeight();
     }
     return result;
 }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public void addAll(T...  fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public int size(){
        return fruits.size();
    }

    public boolean compare(Box<?extends Fruit> box){
        if (this.getBoxWeight()!=box.getBoxWeight()){
            return false;
        }else{
            return true;
        }
    }

    public void replace(Box<T> box){
        this.fruits.addAll(box.fruits);
    }

}
