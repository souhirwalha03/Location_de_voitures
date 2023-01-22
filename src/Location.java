import java.util.*;
public class Location {

    
    
    public String dateDebut ;
    public int duree;
    public float prix_journalie_convenu;

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
    public Location(Client client, Vehicule vehicule, int duree){
    this.client=client;
    this.vehicule=vehicule;
    this.duree=duree;
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
                                Client.clients.get(i).vehicules.add(Vehicule.vehicules.get(index));
                                Vehicule.vehicules.get(index).clients.add(Client.clients.get(i)); 

                            }
                        else if (Vehicule.vehicules.get(index).getDispo() == 0 )
                        {          
                                System.out.println("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est déjà louée");
                        }
                        
                    }
            
            }

        }
    }

