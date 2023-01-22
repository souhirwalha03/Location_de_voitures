import java.util.*;


public class Client extends Utilisateur {
    private int id_client;
    public static ArrayList<Client> clients = new ArrayList<Client>();
    public static int nombreClients=0;


//associations
    
    public  ArrayList <Vehicule> vehicules;



//constructeur
    public Client (int id_client,String nom, String prenom){
        super(nom, prenom);
        this.id_client=id_client;
        nombreClients ++;
        this.vehicules = new ArrayList<>();

    }

    public Client () {nombreClients ++;
        this.vehicules = new ArrayList<>();
    }

//getter
    public int getIdClient (){
        return this.id_client;
    }


    public ArrayList <Vehicule> getvehicule() {
        return this.vehicules;
    }

//setter
    public void setIdClient (int id_client){
        this.id_client = id_client;
    }

    public void setVehicule (ArrayList <Vehicule> vehicules){
        this.vehicules = vehicules;
    }

//toString

public String toString(){
         
    return "Id:"+ this.id_client + " | Nom:"+ this.getNom()
     +" | Prenom:"+ this.getPrenom()  ;
}

//methode ajouter un client
public static void  ajouter_client(){
    Scanner sc =new Scanner(System.in);
    Client cl=new Client();

    System.out.println("id:");
    cl.setIdClient(sc.nextInt()); 
    System.out.println("Nom");
    cl.setNom(sc.next());
    System.out.println("Prenom");
    cl.setPrenom(sc.next());
    
    Client.clients.add(cl);
}

//method afficher la liste des clients
public static void affClients (){
    for (int i=0;i<nombreClients;i++){
        { 
            if (i==0){
                System.out.println("La liste des Clients:");
            }
            System.out.println( "id:"+Client.clients.get(i).id_client+" | Nom: " + Client.clients.get(i).getNom()+ " | Prénom: " + Client.clients.get(i).getPrenom());
        }
    }
}

//recherche
public static int Recherche_client (int id) {

    int v=-1;
    int i=0;
    
    
            while(i<nombreClients) {
                if ( Client.clients.get(i).getIdClient() == id )
                {
                        v = clients.indexOf(Client.clients.get(i));
                }
                i++;
            }
            if (v==-1)
            System.out.println("wrong id");
    
    
     return v ;
    }

//afficher la liste des vehicules reservée par un client
public static void aff_vehicules(Client c ){
    if (c.vehicules.size()==0)
        System.out.println("aucune réservation ");
        else {
            for (int i=0;i<c.vehicules.size();i++){
                { 
                    if (i==0){
                        System.out.println("La liste des vehicules reservée par ce client:");
                    }
                    System.out.println( "id:"+c.vehicules.get(i).getIdVehicule()+" | De kilometrage: " + c.vehicules.get(i).getKilometrage()+ " | De marque: " + c.vehicules.get(i).getMarque());

                }
        }
    }

}
    


    
    
}

