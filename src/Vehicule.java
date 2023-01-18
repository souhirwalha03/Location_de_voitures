import java.util.*;


public class Vehicule {
	
        private int idVehicule;
        private int kilometrage ;
        private String marque;
        private int dispo;  
    
       //constructeur
       
        public Vehicule(int idVehicule, int kilometrage , String marque , int dispo)
        {
            this.idVehicule=idVehicule;
            this.kilometrage=kilometrage;
            this.marque=marque;
            this.dispo=dispo;        }

        public Vehicule(){}


    // getters & setters 
    
        public int getIdVehicule(){
        return this.idVehicule;
        }
        public void setIdVehicule( int idVehicule ){
         this.idVehicule=idVehicule ;
        }
    
       public int getKilometrage(){
        return this.kilometrage;
       }
       public void setKilometrage ( int kilometrage){
          this.kilometrage=kilometrage;
       }
    
    
        public String getMarque() {
            return this.marque;
        }
        public void setMarque( String marque ) {
            this.marque=marque ;
        }
    
        public int getDispo(){
            return this.dispo;}

        public void setDispo(int dispo){
        this.dispo=dispo;
        }

        ///methode d'affichage 
        public void affichervehicule(Vehicule V){
         
        System.out.println("Id:"+ idVehicule + "Kilometrage\n"+ kilometrage +"Marque\n"+ marque  +"Disponibilité:\n" + dispo);
        }

        /// methode de verification de disponibilité 
        public String EstDisponible(Vehicule V){
            if ( V.dispo==0 )  {
                return("La voiture est disponible à louer");
            } else {
               return("La voiture est déjà louée ");
            }

       
        }
    }
    



