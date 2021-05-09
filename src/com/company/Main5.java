package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfWeek;

        System.out.print("input dayOfWeek: ");
        dayOfWeek = input.nextInt();

        if (dayOfWeek == 1) {
            System.out.println("pn");
        }
        else if (dayOfWeek == 2) {
            System.out.println("vt");
        }
        else if (dayOfWeek == 3) {
            System.out.println("sr");
        }
        else if (dayOfWeek == 4) {
            System.out.println("cht");
        }
        else if (dayOfWeek == 5) {
            System.out.println("pt");
        }
        else if (dayOfWeek == 6) {
            System.out.println("sb");
        }
        else if (dayOfWeek == 7) {
            System.out.println("vsk");
        }
        else{
            System.out.println("takogo dnya net");
        }

        //if(age>0 && age<10) {}
        /*
        if(dayOfWeek<1 || dayOfWeek>7){
            System.out.println("takogo dnya net");
        }
        */

    }
}
