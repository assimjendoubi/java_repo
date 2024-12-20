package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
   protected String habitat ;

   public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
       return super.toString()+" Aquatic habitat=" + habitat + '}';

    }

    public abstract void  swim() ;


    @Override
    public boolean equals (Object o) {
        if (o == null) return false;
        if (o instanceof Aquatic aquatic) {
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false;
    }


}
