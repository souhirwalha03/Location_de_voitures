import java.util.*;


public class Prog_principale {
    public static void main(String[] args) {

      System.out.println();
     //Clients
         //nouveau client
         Client client1 = new Client(11111,"a1", "b1");
         //ajouter le client a la liste des clients
         Client.clients.add(client1);
         //afficher details du client1
         System.out.println("information du client ajoutée ");
         System.out.println(client1.toString()); 
         //meme pour client2 et client3
         Client client2 = new Client(12222,"a2", "b2");
         Client client3 = new Client(13333,"a3", "b3");
         Client.clients.add(client2);
         Client.clients.add(client3);
         System.out.println();


     //Agents
         //nouveau agent
         Agent Ag1 = new Agent(21111,"c1", "d1");
         //ajouter a la liste des agents
         Agent.Agents.add(Ag1);
         //afficher details du Ag1
         System.out.println("information de l'agent ajoutée ");
         System.out.println(Ag1.toString()); 

         //meme pour Ag2 et Ag3
         Agent Ag2 = new Agent(22222,"c2", "d2");
         Agent Ag3 = new Agent(23333,"c3", "d3");
         Agent.Agents.add(Ag2);
         Agent.Agents.add(Ag3);
         System.out.println();
         System.out.println();


     //Vehicules
        //nouveau vehicule
        Vehicule vehicule1 = new Vehicule(85889, 1000, "Polo" , 0, Ag1,40000);
        //ajouter a la liste des vehicules
        Vehicule.vehicules.add(vehicule1);
        //afficher details de la vehicules vehicule1 
        System.out.println("information du vehicule ajoutée ");
        System.out.println(vehicule1.toString());

        //disponibilité de la vehicule vehicule1
        Vehicule.EstDisponible(Vehicule.vehicules.indexOf(vehicule1));

        vehicule1.clients.add(client1);
        vehicule1.clients.add(client3);

        //meme pour vehicule2 et vehicule3
        Vehicule vehicule2 = new Vehicule(85899, 1100, "Fiat" , 1, Ag1,70000);
        Vehicule vehicule3 = new Vehicule(85000, 1500, "Mercedes" , 1, Ag2,60000);
        Vehicule.vehicules.add(vehicule2);
        Vehicule.vehicules.add(vehicule3);
         
        vehicule2.clients.add(client1);

        

        //factures
        //nouvelle facture
       Facture f1 = new Facture(124658,"11/02/2001",50000, Ag1);
        //ajouter a la liste des agents
        Facture.factures.add(f1);
        //afficher details du f1
        System.out.println("information de la facture ajoutée ");
        System.out.println(f1.toString()); 

        System.out.println();

   
        int x;
      do{
            Scanner sc =new Scanner(System.in);
            System.out.println("");
            System.out.println( 
            "1-Ajoutez un nouveau client.                 2-afficher la liste des clients.\n"+ 
            "3-Ajoutez un nouveau agent.                  4-afficher la liste des agents.\n"+
            "5-Ajoutez des vehicules.                     6-afficher la liste des vehicules.          7-Vérifier la disponibilté d'une véhicule\n"
            +"8-afficher les vehicules réservés par un client.    9-afficher les clients qui ont réservées une voiture\n"+
            "10-Demande location                         11-afficher la liste des locations          13-afficher détails d'une location\n"+
            "12-ajouter_facture                          14-afficher liste des factures");
             x = sc.nextInt();
             System.out.println("");

         switch (x) {
            case 1: 
               Client.ajouter_client();
            break;

            case 2:
               Client.affClients();
            break;

            case 3: 
               Agent.ajouter_agent();
            break;

            case 4: 
               Agent.affAgents();
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
            try{
               System.out.println("Entrez l'id de la vehicule");
               int p=sc.nextInt();
               int n= Vehicule.Recherche_voiture(p);
               System.out.println(n);
               Vehicule.aff_clients(Vehicule.vehicules.get(n));
            }catch(Exception e)
            {
               System.out.println("aucune res trouvée");
            }

               
            break;
            case 10:
            Location l0= new Location();

               l0.demande_location();

            break;
            case 11:
            Location l1= new Location();
               l1.afficher_locations();
            break;
            case 12:
               Facture.ajouter_facture();
            break;
            case 13:
            Location l2= new Location();
               System.out.println("Entrez l'id du client qui a effectué la location");
               int idc=sc.nextInt();
               System.out.println("Entrez l'id de la voiture louée");
               int idv=sc.nextInt();
               int it=l2.Recherche_location(idc,idv);
               if (it==-1)
                  System.out.println("");
                  else
                  l2.afficher_une_location(it);
            break;
            case 14:
            Facture.afficher_facture();
            break;
            case 15:
            
            break;

         } 

   }while (x !=15);
      
    
    }
   }
    
   
