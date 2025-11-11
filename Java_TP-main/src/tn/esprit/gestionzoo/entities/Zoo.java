package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Zoo {

    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private final int  NBR_CAGES=3;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        Scanner sc = new Scanner(System.in);
        while(name.equals("")) {
            System.out.println("Please enter a valid name");
            name = sc.nextLine();
        }
        if (!name.equals("")) {
            this.name = name;
        }
        this.name = name;
        this.city = city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }


    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: "+name);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo city: "+city);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo nbr cages: "+NBR_CAGES);
    }
    public String toString(){
        return "tn.esprit.gestionzoo.entities.Zoo name: "+name +"tn.esprit.gestionzoo.entities.Zoo city: "+city +"tn.esprit.gestionzoo.entities.Zoo nbr cages: "+NBR_CAGES;
    }
//v1.0
//    public boolean addAnimal(Animal animal){
//        if (this.searchAnimal(animal)!=-1) {
//            System.out.println(animal+" existe de la liste de animals");
//            return false;
//        }
//        else {
//            if(!isZooFull()){
////            if (nbrAnimals < animals.length) {
//                animals[nbrAnimals] = animal;
//                nbrAnimals++;
//                System.out.println(animal+" ajouté avec succées");
//                return true;
//            } else {
//                System.out.println("la liste des animals  est complet");
//                return false;
//            }
//        }
//    }
//v2.0
//public void addAnimal(Animal animal) throws ZooFullException {
//    if (this.searchAnimal(animal) != -1) {
//        System.out.println(animal + " existe déjà dans la liste des animaux");
//        return;
//    }
//    if (isZooFull()) {
//        throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal : " + animal);
//    }
//    animals[nbrAnimals] = animal;
//    nbrAnimals++;
//    System.out.println(animal + " ajouté avec succès !");
//}
//v2.1
public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
    if (this.searchAnimal(animal) != -1) {
        System.out.println(animal + " existe déjà dans la liste des animaux");
        return;
    }
    if (animal.getAge() < 0) {
        throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif. (" + animal.getName() + ")");
    }
    if (isZooFull()) {
        throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal : " + animal.getName());
    }
    animals[nbrAnimals] = animal;
    nbrAnimals++;
    System.out.println( " ajouté avec succès !");
}

    public void afficheAnimals(){
        for(int i=0; i<nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
//        int i=0;
//        while(i<nbrAnimals){
//            if(animals[i].name==animal.name){
//                return i;
//            }
//            i++;
//        }
//        return -1;
        for(int i=0; i<nbrAnimals; i++){
            if(animals[i].equals(animal)){
                System.out.println(animal+"est trouvé !");
                return i;
            }
        }
        System.out.println(animal +"n'est pas trouvé");
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int i=searchAnimal(animal);
        if (i==-1) {return false;}
            for (int j=i; j<nbrAnimals; j++){
                animals[j]=animals[j+1];
            }
            animals[nbrAnimals-1]=null;
            nbrAnimals--;
            System.out.println(animal+"est supprimé avec succé");
            return true;

    }
    public boolean isZooFull(){
//        if(nbrAnimals<animals.length){
//            return false;
//        }
//        return true;
        return nbrAnimals>=NBR_CAGES;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals >z2.nbrAnimals){
            System.out.println(z1+"comporte plus d'animaux que"+ z2);
            return z1;
        }
            System.out.println(z2+"comporte plus d'animaux que "+ z1);
            return z2;
    }
    
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            System.out.println("aquatic animal add successful ");
            nbrAquaticAnimals++;
        } else {
            System.out.println("you can't add more aquatic animals");
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxPenguinSwimmingDepth = 0;
        for(int i=0; i<nbrAquaticAnimals; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if (((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxPenguinSwimmingDepth) {
                    maxPenguinSwimmingDepth=((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                }

            }
        }
        return maxPenguinSwimmingDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
        if (aquaticAnimals[i] instanceof Penguin) {
            nbrPenguins++;
        }
        else {
            nbrDolphins++;
        }
        }
        System.out.println("Nombre dolphins: " + nbrDolphins+"\n Nombre penguins: " + nbrPenguins);
    }



}
