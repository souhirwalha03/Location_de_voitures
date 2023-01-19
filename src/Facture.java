import java.util.*;


public class Facture {

       private int idfac ;
       private String datefac ;
       

//association
     private Agent agent;
    
// constructeur 
     public Facture(int idfac , String datefac , int nbr_jours_location, Agent agent){
        this.idfac=idfac;
        this.datefac=datefac;
        this.agent=agent;
     }
     public Facture(){};

 //getters and setters
     public Agent getagent(){
     return this.agent;
     }

     public void setagent( Agent agent ){
      this.agent=agent ;
     }

    public int getIdfac(){
         return this.idfac;
    }
    public String getDatefac(){
         return this.datefac;
    }
    

    public void setIdfac( int idfac ){
        this.idfac=idfac ;
       }
    public void setDatefac( String datefac ){
        this.datefac=datefac ;
       }
    

       ///methode consulter facture
     public void consulter_facture(Facture F){
     System.out.println("L'id de cette facture est:"+idfac+ "\n Elle effectuée le "+datefac + "\nLe prix journalie convenu");
     }
      ///methode de calcul du montant
      public double Calcul_montant(Location L){
     return L.duree*L.prix_journalie_convenu;
         
}
}