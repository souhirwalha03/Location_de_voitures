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
public Location(Client client, Vehicule vehicule, int duree, float prix_journalie_convenu){
this.client=client;
this.vehicule=vehicule;
this.duree=duree;
this.prix_journalie_convenu=prix_journalie_convenu;
}
    
    //Demande de location
    //public static void demande(){
       // System.out.println("Entrer l'id de la voiture que vous voulez louer");
      //  Vehicule.afficher_vehicules(Vehicule.vehicules);
        //Scanner sc = new Scanner(System.in);
            //int choix = sc.nextInt();
      // if choix.chercher().dispo==0{
        //la voiture est louée : Exception}
       // else{
        //modifier dispo vehicule à 1
      //  }

       //}
    }

