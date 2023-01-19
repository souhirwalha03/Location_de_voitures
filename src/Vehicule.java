import java.util.*;


public class Vehicule {
	
        private int idVehicule;
        private int kilometrage ;
        private String marque;
        private int dispo; 
        public static ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
//associations
        private ArrayList <Client> clients;
        private Agent agent;
        
//constructeur
       
        public Vehicule(int idVehicule, int kilometrage , String marque , int dispo,Agent agent)
        {
            this.idVehicule=idVehicule;
            this.kilometrage=kilometrage;
            this.marque=marque;
            this.dispo=dispo;    
            this.agent=agent;
            clients = new  ArrayList<Client>();    
        }

        public Vehicule(){}
       

// getters   
        public ArrayList <Client> getclient() {
            return clients ;
        }

        public Agent getagent(){
            return this.agent;
        }

        public int getIdVehicule(){
            return this.idVehicule;
        }

        public int getKilometrage(){
            return this.kilometrage;
        }

        public String getMarque() {
            return this.marque;
        }

        public int getDispo(){
            return this.dispo;
        }
//setters
        public void setClient (ArrayList <Client> clients){
            this.clients = clients;
        }

        public void setagent( Agent agent ){
             this.agent=agent ;
        }
    
        public void setIdVehicule( int idVehicule ){
            this.idVehicule=idVehicule ;
        }
    
        public void setKilometrage ( int kilometrage){
          this.kilometrage=kilometrage;
        }
    
        public void setMarque( String marque ) {
            this.marque=marque ;
        }
    
        public void setDispo(int dispo){
            this.dispo=dispo;
        }

///methode d'affichage 
        public String toString(){
         
            return "Id:"+ this.idVehicule + "Kilometrage\n"+ this.kilometrage
             +"Marque\n"+ this.marque  +"Disponibilité:\n" + this.dispo+"gérer par:\n"+this.agent+"louée par:\n"+this.clients;
        }

/// methode de verification de disponibilité 
        public static String EstDisponible(Vehicule V){
            
            if ( V.dispo==0 )  {
               return ("La voiture demandée est disponible à louer");
            } else {
                return("La voiture demandée est déjà louée");
            }

       
        }
        public static void afficher_vehicules (ArrayList<Vehicule> vehicules){
            System.out.println("Entrer le nombre de voitures de l'agence");
            Scanner sc = new Scanner(System.in);
            int nombreV = sc.nextInt();
            for (int i=0;i<nombreV;i++){
                
                 System.out.println( "id:"+vehicules.get(i).idVehicule+" | De kilometrage: " + vehicules.get(i).getKilometrage()+ " | De marque: " + vehicules.get(i).getMarque());
            }
}
}



