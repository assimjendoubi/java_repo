package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

import java.util.Objects;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Aquatic habitat=" + habitat + '}';

    }

    public abstract void swim();


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Aquatic aquatic) {
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " can't eat this type of food.");
        }


    }
}
