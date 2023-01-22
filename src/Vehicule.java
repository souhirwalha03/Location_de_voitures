
import java.util.*;

public class Vehicule {
	
    private int idVehicule;
    private int kilometrage ;
    private String marque;
    private int dispo; 
    public static int nombreVehicules;
    public static ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
    public int prix;
//associations
    public  ArrayList <Client> clients;
    private Agent agent;
    
//constructeur
    public Vehicule(int idVehicule, int kilometrage , String marque , int dispo,Agent agent,int prix)
    {
        this.idVehicule=idVehicule;
        this.kilometrage=kilometrage;
        this.marque=marque;
        this.dispo=dispo;    
        this.agent=agent;
        nombreVehicules ++; 
        this.clients = new ArrayList<>();
        this.prix=prix;
 

    }

    public Vehicule(){nombreVehicules++;}
   

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

///toString
    public String toString(){
     
        return "Id:"+ this.idVehicule + " | Kilometrage:"+ this.kilometrage
         +" | Marque:"+ this.marque  +" | Disponibilité:" + this.dispo +" | gérée par l'agent d'id:"+this.agent.getidAgent();
    }

//methodes

//ajouer
    public static void  ajouter_vehicule(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Donner le nombre de vehicules a ajouter");
        int nombre = sc.nextInt();
        
        for ( int i=1 ; i<nombre+1 ; i++) {
            Vehicule v=new Vehicule();
            System.out.println("Entrer l'id de la véhicule" + i);
            v.setIdVehicule(sc.nextInt()); 
            System.out.println("Entrer la marque");
            v.setMarque(sc.next());
            System.out.println("Entrer le kilométrage de la véhicule");
            v.setKilometrage(sc.nextInt());
            System.out.println("Entrer 1 si elle est dispo et 0 sinon");
            v.setDispo(sc.nextInt());
            System.out.println("Entrer l'id de l'agent responsable");
            int p=sc.nextInt();
            int rech=Agent.Recherche_Ag(p);
            
            if (rech==-1)
            {
                System.out.println("il n'existe pas un agent qui a un id "+p);
            }
            else 
                v.setagent(Agent.Agents.get(rech));

            Vehicule.vehicules.add(v);
        }
    }

///methode d'affichage de la liste des vehicules
    public  static void afficher_vehicules (){
       
        for (int i=0;i<nombreVehicules;i++){ 
            if (i==0){
                System.out.println("La liste des vehicules:");
            }
            System.out.println( "id:"+Vehicule.vehicules.get(i).idVehicule+" | De kilometrage: " + Vehicule.vehicules.get(i).getKilometrage()+ " | De marque: " + Vehicule.vehicules.get(i).getMarque());
        }
}

/// methode de verification de disponibilité 
    public static void EstDisponible(int index){
    
        if (index == -1){
            System.out.println("id not found");}
            else 
            {
                if ( Vehicule.vehicules.get(index).getDispo() == 1 ) 
                    System.out.println ("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est disponible à louer");

                else if (Vehicule.vehicules.get(index).getDispo() == 0 )
                {          
                        System.out.println("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est déjà louée");
                }
                
            }
            
        
    }

//recherche
public static int Recherche_voiture (int id) {

int v=-1;


        for (int i=0;i<nombreVehicules;i++){
            if ( Vehicule.vehicules.get(i).getIdVehicule() == id )
            {
                    v = vehicules.indexOf(Vehicule.vehicules.get(i));
            }
            
        }
        if (v==-1)
        System.out.println("wrong id");


 return v ;
}

//les clients reservent unr vehicule

public static void aff_clients(Vehicule v){
    if (v.clients.size()==0){
        System.out.println("aucune réservation");

    }else {
    for (int i=0;i<v.clients.size();i++){
        { 
            if (i==0){
                System.out.println("La liste des clients qui reservent ce voiture:");
            }
            System.out.println( "id:"+v.clients.get(i).getIdClient()+" | Nom : " + v.clients.get(i).getNom()+ " | Prénom: " + v.clients.get(i).getPrenom());

        }
    }
    }
}

}











    
       // for (int i=0;i<vehicules.size();i++){
        
         //    System.out.println( "id:"+vehicules.get(i).idVehicule+" | De kilometrage: " + vehicules.get(i).getKilometrage()+ " | De marque: " + vehicules.get(i).getMarque());
       // }}
       

       //chercher vehicule

      // public static Vehicule chercher(int id){
           // for( int i=0 ; i<vehicules.size(); i++){
               // if (vehicules.get(i).idVehicule==id){
                     //return vehicules.get(i);
      // }
   
//}
      // }
    

