public class vehicule {
	
        private int idVehicule;
        private int nbrPlaces ;
        private String marque;
        private String couleur;
        private int dispo;  
    
       //constructeur
       
        public vehicule(int idVehicule, int nbrPlaces , String marque  , String couleur, int dispo)
        {
            this.idVehicule=idVehicule;
            this.nbrPlaces=nbrPlaces;
            this.marque=marque;
            this.couleur=couleur;
            this.dispo=dispo;        }
        public vehicule(){}


    // getters & setters 
    
        public int getIdVehicule(){
        return this.idVehicule;
        }
        public void setIdVehicule( int idVehicule ){
         this.idVehicule=idVehicule ;
        }
    
       public int getNbrPlaces()
       { 
        return this.nbrPlaces;
       }
       public void setNbrPlaces (int nbrPlaces){
        this.nbrPlaces=nbrPlaces;
       }
    
        public String getMarque() {
            return this.marque;
        }
        public void setMarque( String marque ) {
            this.marque=marque ;
        }
        public String getCouleur(){
            return this.couleur;
        }
        public void setCouleur( String couleur ){
            this.couleur=couleur;
        }
        public int getDispo(){
            return this.dispo;}

        public void setDispo(int dispo){
        this.dispo=dispo;
        }

        ///methode d'affichage 
        public void affichervehicule(vehicule V){
         
        System.out.println("Id:"+ idVehicule + "Nombre de places:\n"+nbrPlaces + "Marque\n"+ marque  +"Disponibilité:\n" + dispo);
        }

        /// methode de verification de disponibilité 
        public String EstDisponible(vehicule V){
            if ( V.dispo==0 )  {
                return("La voiture est disponible à louer");
            } else {
               return("La voiture est déjà louée ");
            }

       
        }
    }
    

