package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {

    protected Animal [] animals ;
    protected String name;
    protected String city ;
    protected final int nbrCages ;
    protected int nbAnimal = 0;
    private final int MAX_ANIMALS = 5;
    private Aquatic[] aquaticAnimals;
    public static int counter;




    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNbAnimal() {
        return nbAnimal;
    }

    public void setNbAnimal(int nbAnimal) {
        this.nbAnimal = nbAnimal;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Nom est vide ! donner autre");
        }else{
            this.name = name;
        }
    }

    public Zoo(String name , String city ){
        this.nbrCages = MAX_ANIMALS;
            this.name = name;
            this.city = city ;
            animals = new Animal[nbrCages] ;
            nbAnimal = 0;
            this.aquaticAnimals = new Aquatic[10] ;
        }





    @Override
    public String toString(){
        int index = 0  ;

        String [] nameOfAnimals = new String[nbAnimal] ;

        for (int i = 0 ; i< nbAnimal ; i++){

            nameOfAnimals[index] = animals[i].name;
            index++;


        }

        return  "Name of zoo : " + name + " ,the city : " + city + " ,number of cages : " + nbrCages + " ,has as animals : " + Arrays.toString(nameOfAnimals) ;
    }

    public String displayZoo(){
        String [] nameOfAnimals = new String[this.nbAnimal] ;
        int index = 0  ;

        for (int i = 0 ; i<nbAnimal ; i++){
            nameOfAnimals[index] = this.animals[i].name;
            index++;
        }
        return  "Name of zoo : " + name + " ,the city : " + city + " ,number of cages : " + nbrCages + " ,has as animals : " + Arrays.toString(nameOfAnimals) ;
    }

    public boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal.name) != -1){
            System.out.println(animal.name + " est déjà dans le zoo");
            return false;
        }
        if (! this.isZooFull()) {
            animals[nbAnimal] = animal;
            nbAnimal ++;
            System.out.println("yes added");
            return true;
        } else {
            return false;
        }
    }

    public void displayAnimals() {
        System.out.println("\n");
        int i = 0;
        while (i <this.nbAnimal){

            System.out.println(animals[i]);
            i++;
        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < this.nbAnimal; i++) {
            if (animals[i] != null && animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        int index = this.searchAnimal(animal.name);
        System.out.println("Index found: " + index);

        if (index != -1) {
            for (int i = index; i < this.nbAnimal - 1; i++) {
                animals[i] = animals[i + 1];
            }

            animals[this.nbAnimal - 1] = null;

            this.nbAnimal--;

            System.out.println("yes removed");
            return true;

        } else {
            System.out.println("not found");
            return false;
        }
    }

    public boolean isZooFull() {
        return this.nbAnimal >= this.nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        System.out.println("Zoo 1 has: " + z1.nbAnimal + " animals.");
        System.out.println("Zoo 2 has: " + z2.nbAnimal + " animals.");
        if (z1.nbAnimal > z2.nbAnimal) {
            return z1;
        } else if (z2.nbAnimal > z1.nbAnimal) {
            return z2;
        } else {
            return null;
        }
    }

    public void addAquaticAnimals(Aquatic animal){

            this.aquaticAnimals[counter]=animal;
            counter++;
            System.out.println("aquatic added");
        }

    public float maxPenguinSwimmingDepth(){
        float maxProfond = 0f;
        for(Animal aqAnimal : aquaticAnimals){
            if(aqAnimal != null){
                if(aqAnimal instanceof Penguin){
                    if (maxProfond < ((Penguin)aqAnimal).getSwimmingDepth()){
                        maxProfond = ((Penguin)aqAnimal).getSwimmingDepth();
                    }
                }
            }

        }
        return maxProfond;
    }

    public void displayNumberOfAquaticsByType(){
        int nbDolphin = 0;
        int nbPenguin = 0;
        for(Animal aqAnimal : aquaticAnimals){
            if(aqAnimal != null) {
                if (aqAnimal instanceof Penguin) {
                    nbPenguin++;
                }else {
                    nbDolphin++;
                }
            }
        }
        System.out.println("Number of dolphins : " + nbDolphin +"\nNumber of penguins : " + nbPenguin);

    }
}


