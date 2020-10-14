//Questions 2:
//Create an int array with 5 values and print only odd values.

package com.company;
public class Main {

    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=11;
        arr[1]=22;
        arr[2]=31;
        arr[3]=53;
        arr[4]=67;
        System.out.println("Odd number are as follows:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}