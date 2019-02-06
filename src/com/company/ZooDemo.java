package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        boolean menuLoop = true;
        Pen newPen = new Pen();

        System.out.println("Welcome to the Zoo! What would you like to do?");

        do {
            System.out.println("1) Add or Remove a Pen \n 2) Add or Remove an Animal to a Pen \n 3) Display all Animals in a Pen \n 4) Display all Animals in the Zoo \n 5) Exit");

            int userOption = key.nextInt();
            switch(userOption){
                case 1:
                    //I don't think any of this case is correct or working how I want... moving on to other functions, will come back
                    System.out.println("1) Add Adult Animal Pen \n2) Add Baby Animal Pen \n3) Remove Pen");
                    int addOrRemovePenOption = key.nextInt();
                    if(addOrRemovePenOption == 1){
                        Pen newPenName = new Pen();
                    newPenName.createNewPen(newPenName);}
                    else if (addOrRemovePenOption ==2){
                        Pen newBabyPenName = new Pen();
                        newBabyPenName.createNewBabyPen(newBabyPenName);
                    }
                    else if (addOrRemovePenOption == 3) {
                        //add remove penarray function here, unsure of a few things, will come back
                    } else {
                        System.out.println("Incorrect Response");
                    }
                    break;
                case 2:
                    System.out.println("1) Add Animal to Animal Pen \n 2) Add Baby Animal to Baby Animal Pen \n 3) Remove Animal from Pen \n 4) Remove Baby Animal from Pen");
                    int userOption2 = key.nextInt();
                    if(userOption2 == 1){
                        System.out.println("Please enter Animal Species:");
                        key.nextLine();
                        String species = key.nextLine();
                        System.out.println("Please enter Animal Size:");
                        String size = key.nextLine();
                        System.out.println("Please enter Animal Gender:");
                        String gender = key.nextLine();
                        Animal newAnimal = new Animal(species, size, gender);
                        newPen.addAnimal(newAnimal);
                    } else if (userOption2 == 2){
                        System.out.println("Please enter Baby Animal Species:");
                        key.nextLine();
                        String species = key.nextLine();
                        System.out.println("Please enter Baby Animal Size:");
                        String size = key.nextLine();
                        System.out.println("Please enter Baby Animal Gender:");
                        String gender = key.nextLine();
                        System.out.println("Please enter Baby Animal Birthday");
                        String birthday = key.nextLine();
                        BabyAnimal newBabyAnimal = new BabyAnimal();
                        newPen.addBabyAnimal(newBabyAnimal);
                    } else if (userOption2 == 3){
                        System.out.println("What Species of Animal would you like to remove?");
                        String searchedForSpecies = key.nextLine();



                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    menuLoop = false;
                    break;
                default:
                    System.out.println("Incorrect Response");
            }

        } while(menuLoop);



    }
}
