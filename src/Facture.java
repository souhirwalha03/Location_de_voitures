import java.util.*;


public class Facture {

       private int idfac ;
       private String datefac ;
       public static ArrayList<Facture> factures = new ArrayList<Facture>();
          public static int  nombreFactures ;

//association
     private Agent agent;
    
// constructeur 
     public Facture(int idfac , String datefac , int prix_journalie_convenu , Agent agent,Location l){
        this.idfac=idfac;
        this.datefac=datefac;
        this.agent=agent;
        l.prix_journalie_convenu=prix_journalie_convenu;
        nombreFactures++;

     }
     public Facture(){
          nombreFactures++;
     };

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

       public String toString(){
     
          return "id:"+this.idfac+" | Date : " + this.getDatefac()+ " | affectuée par : " + this.agent.getidAgent() ;
     }
    
//ajouter facture 
     public static void  ajouter_facture(){
          Scanner sc =new Scanner(System.in);
              Facture f=new Facture();
              System.out.println("Entrer l'id de la facture");
              f.setIdfac(sc.nextInt());
              System.out.println("Entrer la date de la facture (jj/mm/aaaa):");
              f.setDatefac(sc.next()); 
              System.out.println("Entrer l'id de l'agent responsable");
               int p=sc.nextInt();
               int rech=Agent.Recherche_Ag(p);
               if (rech==-1)
               {
                    System.out.println("il n'existe pas un agent qui a un id "+p);
               }
               else 
                    f.setagent(Agent.Agents.get(rech));

              Facture.factures.add(f);

          
      }

      ///methode d'affichage de la liste des Factures
    public static void afficher_factures (){
       
     for (int i=0;i<nombreFactures;i++){ 
         if (i==0){
             System.out.println("La liste des factures:");
         }
         System.out.println( "id:"+Facture.factures.get(i).idfac+" | Date : " + Facture.factures.get(i).getDatefac()+ " | affectuée par : " + Facture.factures.get(i).getagent() );
         
     }
}

///methode de calcul du montant
      
public static double Calcul_montant(Location L){
     return L.duree*L.prix_journalie_convenu; 
}

     
}