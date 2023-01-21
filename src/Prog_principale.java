import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {

     //Clients
         //nouveau client
         Client client1 = new Client(123456,"emna", "mmmm");
         //ajouter le client a la liste des clients
         Client.clients.add(client1);
         //afficher details du client1
         System.out.println(client1.toString()); 
         //meme pour client2 et client3
         Client client2 = new Client(253859,"leila", "pppp");
         Client client3 = new Client(253564,"adem", "DDDDD");
         Client.clients.add(client2);
         Client.clients.add(client3);
         System.out.println("\n");


     //Agents
         //nouveau agent
         Agent Ag1 = new Agent(124658,"aaa", "bbb");
         //ajouter a la liste des agents
         Agent.Agents.add(Ag1);
         //afficher details du Ag1
         System.out.println(Ag1.toString()); 
         System.out.println("\n");

         //meme pour Ag2 et Ag3
         Agent Ag2 = new Agent(365685,"ccc", "dd");
         Agent Ag3 = new Agent(561225,"ee", "ff");
         Agent.Agents.add(Ag2);
         Agent.Agents.add(Ag3);

     //Vehicules
        //nouveau vehicule
        Vehicule vehicule1 = new Vehicule(85889, 1000, "Polo" , 0, Ag3);
        //ajouter a la liste des vehicules
        Vehicule.vehicules.add(vehicule1);
        //afficher details de la vehicules vehicule1 
        System.out.println(vehicule1.toString()); 
        System.out.println("\n");
        //disponibilité de la vehicule vehicule1
        Vehicule.EstDisponible(Vehicule.vehicules.indexOf(vehicule1));
        System.out.println("\n");

        //meme pour vehicule2 et vehicule3
        Vehicule vehicule2 = new Vehicule(85899, 1100, "Fiat" , 0, Ag3);
        Vehicule vehicule3 = new Vehicule(85000, 1500, "Mercedes" , 1, Ag3);
        Vehicule.vehicules.add(vehicule2);
        Vehicule.vehicules.add(vehicule3);
        Vehicule.EstDisponible(Vehicule.vehicules.indexOf(vehicule2));
        Vehicule.EstDisponible(Vehicule.vehicules.indexOf(vehicule3));

        System.out.println("");
        int x;
      do{
            Scanner sc =new Scanner(System.in);
            System.out.println("");
            System.out.println( "1-Ajoutez un nouveau client.\n2-afficher la liste des clients.\n"+ 
            "3-Ajoutez un nouveau agent.\n4-afficher la liste des agents.\n"+
            "5-Ajoutez des vehicules.\n6-afficher la liste des vehicules.\n7-Vérifier la disponibilté d'une véhicule\n8-exit");
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
               int index=Vehicule.Recherche(id);
               System.out.println();
               Vehicule.EstDisponible(index);
            

               
            break;
            case 8:

            break;
         } 

   }while (x !=8);
        //affichage de la liste des vehicules 
        
      
     //Locations
     
        // Location location1=new Location(client1, vehicule1, 5, 170);
        // Location location2=new Location(client1, vehicule2, 15, 180);
       //System.out.println("Le montant à payer est: ");
        //System.out.println(Facture.Calcul_montant(location1));
        //System.out.println(Facture.Calcul_montant(location2));
       
        // System.out.println(vehicule2.toString());
    
    }
   }
    
   
