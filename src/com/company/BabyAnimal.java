package com.company;

public class BabyAnimal extends Animal {

    String birthday;

    public BabyAnimal (String species, String size, String gender) {
        super (species, size, gender);
        this.birthday = birthday;
    }

    public BabyAnimal () {}

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
