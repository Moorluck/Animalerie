package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.Random;

public class Animalerie {
    ArrayList<Animal> animaux;
    ArrayList<Animal> animauxMortLaNuit;

    // Getter

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public ArrayList<Animal> getAnimauxMortLaNuit() {
        return animauxMortLaNuit;
    }

    // Setter

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public void setAnimauxMortLaNuit(ArrayList<Animal> animauxMortLaNuit) {
        this.animauxMortLaNuit = animauxMortLaNuit;
    }

    // Constructeur

    public Animalerie() {
        this.setAnimaux(new ArrayList<>());
        this.setAnimauxMortLaNuit(new ArrayList<>());
    }

    // Méthode

    public void encoderAnimal(Animal animal) {
        this.getAnimaux().add(animal);
    }

    public void passerUneNuit() {
        Random rd = new Random();

        this.getAnimauxMortLaNuit().clear();

        for (int i = 0; i < this.getAnimaux().size(); i++) {
            if (rd.nextDouble() < this.getAnimaux().get(i).getProbabiliteDeces()) {
                this.getAnimauxMortLaNuit().add(getAnimaux().get(i));
                this.getAnimaux().remove(getAnimaux().get(i));
            }
        }
    }

    public String getAllCaracteristique() {

        StringBuilder message = new StringBuilder();

        for (Animal animal : animaux) {
            String messageSeparation = "--------------------------\n";
            String caracteristiques = animal.getCaracteristiques();
            message.append(messageSeparation).append(caracteristiques);
        }

        return message.toString();
    }

    public String getNumberOfEachAnimal() {
        int nbrChat = 0;
        int nbrChien = 0;
        int nbrOiseau = 0;

        for (int i = 0; i < getAnimaux().size(); i++) {
            if (getAnimaux().get(i) instanceof Chat) {
                nbrChat++;
            }
            if (getAnimaux().get(i) instanceof Chien) {
                nbrChien++;
            }
            if (getAnimaux().get(i) instanceof Oiseau) {
                nbrOiseau++;
            }
        }

        return String.format("Il y a actuellement : \n" +
                "- %s chats \n" +
                "- %s chiens \n" +
                "- %s oiseaux\n", nbrChat, nbrChien, nbrOiseau);
    }

    public String getDeadAnimals() {
        StringBuilder message = new StringBuilder("Il y a eu des morts cette nuit ! \n");
        for (Animal animal : animauxMortLaNuit) {
            message.append(" - ").append(animal.getNom()).append("\n");
        }
        return message.toString();
    }
}
