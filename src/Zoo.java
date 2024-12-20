import java.util.Arrays;

public class Zoo {

    Animal [] animals ;
    String name ;
    String city ;
    int nbrCages ;

    Zoo(){}

    /*Zoo(Animal [] animals , String name , String city , int nbrCages){
        this.animals = animals ;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages ;
    }*/
    Zoo(String name , String city , int nbrCages){
        animals = new Animal[nbrCages] ;
        this.name = name ;
        this.city = city ;
        this.nbrCages = nbrCages ;

    }


    @Override
    public String toString(){
        String [] nameOfAnimals = new String[animals.length] ;
        int index = 0  ;
        for (Animal myAnimal : animals){
            nameOfAnimals[index] = myAnimal.name;
            index++;
        }
        return  "Name of zoo : " + name + " ,the city : " + city + " ,number of cages : " + nbrCages + " ,has as animals : " + Arrays.toString(nameOfAnimals) ;
    }
   /* public String displayZoo(){
        String [] nameOfAnimals = new String[animals.length] ;
        int index = 0  ;
        for (Animal myAnimal : animals){
            nameOfAnimals[index] = myAnimal.name;
            index++;
        }
        return  "Name of zoo : " + name + " ,the city : " + city + " ,number of cages : " + nbrCages + " ,has as animals : " + Arrays.toString(nameOfAnimals) ;

    }*/
}
