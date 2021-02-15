package com.codewithmosh;

import java.util.Arrays;

public class Array {

    private int[] array;

    private int count;

    public Array(int length){

        this.array = new int[length];
    }

    public void insert(int value){

        if(count == array.length){
            resizeArray();
        }

        array[count++] = value;
    }

    private void resizeArray(){

        int[] arr2 = new int[count * 2];

        for(int i = 0; i < count; i++){
            arr2[i] = array[i];
        }
        this.array = arr2;
    }

    public void print(){

        for(int i =  0; i < count; i++){
            System.out.println(array[i]);
        }
    }

    public void removeAt(int index){

        //validate index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

       for(int i = index; i < count - 1; i++) {
           array[i] = array[i + 1];
       }

       count--;

    }

    public int indexOf(int searchKey){

       return Arrays.binarySearch(array, searchKey);

    }

    public int max(){

        //first implementation
//        return Arrays.stream(array).sorted().toArray()[count - 1]; //0(1)

        //second implementation
        int max = array[0];

        for(int i = 1; i < count; i++) //0(n)
            if(array[i] > max)
                max = array[i];

                return max;
    }

    public int[] intersect(int[] array2){

        int[] result = new int[count * 2];

        int p = 0;
        for(int r = 0; r < count; r++) //0(n2)
            for (int i : array2)
                if (array[r] == i)
                    result[p++] = array[r];


        return result;
    }

    public void reverse(){

        int[] reverse = new int[count];

        int y = 0;
        for(int i = count - 1; i >= 0; i --){
            reverse[y++] = array[i];
        }

        array = reverse;

    }

    public void insertAt(int item, int index){

        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        array[index] = item;
    }

    public int length(){
        return count;
    }

}
