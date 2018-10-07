package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String ans = " ";
        do {
            System.out.println("Enter your number");
            int num = src.nextInt();
            int countend = num;
            for(int counter = 1; counter<= countend; counter++){
            //for(int counter = num ; counter >=1; counter--){
           // while (num >= 1) {
                //do
                if (num % 5 == 0 || num % 7 == 0) {
                    System.out.println(num);
                    // }else if (num % 7 == 0) {
                    //   System.out.println(num);
                }
                //else {
                   // System.out.print("");
               // }

                // System.out.println(num);

                num = num - 1;

                // } while (num >= 1);
            }
                System.out.println("Would you like to enter next number (y/n)");
                ans = src.next();

            }
            while (ans.equalsIgnoreCase("y")) ;
        if (ans .equals("n")) {
            System.out.println("Thanks for playing");

        }


            //  }

        }

    }