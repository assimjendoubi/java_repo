package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal {

    protected String family;
    protected String name;
    protected int age ;
    protected boolean isMammal;



    public Animal (){}

    public Animal (String family , String name, int age , boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age<=0){
            System.out.println("l'age ne doit etre negatif");
        }else {
            this.age = age;
        }
        this.isMammal = isMammal;
    }

    @Override
    public  String toString() {
        return "family: " + family + ", Name: " + name + ", Age: " + age + ", is Mammal: " + isMammal +"\n";
    }


    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0)
            throw new InvalidAgeException("The age must a positive number");
        else
            this.age = age;
    }


    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isMammal() {
        return isMammal;
    }



}
