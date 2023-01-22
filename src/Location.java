import java.util.*;
public class Location {

    
    
    public String dateDebut ;
    public int duree;
    public static ArrayList<Location> Locations = new ArrayList<Location>();
    public static int  nombrelocations = 0 ;

    public Client client;
    public Vehicule vehicule;


    public Vehicule getVehiculet(){
        return this.vehicule;
    }
    public void setVehicule( Vehicule vehicule ){
         this.vehicule=vehicule ;
    }

    public Client getclient(){
        return this.client;
    }
    public void setagent( Client client ){
         this.client=client ;
    }
    //constrcuteur
    public Location(Client client, Vehicule vehicule, int duree, String dateDebut){
    this.client=client;
    this.vehicule=vehicule;
    this.duree=duree;
    this.dateDebut=dateDebut;
    nombrelocations++;

    }

    public Location(){nombrelocations++;
        
    }
    
    //Demande de location
    public static void demande_location(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Entrez votre id");
       int c = sc.nextInt();
       int i=Client.Recherche_client(c);

       if (i==-1){
            System.out.println("you have to register first");
        }
       else {

                System.out.println("Entrez l'id de la voiture que vous voulez louer");
                Vehicule.afficher_vehicules();
                
                int choix = sc.nextInt();
                int index=Vehicule.Recherche_voiture(choix);

                if (index == -1){
                    System.out.println("wrong id ");}
                    else 
                    {
                        if ( Vehicule.vehicules.get(index).getDispo() == 1 ) 
                            {   
                                Location l = new Location() ;
                                l.client = Client.clients.get(i);
                                l.vehicule = Vehicule.vehicules.get(index);
                                System.out.println("entrez la durée de location");
                                int a = sc.nextInt();
                                l.duree=a;

                                System.out.println("entrez la date de location (jj/mm/aaaa)");
                                String b = sc.next();
                                l.dateDebut=b;

                                Location.Locations.add(l);
                                
                                Vehicule.vehicules.get(index).clients.add(Client.clients.get(i)); 
                                Client.clients.get(i).vehicules.add(Vehicule.vehicules.get(index));
                            
                                
                            }
                        else if (Vehicule.vehicules.get(index).getDispo() == 0 )
                        {          
                                System.out.println("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est déjà louée");
                        }
                        
                    }
            
            }

        }




        public static void demande_location(int c,int choix, int a, String b){
            
           int i=Client.Recherche_client(c);
    
           if (i==-1){
                System.out.println("you have to register first");
            }
           else {   int index=Vehicule.Recherche_voiture(choix);
    
                    if (index == -1){
                        System.out.println("wrong id ");}
                        else 
                        {
                            if ( Vehicule.vehicules.get(index).getDispo() == 1 ) 
                                {   
                                    Location l = new Location() ;
                                    l.client = Client.clients.get(i);
                                    l.vehicule = Vehicule.vehicules.get(index);
                                    l.duree=a;
                                    l.dateDebut=b;
    
                                    Location.Locations.add(l);
                                    
                                    Vehicule.vehicules.get(index).clients.add(Client.clients.get(i)); 
                                    Client.clients.get(i).vehicules.add(Vehicule.vehicules.get(index));
                                
                                    
                                }
                            else if (Vehicule.vehicules.get(index).getDispo() == 0 )
                            {          
                                    System.out.println("La voiture d'id : "+Vehicule.vehicules.get(index).getIdVehicule()+" est déjà louée");
                            }
                            
                        }
                
                }
    
            }

        public  static void afficher_locations (){
            if(Location.Locations.isEmpty() == true )
            System.out.println("aucun location");
            else{
            for (int i=0;i<nombrelocations;i++){ 
                if (i==0){
                    System.out.println("La liste des locations:");
                }
                System.out.println( "client id :"+Location.Locations.get(i).client.getIdClient()+" | véhicule id : " 
                + Location.Locations.get(i).vehicule.getIdVehicule()+ " | Date début: " + Location.Locations.get(i).dateDebut
                +" | Durée: " + Location.Locations.get(i).duree);
            }}
    }

    public static int Recherche_location (int idc ,int idv) {

        int v=-1;
        
        
                for (int i=0;i<nombrelocations;i++){
                    if ( Location.Locations.get(i).client.getIdClient() == idc && Location.Locations.get(i).vehicule.getIdVehicule() == idv)
                    {
                            v = Locations.indexOf(Location.Locations.get(i));
                    }
                    
                }
                if (v==-1)
                System.out.println("Location n'est pas trouvée");
        
        
         return v ;
        }

        public  static void afficher_loc (int  i){
       
        {
            if(Location.Locations.isEmpty() == true )
            System.out.println("aucun location");
            else{
                System.out.println( "client id :"+Location.Locations.get(i).client.getIdClient()+" | véhicule id : " 
                + Location.Locations.get(i).vehicule.getIdVehicule()+ " | Date début: " + Location.Locations.get(i).dateDebut
                +" | Durée: " + Location.Locations.get(i).duree);
            }}
    }

        
    }

