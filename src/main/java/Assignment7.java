/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the length in feet: ");
        int length = input1.nextInt();

        System.out.println("Enter the width in feet: ");
        int width = input1.nextInt();

        int area = length * width;
        double aream = (area * 0.09290304);
        System.out.println("The are is \r\n" + area + " square feet \r\n" + aream + " square meters");





    }
}