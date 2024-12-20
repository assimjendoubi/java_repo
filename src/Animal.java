public class Animal {

    String family;
    String name;
    int age ;
    boolean isMammal;

    Animal (){}

    Animal ( String family , String name, int age , boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "family: " + family + ", Name: " + name + ", Age: " + age + ", is Mammal: " + isMammal +"\n";
    }
}
