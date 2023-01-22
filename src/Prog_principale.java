import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {

      System.out.println();
     //Clients
         //nouveau client
         Client client1 = new Client(123456,"emna", "mmmm");
         //ajouter le client a la liste des clients
         Client.clients.add(client1);
         //afficher details du client1
         System.out.println("information du client ajoutée ");
         System.out.println(client1.toString()); 
         //meme pour client2 et client3
         Client client2 = new Client(253859,"leila", "pppp");
         Client client3 = new Client(253564,"adem", "DDDDD");
         Client.clients.add(client2);
         Client.clients.add(client3);
         System.out.println();


     //Agents
         //nouveau agent
         Agent Ag1 = new Agent(124658,"aaa", "bbb");
         //ajouter a la liste des agents
         Agent.Agents.add(Ag1);
         //afficher details du Ag1
         System.out.println("information de l'agent ajoutée ");
         System.out.println(Ag1.toString()); 

         //meme pour Ag2 et Ag3
         Agent Ag2 = new Agent(365685,"ccc", "dd");
         Agent Ag3 = new Agent(561225,"ee", "ff");
         Agent.Agents.add(Ag2);
         Agent.Agents.add(Ag3);
         System.out.println();
         System.out.println();


     //Vehicules
        //nouveau vehicule
        Vehicule vehicule1 = new Vehicule(85889, 1000, "Polo" , 0, Ag1);
        //ajouter a la liste des vehicules
        Vehicule.vehicules.add(vehicule1);
        //afficher details de la vehicules vehicule1 
        System.out.println("information du vehicule ajoutée ");
        System.out.println(vehicule1.toString()); 
        //disponibilité de la vehicule vehicule1
        Vehicule.EstDisponible(Vehicule.vehicules.indexOf(vehicule1));

        //meme pour vehicule2 et vehicule3
        Vehicule vehicule2 = new Vehicule(85899, 1100, "Fiat" , 1, Ag1);
        Vehicule vehicule3 = new Vehicule(85000, 1500, "Mercedes" , 1, Ag2);
        Vehicule.vehicules.add(vehicule2);
        Vehicule.vehicules.add(vehicule3);

        //location 
        Location l3 = new Location();
        Location l1 = new Location();
        Location l2 = new Location();
        Location l4 = new Location(client2,vehicule1,2,45000);
        Location.Locations.add(l1);
        Location.Locations.add(l2);
        Location.Locations.add(l3);
        Location.Locations.add(l4);
        System.out.println();
        System.out.println();

        //factures
        //nouvelle facture
        Facture f1 = new Facture(124658,"11/02/2001",50000, Ag1, l1);
        //ajouter a la liste des agents
        Facture.factures.add(f1);
        //afficher details du f1
        System.out.println("information de l'agent ajoutée ");
        System.out.println(f1.toString()); 

        //meme pour f2 et f3
        Facture f2 = new Facture(365685,"8/3/2023",50000, Ag2,l2);
        Facture f3 = new Facture(561225,"5/6/2001",50000, Ag1,l3);
        Facture.factures.add(f2);
        Facture.factures.add(f3);
        System.out.println();
        System.out.println();

        
        

        int x;
      do{
            Scanner sc =new Scanner(System.in);
            System.out.println("");
            System.out.println( "1-Ajoutez un nouveau client.\n2-afficher la liste des clients.\n"+ 
            "3-Ajoutez un nouveau agent.\n4-afficher la liste des agents.\n"+
            "5-Ajoutez des vehicules.\n6-afficher la liste des vehicules.\n7-Vérifier la disponibilté d'une véhicule\n"
            +"8-afficher les vehicules réservés par un client.\n9-afficher les clients qui réservent un véhicule\n10-Demande location"
            +"11-ajouter_facture\n12-afficher_factures\n13-");
             x = sc.nextInt();
             System.out.println("");

         switch (x) {
            case 1: 
               Client.ajouter_client();
            break;

            case 2:
               Client.affClients(Client.clients);
            break;

            case 3: 
               Agent.ajouter_agent();
            break;

            case 4: 
               Agent.affAgents(Agent.Agents);
            break;

            case 5: 
               Vehicule.ajouter_vehicule();
            break;

            case 6: 
               Vehicule.afficher_vehicules();
            break;

            case 7:
           
               System.out.println( "choisir l'id de la véhicule");
               System.out.println();
               Vehicule.afficher_vehicules();
               int id=sc.nextInt();
               int index=Vehicule.Recherche_voiture(id);
               System.out.println();
               Vehicule.EstDisponible(index);
            
            break;
            case 8:
               System.out.println("Entrez l'id du client");
               int r=sc.nextInt();
               int in= Client.Recherche_client(r);

               Client.aff_vehicules(Client.clients.get(in));
            break;
            case 9:
               System.out.println("Entrez l'id de la vehicule");
               int p=sc.nextInt();
               int n= Vehicule.Recherche_voiture(p);
               Vehicule.aff_clients(Vehicule.vehicules.get(n));

               
            break;
            case 10:
               Location.demande_location();

            break;
            case 11:

            break;

         } 

   }while (x !=11);
      
    
    }
   }
    
   
