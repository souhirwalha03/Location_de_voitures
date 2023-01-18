import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {
        Client client1 = new Client(123456,"emna", "mmmm");
        Client client2 = new Client(253859,"leila", "pppp");
        Client client3 = new Client(253564,"adem", "DDDDD");

        List<Client> clients = new ArrayList<Client>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
    

        Scanner sc =new Scanner(System.in);

        //// creation d'un tableau de vehicules
        System.out.println("Donner le nombre de vehicules de l'agence");
        int nombre = sc.nextInt();
        Vehicule[] tableauvehicules = new Vehicule[nombre];
        
        //// remplissage du tableau 
        for ( int i=1; i<tableauvehicules.length+1;i++) {
        System.out.println("Entrer l'id de la véhicule"+ " " + i);
        int idVehicule = sc.nextInt();
        System.out.println("Entrer le nombre de places");
        int nbrPlaces = sc.nextInt();
        System.out.println("Entrer la marque");
        String marque = sc.next();
        System.out.println("Entrer 1 si elle est dispo et 0 sinon");
        int dispo = sc.nextInt();
        tableauvehicules[i] = new Vehicule();
        }
		
        
    }
}
