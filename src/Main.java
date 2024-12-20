//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*Animal lion = new Animal();
        lion.family = "big lions";
        lion.name = "myLion";
        lion.age = 12;
        lion.isMammal = true;
        System.out.println("the lion is :  \n" + lion);
        System.out.println("****************************************************");
        Zoo myZoo = new Zoo();
        myZoo.animals = new Animal[]{lion};
        myZoo.name = "myZoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 12;
        System.out.println("the Zoo is :  \n" + myZoo);*/

        Animal lion = new Animal("big lions" , "myLion" , 12 , true);
        Animal tigre = new Animal("big Tigre" , "myTigre" , 3 , true);
        Animal giraffe = new Animal("big Giraffe" , "myGiraffe" , 5 , true);
        Animal dog = new Animal("big dog" , "myDog" , 9 , true);
        Animal cat = new Animal("big cat" , "mycat" , 9 , true);
        Animal cow = new Animal("big cow" , "myCow" , 9 , true);



        //System.out.println("the lion is :  \n" + lion);
        //System.out.println("the tigre is :  \n" + tigre);
        System.out.println("****************************************************");

        Zoo myZoo = new Zoo("Tunisia Zoo", "Tunisia");
        Zoo dahdah = new Zoo("California Zoo", "California");
        dahdah.addAnimal(cow);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(cat);
        myZoo.addAnimal(cow);


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

        /*Animal [] animals = {lion , tigre};
        Zoo myZoo = new Zoo("Tunisia Zoo", "Tunisia", 4);
        myZoo.animals = animals;
        //System.out.println(myZoo.displayZoo());
        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        System.out.println("\ninstruction 6 : on remarque qu'on doit  inserer les variables directement dans un  constructeur paramétré car celui implicite" +
                "devient non definie si on definit un autre  paramétré c'est la notion surcharge  ");
        System.out.println("\ninstruction 7 : on doit créer un constructeur vide");
        System.out.println("\ninstruction 8 : on remarque l'affichage de l'adresse (adresse du pointage) du zoo car on a pas redifinie la methode to string ");
*/






    }
}