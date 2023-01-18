import java.util.Scanner;
public class facture {

       private int idfac ;
       private String datefac ;
       private float prix_journalie_convenu;
    
// constructeur 
     public facture(int idfac , String datefac , int nbr_jours_location, float prix_journalie_convenu){
        this.idfac=idfac;
        this.datefac=datefac;
        this.prix_journalie_convenu=prix_journalie_convenu;
     }
public facture(){};

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
     public void consulter_facture(facture F){
     System.out.println("L'id de cette facture est:"+idfac+ "\n Elle effectuée le "+datefac + "\nLe prix journalie convenu");
     }
      ///methode de calcul du montant
      public double Calcul_montant( facture F){
          Scanner sc =new Scanner(System.in);
          System.out.println("Donner le nombre de jours de location");
          int nbreJ = sc.nextInt();
          return nbreJ*F.getPrix_journalie_convenu();
       
      }

     }