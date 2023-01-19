import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {
        //Clients
        Client client1 = new Client(123456,"emna", "mmmm");
        Client client2 = new Client(253859,"leila", "pppp");
        Client client3 = new Client(253564,"adem", "DDDDD");
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        System.out.println("La liste des Clients:");
        Client.affClients(clients);
        

        //Agents
        Agent Ag1 = new Agent(124658,"aaa", "bbb");
        Agent Ag2 = new Agent(365685,"ccc", "dd");
        Agent Ag3 = new Agent(561225,"ee", "ff");
        ArrayList<Agent> Agents = new ArrayList<Agent>();
        Agents.add(Ag1);
        Agents.add(Ag2);
        Agents.add(Ag3);
        System.out.println("La liste des Agents:");
        Agent.affAgents(Agents);
    

        //Vehicules
        Scanner sc =new Scanner(System.in);
     Vehicule vehicule1 = new Vehicule(85889, 1000, "Polo" , 0, Ag3);
     Vehicule vehicule2 = new Vehicule(85899, 1100, "Fiat" , 1, Ag3);
     Vehicule vehicule3 = new Vehicule(85000, 1500, "Mercedes" , 1, Ag3);
     ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
    vehicules.add(vehicule1);
    vehicules.add(vehicule2);
    vehicules.add(vehicule3);
    System.out.println("La liste des vehicules:");
    Vehicule.afficher_vehicules(vehicules);
        
    
		
        
    }
}
