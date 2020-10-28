package com.Day5.Assignment;
import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    String name;
    int score = 0;

    public void getDetails(){
        System.out.print("Enter player name : ");
        name = sc.next();
    }
}
