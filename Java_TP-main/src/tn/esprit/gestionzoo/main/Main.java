package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
public class Main {
    public static void main(String[] args) {
//        tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal();
//        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo();
//        lion.family="Felidae";
//        lion.name="Lion";
//        lion.age=8;
//        myZoo.name="MyZoo";
//        myZoo.city="Paris";
//        myZoo.nbrCages=10;
        //Animal lion = new Animal("Felidae", "Lion", 8, true);

         Zoo myZoo = new Zoo("MyZoo", "Paris");
         Animal a1 = new Animal("Elephantidae", "Elephant", 15, true);
        Animal a2 = new Animal("Crocodylidae", "Crocodile", -20, false);
        Animal a3 = new Animal("Ursidae", "Panda", 5, true);

        Zoo z1 = new Zoo("New York ", "New York");
        Zoo z2 = new Zoo("Tokyo ", "Tokyo");
        Zoo z3 = new Zoo("London ", "London");
        //z1.displayZoo();
//        System.out.println(z1);
//        System.out.println(z1.toString()) ;
//        System.out.println(lion);

//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(a1);
//        myZoo.addAnimal(a2);
//        myZoo.addAnimal(a3);
//
//        myZoo.afficheAnimals();
//        System.out.println(myZoo.searchAnimal(a2));
//        myZoo.removeAnimal(a2);
//        myZoo.afficheAnimals();
//
//        System.out.println(myZoo.isZooFull());

//        Aquatic aquat = new Aquatic();
//        Terrestrial terrestrial = new Terrestrial();
//        Penguin penguin = new Penguin();
//        Dolphin dolphin = new Dolphin();
        Dolphin poisson = new Dolphin("Poisson", "Nemo", 2, false, "Océan",15.5f);
        Dolphin dauphinBleu = new Dolphin("Cétacé", "Flipper", 5, true, "Océan Atlantique", 25.5f);
        Penguin empereur = new Penguin("Oiseau", "Pingouin Empereur", 7, false, "Antarctique", 200.0f);
        Terrestrial lion = new Terrestrial("Félin", "Simba", 8, true, 4);

//        System.out.println(poisson);
//        System.out.println(dauphinBleu);
//        System.out.println(empereur);
//        System.out.println(lion);
//
//        poisson.swim();
//        dauphinBleu.swim();
//        empereur.swim();
//        z1.addAquaticAnimal(poisson);
//        z1.addAquaticAnimal(dauphinBleu);
//        z1.addAquaticAnimal(empereur);
//        Aquatic[] aquaticAnimals =z1.getAquaticAnimals();
//        for (int i=0;i<z1.getNbrAquaticAnimals();i++) {
//            aquaticAnimals[i].swim();
//        }
        try {
            myZoo.addAnimal(a1);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (InvalidAgeException e){
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());

        try {
            myZoo.addAnimal(a2);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (InvalidAgeException e){
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());

        try {
            myZoo.addAnimal(a3);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (InvalidAgeException e){
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());

        try {
            myZoo.addAnimal(poisson);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (InvalidAgeException e){
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());
    }

}
