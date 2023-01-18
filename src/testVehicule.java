import java.util.Scanner;

import java.util.*; 
public class testVehicule {
    public static void main ( String[] args){
    Scanner sc =new Scanner(System.in);

//// creation d'un tableau de vehicules
System.out.println("Donner le nombre de vehicules de l'agence");
int nombre = sc.nextInt();
vehicule[] tableauvehicules = new vehicule[nombre];

//// remplissage du tableau 
for ( int i=1; i<tableauvehicules.length+1;i++) {
System.out.println("Entrer l'id de la véhicule"+ " " + i);
int idVehicule = sc.nextInt();
System.out.println("Entrer le nombre de places");
int nbrPlaces = sc.nextInt();
System.out.println("Entrer la marque");
String marque = sc.next();
System.out.println("Entrer la couleur");
String couleur = sc.next();
System.out.println("Entrer 1 si elle est dispo et 0 sinon");
int dispo = sc.nextInt();
tableauvehicules[i] = new vehicule();
}

}}
