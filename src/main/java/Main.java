package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] arrayAfterFour(int arr[]){
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]==4){
                return Arrays.copyOfRange(arr,i+1,arr.length);
            }
        }
        throw new RuntimeException("Array not have value = 4");
    }

    public static boolean arrayContainsOnlyFourAndOne(int[] arr){
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]!=1)&&(arr[i]!=4)){
                return false;
            }
            if (arr[i]==1){
                hasOne = true;
            }

            if (arr[i]==4){
                hasFour = true;
            }
        }
        return hasOne && hasFour;
    }
}
