import java.util.*;


public class Facture {

       private int idfac ;
       private String datefac ;
       private float prix_journalie_convenu;

//association
     private Client client;
     private Agent agent;
    
// constructeur 
     public Facture(int idfac , String datefac , int nbr_jours_location, float prix_journalie_convenu){
        this.idfac=idfac;
        this.datefac=datefac;
        this.prix_journalie_convenu=prix_journalie_convenu;
     }
public Facture(){};

 //getters and setters
    public float getPrix_journalie_convenu(){
     return this.prix_journalie_convenu;}

    public int getIdfac(){
         return this.idfac;
    }
    public String getDatefac(){
         return this.datefac;
    }
    public void setPrix_jounalie_convenu( float prix_journalie_convenu ){
    this.prix_journalie_convenu=prix_journalie_convenu ;
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
      public double Calcul_montant( Facture F){
          Scanner sc =new Scanner(System.in);
          System.out.println("Donner le nombre de jours de location");
          int nbreJ = sc.nextInt();
          return nbreJ*F.getPrix_journalie_convenu();
       
      }

     
     
