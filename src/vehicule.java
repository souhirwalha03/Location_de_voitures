public class vehicule {
	
        private int idVehicule;
        private int kilometrage ;
        private int nbrPlaces ;
        private float prixlocation;
        private String marque;
        private String immatriculation ;
        private String couleur;
        private int dispo;  
    
       //constructeur
       
        public vehicule(int idVehicule, int kilometrage , int nbrPlaces , float prixlocation , String marque , String immatriculation , String couleur, int dispo)
        {
            this.idVehicule=idVehicule;
            this.kilometrage=kilometrage;
            this.nbrPlaces=nbrPlaces;
            this.prixlocation=prixlocation;
            this.marque=marque;
            this.immatriculation=immatriculation;
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
    
       public int getKilometrage(){
        return this.kilometrage;
       }
       public void setKilometrage ( int kilometrage){
          this.kilometrage=kilometrage;
       }
    
       public int getNbrPlaces()
       { 
        return this.nbrPlaces;
       }
       public void setNbrPlaces (int nbrPlaces){
        this.nbrPlaces=nbrPlaces;
       }
    
        public float getPrixlocation(){
            return this.prixlocation;
        }
        public void setPrixlocation(float prixlocation){
            this.prixlocation=prixlocation;
        }
    
        public String getMarque() {
            return this.marque;
        }
        public void setMarque( String marque ) {
            this.marque=marque ;
        }
    
        public String getImmatriculation(){
            return this.immatriculation;
        }
        public void setImmatriculation( String immatriculation){
            this.immatriculation=immatriculation ;
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
         
        System.out.println("Id:"+ idVehicule + "Kilometrage\n"+ kilometrage + "Nombre de places:\n"+nbrPlaces + "Prix de location\n"+prixlocation + "Marque\n"+ marque + "Immatriculation:\n"+ immatriculation +"Disponibilité:\n" + dispo);
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
    

