package be.bxl.formation;

import be.bxl.formation.models.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animalerie animalerie = new Animalerie();

        boolean quitter = false;
        while (!quitter) {

            System.out.println("Que voulez-vous faire ? \n" +
                    "1. Encoder un animal ?\n" +
                    "2. Lister tous les animaux de l'animalerie ?\n" +
                    "3. Afficher le nombre d'animaux ?\n" +
                    "4. Passer la nuit ?\n" +
                    "5. Quitter ?");

            int choix = Integer.parseInt(sc.nextLine());

            if (choix == 1) {


                System.out.println("Quel espèce d'animal voulez-vous encoder ? \n" +
                        "1. Chat \n" +
                        "2. Chien \n" +
                        "3. Oiseau \n");
                int especeAnimaux = Integer.parseInt(sc.nextLine());

                // Données communes aux différents animaux

                System.out.println("Veuillez fournir les informations concernant l'animal : \n");

                System.out.print("Nom : ");
                String nom = sc.nextLine();
                System.out.println();

                System.out.print("Poids : ");
                int poids = Integer.parseInt(sc.nextLine());
                System.out.println();

                System.out.print("Taille : ");
                int taille = Integer.parseInt(sc.nextLine());
                System.out.println();

                System.out.print("Sexe (m/f) : ");
                String sexeString = sc.nextLine();
                boolean sexe;
                if (sexeString.equals("f")) {
                    sexe = false;
                }
                else {
                    sexe = true;
                }
                System.out.println();

                System.out.print("Age : ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println();

                System.out.print("Date d'arrivée : ");
                String dateArrivee = sc.nextLine();
                System.out.println();

                // Données Chat

                if (especeAnimaux == 1) {
                    System.out.print("Caractere : ");
                    String caractere = sc.nextLine();
                    System.out.println();

                    System.out.print("Les griffes sont-elles coupées ? (o/n) ");
                    String griffeString = sc.nextLine();
                    boolean griffeCoupee;
                    if (griffeString.equals("o")) {
                        griffeCoupee = true;
                    }
                    else {
                        griffeCoupee = false;
                    }
                    System.out.println();

                    System.out.print("Poils longs ou court ? (l/c) ");
                    String poilString = sc.nextLine();
                    boolean longPoil;
                    if (poilString.equals("c")) {
                        longPoil = false;
                    }
                    else {
                        longPoil = true;
                    }
                    System.out.println();

                    Chat newAnimal = new Chat(nom, poids, taille, sexe, age,
                            dateArrivee, caractere, griffeCoupee, longPoil);

                    animalerie.encoderAnimal(newAnimal);
                }

                // Données Chien

                else if (especeAnimaux == 2) {
                    System.out.print("Couleur du collier : ");
                    String couleurCollier = sc.nextLine();
                    System.out.println();

                    System.out.print("Est-il dresser ? (o/n) ");
                    String dresserString = sc.nextLine();
                    boolean dresser;
                    if (dresserString.equals("n")) {
                        dresser = false;
                    }
                    else {
                        dresser = true;
                    }
                    System.out.println();

                    System.out.print("Race : ");
                    String race = sc.nextLine();
                    System.out.println();

                    Chien newAnimal = new Chien(nom, poids, taille, sexe, age, dateArrivee, couleurCollier, dresser, race);

                    animalerie.encoderAnimal(newAnimal);
                }

                // Données Oiseau

                else if (especeAnimaux == 3) {
                    System.out.print("Couleur : ");
                    String couleur = sc.nextLine();
                    System.out.println();

                    System.out.print("Est-il habituer au volière ou aux cages ? (v/c) ");
                    String voliereString = sc.nextLine();
                    boolean voliere;
                    if (voliereString.equals("v")) {
                        voliere = true;
                    }
                    else {
                        voliere = false;
                    }
                    System.out.println();

                    Oiseau newAnimal = new Oiseau(nom, poids, taille, sexe, age, dateArrivee,
                            couleur, voliere);

                    animalerie.encoderAnimal(newAnimal);
                }
            }

            else if (choix == 2) {
                System.out.println(animalerie.getAllCaracteristique());
            }

            else if (choix == 3) {
                System.out.println(animalerie.getNumberOfEachAnimal());
            }

            else if (choix == 4) {
                animalerie.passerUneNuit();
                System.out.println("Une nuit a été passée !");
                if (!animalerie.getAnimauxMortLaNuit().isEmpty()) {
                    System.out.println(animalerie.getDeadAnimals());
                }
            }

            else if (choix == 5) {
                quitter = true;
            }

            else {
                System.out.println("Vous n'avez pas encoder un bon numéro");
            }
        }
    }
}
