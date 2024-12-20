import java.util.Arrays;

public class Zoo {

    Animal [] animals ;
    String name ;
    String city ;
    final int nbrCages ;
    int nbAnimal = 0;
    private final int MAX_ANIMALS = 5;


    Zoo(String name , String city ){
        this.nbrCages = MAX_ANIMALS;
        animals = new Animal[nbrCages] ;
        this.name = name ;
        this.city = city ;
        nbAnimal = 0;


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

    boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal.name) != -1){
            System.out.println(animal.name + " est déjà dans le zoo");
            return false;
        }
        if (this.nbAnimal < this.nbrCages) {
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


    boolean removeAnimal(Animal animal) {
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


}
