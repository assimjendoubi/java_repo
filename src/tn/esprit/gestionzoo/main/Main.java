package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal();
        lion.family = "big lions";
        lion.name = "myLion";
        lion.age = 12;
        lion.isMammal = true;
        System.out.println("the lion is :  \n" + lion);
        System.out.println("****************************************************");
        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo();
        myZoo.animals = new tn.esprit.gestionzoo.entities.Animal[]{lion};
        myZoo.name = "myZoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 12;
        System.out.println("the tn.esprit.gestionzoo.entities.Zoo is :  \n" + myZoo);*/

       /* Animal lion = new Animal("big lions" , "myLion" , 12 , true);
        Animal tigre = new Animal("big Tigre" , "myTigre" , 3 , true);
        Animal giraffe = new Animal("big Giraffe" , "myGiraffe" , 5 , true);
        Animal dog = new Animal("big dog" , "myDog" , 9 , true);
        Animal cat = new Animal("big cat" , "mycat" , 9 , true);
        Animal cow = new Animal("big cow" , "myCow" , 9 , true);



        //System.out.println("the lion is :  \n" + lion);
        //System.out.println("the tigre is :  \n" + tigre);
        System.out.println("****************************************************");

        Zoo myZoo = new Zoo("", "Tunisia");
        Zoo dahdah = new Zoo("California zoo", "California");
        dahdah.addAnimal(cow);

       if(!(myZoo.getName() == null)){
           myZoo.addAnimal(lion);
           myZoo.addAnimal(lion);
           myZoo.addAnimal(tigre);
           myZoo.addAnimal(giraffe);
           myZoo.addAnimal(dog);
           myZoo.addAnimal(cat);
           myZoo.addAnimal(cow);
       }


        System.out.print(myZoo.displayZoo());
        //System.out.print(myZoo2.displayZoo());

        myZoo.displayAnimals();
        System.out.println("****************************************************");
        System.out.println("result of myLion");
        System.out.println(myZoo.searchAnimal("myLion"));
        System.out.println("****************************************************");
        System.out.println(myZoo.isZooFull());
        //System.out.println(myZoo.removeAnimal(dog));
        //System.out.println(myZoo.displayZoo());
        System.out.println(myZoo.isZooFull());
        System.out.println("****************************************************");
        System.out.println(Zoo.comparerZoo(myZoo,dahdah));






        /*
        System.out.println(myZoo);*/

        /*tn.esprit.gestionzoo.entities.Animal [] animals = {lion , tigre};
        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("Tunisia tn.esprit.gestionzoo.entities.Zoo", "Tunisia", 4);
        myZoo.animals = animals;
        //System.out.println(myZoo.displayZoo());
        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        System.out.println("\ninstruction 6 : on remarque qu'on doit  inserer les variables directement dans un  constructeur paramétré car celui implicite" +
                "devient non definie si on definit un autre  paramétré c'est la notion surcharge  ");
        System.out.println("\ninstruction 7 : on doit créer un constructeur vide");
        System.out.println("\ninstruction 8 : on remarque l'affichage de l'adresse (adresse du pointage) du zoo car on a pas redifinie la methode to string ");
*/

       /* Animal animal = new Animal();
        //Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();*/
        Zoo toZoo = new Zoo("california zoo","california");
        //Aquatic aquatic2 = new Aquatic("big fish" , "myFish" , 12 , true,"mer" );
        /*Terrestrial terrestrial2 = new Terrestrial("big lions" , "myLion" , 12 , true,12);
        Dolphin dolphin2 = new Dolphin("big dauphin" , "myDauphin" , 12 , true, "mer" , 12);
        Penguin penguin2 = new Penguin("big penguin" , "penguin2" , 12 , true , "mer" , 5);
        Penguin penguin3 = new Penguin("big penguin3" , "penguin3" , 12 , true , "mer" , 10);
        Penguin penguin4 = new Penguin("big penguin4" , "penguin4" , 12 , true , "mer" , 18);

        //System.out.println(aquatic2.toString());
        System.out.println("*********************************");
        System.out.println( terrestrial2.toString());
        System.out.println("*********************************");
        System.out.println(dolphin2.toString());
        System.out.println("*********************************");
        System.out.println(penguin2.toString());


        //System.out.println(aquatic.toString());

        dolphin2.swim();
        //aquatic2.swim();
        penguin2.swim();
        //toZoo.addAquaticAnimals(aquatic2);
        toZoo.addAquaticAnimals(dolphin2);
        toZoo.addAquaticAnimals(penguin2);
        toZoo.addAquaticAnimals(penguin3);
        toZoo.addAquaticAnimals(penguin4);

        //toZoo.addAquaticAnimals(terrestrial2);
        System.out.println(toZoo.maxPenguinSwimmingDepth());
        toZoo.displayNumberOfAquaticsByType();
        System.out.println(penguin2.equals(penguin2));
        System.out.println(penguin3.equals(penguin2));*/

        Animal lion = new Animal("big lions" , "myLion" , 12 , true);
        Animal tigre = new Animal("big Tigre" , "myTigre" , 3 , true);
        Animal giraffe = new Animal("big Giraffe" , "myGiraffe" , 5 , true);
        Animal dog = new Animal("big dog" , "myDog" , 9 , true);
        Animal cat = new Animal("big cat" , "mycat" , 9 , true);
        Animal cow = new Animal("big cow" , "myCow" , 9 , true);

        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            toZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(toZoo.getName() + " contient : " + toZoo.getNbAnimal() + " animaux");
        }


        try {
            toZoo.addAnimal(tigre);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(toZoo.getName() + " contient " + toZoo.getNbAnimal() + " animaux");
        }
    }
}