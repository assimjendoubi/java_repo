package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {}
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        super.toString();
        return  " swimmingDepth: " + swimmingDepth;

    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
}
