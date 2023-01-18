import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {
        Client client1 = new Client(123,"emma", "mmmm", "emma03", "1234");
        System.out.println(client1.toString());

        Client client2 = new Client(253,"leila", "pppp", "leila03", "12345");
        System.out.println(client2.toString());

        Client client3 = new Client(253,"hennah", "DDDDD", "hennah03", "12345");
        System.out.println(client3.toString());

        List<Utilisateur> Users = new ArrayList<Utilisateur>();
        Users.add(client1);
        Users.add(client2);
        Users.add(client3);
    

        Scanner sc =new Scanner(System.in);

        //// creation d'un tableau de vehicules
        System.out.println("Donner le nombre de vehicules de l'agence");
        int nombre = sc.nextInt();
        Vehicule[] tableauvehicules = new Vehicule[nombre];
        
        //// remplissage du tableau 
        for ( int i=1; i<tableauvehicules.length+1;i++) {
        System.out.println("Entrer l'id de la véhicule"+ " " + i);
        int idVehicule = sc.nextInt();
        System.out.println("Entrer le kilometrage");
        int kilometrage = sc.nextInt();
        System.out.println("Entrer le nombre de places");
        int nbrPlaces = sc.nextInt();
        System.out.println("Entrer prix de location");
        float prixlocation = sc.nextFloat();
        System.out.println("Entrer la marque");
        String marque = sc.next();
        System.out.println("Entrer l'immatriculation");
        String immatriculation = sc.next();
        System.out.println("Entrer la couleur");
        String couleur = sc.next();
        System.out.println("Entrer 1 si elle est dispo et 0 sinon");
        int dispo = sc.nextInt();
        tableauvehicules[i] = new Vehicule();
        }
		
        
    }
}
