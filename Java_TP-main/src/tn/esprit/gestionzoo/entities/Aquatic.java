package tn.esprit.gestionzoo.entities;

public abstract  class Aquatic extends  Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + "\nhabitat: " + habitat;
    }
//    public  void swim() {
//    System.out.println("This aquatic animal is swimming.");
//    };
    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this.name.equals(((Aquatic) o).name)) {
            if (this.age == ((Aquatic) o).age) {
                if (this.habitat.equals(((Aquatic) o).habitat)) {
                    return true;
                }

            }
        }
            return false;
    }
}
