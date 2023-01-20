import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {
     //Clients
        Client client1 = new Client(123456,"emna", "mmmm");
        Client client2 = new Client(253859,"leila", "pppp");
        Client client3 = new Client(253564,"adem", "DDDDD");
        Client.clients.add(client1);
        Client.clients.add(client2);
        Client.clients.add(client3);
        Client.affClients(Client.clients);
        

     //Agents
        Agent Ag1 = new Agent(124658,"aaa", "bbb");
        Agent Ag2 = new Agent(365685,"ccc", "dd");
        Agent Ag3 = new Agent(561225,"ee", "ff");
        Agent.Agents.add(Ag1);
        Agent.Agents.add(Ag2);
        Agent.Agents.add(Ag3);
        Agent.affAgents(Agent.Agents);
    

     //Vehicules
        Scanner sc =new Scanner(System.in);
        Vehicule vehicule1 = new Vehicule(85889, 1000, "Polo" , 0, Ag3);
        Vehicule vehicule2 = new Vehicule(85899, 1100, "Fiat" , 0, Ag3);
        Vehicule vehicule3 = new Vehicule(85000, 1500, "Mercedes" , 1, Ag3);
         //ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
        Vehicule.vehicules.add(vehicule1);
        Vehicule.vehicules.add(vehicule2);
        Vehicule.vehicules.add(vehicule3);
        Vehicule.ajouter_vehicule();
        Vehicule.afficher_vehicules(Vehicule.vehicules);

     // disponibilité
        System.out.println(Vehicule.EstDisponible(vehicule1));
        System.out.println(Vehicule.EstDisponible(vehicule2));
        System.out.println(Vehicule.EstDisponible(vehicule3));
      
     //Locations
     
         Location location1=new Location(client1, vehicule1, 5, 170);
         Location location2=new Location(client1, vehicule2, 15, 180);
         System.out.println("Le montant à payer est: ");
         System.out.println(Facture.Calcul_montant(location1));
         System.out.println(Facture.Calcul_montant(location2));
       
         System.out.println(vehicule2.toString());
    
    }
}
    
   
