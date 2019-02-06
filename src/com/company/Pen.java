package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pen extends BabyAnimal {

    private ArrayList<Animal> animalArrayList = new ArrayList<>();
    private ArrayList<BabyAnimal> babyAnimalArrayList = new ArrayList<>();

    public Pen () {

    }

    public void createNewPen(Pen newPen){
        ArrayList<Animal> nameOfPen = new ArrayList<>();
    }

    public void createNewBabyPen(Pen newPen2){
        ArrayList<BabyAnimal> nameOfBabyPen = new ArrayList<>();
    }

    public void addAnimal(Animal newAnimal){
        animalArrayList.add(newAnimal);
    }

    public void addBabyAnimal(BabyAnimal newBabyAnimal){
        babyAnimalArrayList.add(newBabyAnimal);
    }

    public void removeAnimal(String species){
        animalArrayList.remove(searchBySpecies(species));
    }

    public void removeBabyAnimal(String species){
        babyAnimalArrayList.remove(searchByBabySpecies(species));
    }

    public Animal searchBySpecies(String species){
        Animal a = new Animal();
        for (int i = 0; i < animalArrayList.size(); i++){
            if(animalArrayList.get(i).getSpecies() == species){
                a = animalArrayList.get(i);
            }

        }
        return a;
    }

    public BabyAnimal searchByBabySpecies(String species){
        BabyAnimal b = new BabyAnimal();
        for (int j = 0; j < babyAnimalArrayList.size(); j++){
            if(babyAnimalArrayList.get(j).getSpecies() == species){
                b = babyAnimalArrayList.get(j);
            }
        } return b;
    }

}
