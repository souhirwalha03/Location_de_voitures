import java.util.*;
public class Location {

    
    
    public String dateDebut ;
    public int duree;
    public float prix_journalie_convenu;
    public static ArrayList<Location> Locations = new ArrayList<Location>();
    public static int  nombrelocations ;

    private Client client;
    private Vehicule vehicule;


    public Vehicule getVehiculet(){
        return this.vehicule;
    }
    public void setVehicule( Vehicule vehicule ){
         this.vehicule=vehicule ;
    }

    public Client getclient(){
        return this.client;
    }
    public void setagent( Client client ){
         this.client=client ;
    }
    //constrcuteur
    public Location(Client client, Vehicule vehicule, int duree,float prix_journalie_convenu){
    this.client=client;
    this.vehicule=vehicule;
    this.duree=duree;
    this.prix_journalie_convenu=prix_journalie_convenu;
    nombrelocations++;

    }

    public Location(){nombrelocations++;
    }
    
    //Demande de location
    public static void demande_location(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Entrez votre id");
       int c = sc.nextInt();
       int i=Client.Recherche_client(c);

       if (i==-1){
            System.out.println("you have to register first");
        }
       else {

                System.out.println("Entrez l'id de la voiture que vous voulez louer");
                Vehicule.afficher_vehicules();
                
                int choix = sc.nextInt();
                int index=Vehicule.Recherche_voiture(choix);

                if (index == -1){
                    System.out.println("id not found");}
                    else 
                    {
                        if ( Vehicule.vehicules.get(index).getDispo() == 1 ) 
                            {   
                                Location l = new Location() ;
                                Client.clients.get(i).vehicules.add(Vehicule.vehicules.get(index));
                                Vehicule.vehicules.get(index).clients.add(Client.clients.get(i)); 
                                System.out.println("entrez la durée de location");
                                int a = sc.nextInt();
                                l.duree=a;
                                System.out.println("entrez la date de location (jj/mm/aaaa)");
                                String b = sc.next();
                                l.dateDebut=b;
                                nombrelocations++;
                                Location.Locations.add(l);
                                
                            }
                        else if (Vehicule.vehicules.get(index).getDispo() == 0 )
                        {          
                                System.out.println("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est déjà louée");
                        }
                        
                    }
            
            }

        }
    }

