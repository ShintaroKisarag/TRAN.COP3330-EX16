/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;



public class ex16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();  //stores age

        if(age<0)   //if age is less than 0
            System.out.println("Enter a valid age");
        else{   //if age is greater than 0
            String country[]={"Canada","USA","Mexico"};
            int validAge[] ={16,16,18};
            int i;
            for(i=0;i<3;i++)
                System.out.println(age>=validAge[i] ? "You are old enough to legally drive in" +country[i]: "You are not old enough to legally drive in " +country[i]);
        }
    }
}
