import java.util.*;


public class Facture {

       private int idfac ;
       private String datefac ;
       public static ArrayList<Facture> factures = new ArrayList<Facture>();
     public static int  nombreFactures ;
        
//association
     private Agent agent;
    
// constructeur 
     public Facture(int idfac , String datefac , int prix_journalie_convenu , Agent agent){
        this.idfac=idfac;
        this.datefac=datefac;
        this.agent=agent;
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
    public static void afficher_facture (){
     Scanner sc =new Scanner(System.in);

     //System.out.println("Entrez l'id du client qui a effectué la location");
     //int d1=sc.nextInt();
     //System.out.println("Entrez l'id de la voiture louée");
       //   int d=sc.nextInt();
       for (int j=0; j<Location.nombrelocations;j++){ 
          for (int i=0; i<nombreFactures;i++){ 

               //int k=Location.Recherche_location(Location.Locations.get(j).client.getIdClient(),Location.Locations.get(j).vehicule.getIdVehicule());
               
               ////if (k==-1)
              // System.out.println("erreur");
                    //else
                    { float x = Facture.Calcul_montant(Location.Locations.get(j));
                    
                              //if (Location.Locations.get(k).getclient().getIdClient()==d1 && Location.Locations.get(k).getVehiculet().getIdVehicule()==d)
                                   System.out.println( "id facture:"+Facture.factures.get(i).idfac+" | Date de facture : " + Facture.factures.get(i).getDatefac()+
                                   "\n | Date début de location : " +Location.Locations.get(j).dateDebut+" | id client: "
                                   +Location.Locations.get(j).client.getIdClient()+" | id vehicule: "
                                   +Location.Locations.get(j).vehicule.getIdVehicule()+
                                    "\n| affectuée par l'agent : " + Facture.factures.get(i).getagent()+" |\n Montant totale : " + x  );
                                    System.out.println();
                         }
                         
                    }
               
          
     }
}


///methode de calcul du montant
public static  float Calcul_montant(Location L){

     return L.duree*L.vehicule.prix; 
}



     
}