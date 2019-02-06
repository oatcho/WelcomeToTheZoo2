package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        boolean menuLoop = true;

        System.out.println("Welcome to the Zoo! What would you like to do?");

        do {
            System.out.println("1) Add or Remove a Pen \n 2) Add or Remove an Animal to a Pen \n 3) Display all Animals in a Pen \n 4) Display all Animals in the Zoo \n 5) Exit");

            int userOption = key.nextInt();
            switch(userOption){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect Response");
            }

        } while(menuLoop);



    }
}
