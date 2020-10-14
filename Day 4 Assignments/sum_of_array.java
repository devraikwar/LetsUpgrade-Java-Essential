//Questions 3:
//Create an int array of size 5, 
//take all the values from the user, 
//add all the values and print the sum.
 
 package com.company;
 import java.util.Scanner;
 public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array=new int[10];
        int sum=0;
        System.out.println("Enter the elements: ");
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        for(int num:array){
            sum=sum+num;
        }
        System.out.println("Sum of elements in the array is:"+sum);
    }
}