public class Location {

    private Client client;
    private Vehicule vehicule;

    
    public String dateDebut ;
    public int duree;
    public float prix_journalie_convenu;
    
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

    

    

}
