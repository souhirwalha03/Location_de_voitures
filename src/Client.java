import java.util.*;


public class Client extends Utilisateur {
    private int id_client;
    public static ArrayList<Client> clients = new ArrayList<Client>();
    public static int nombreClients=0;


//associations
    
    private ArrayList <Vehicule> vehicules;



//constructeur
    public Client (int id_client,String nom, String prenom){
        super(nom, prenom);
        this.id_client=id_client;
        nombreClients ++;
    }

    public Client () {nombreClients ++;}

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
public static void affClients (ArrayList<Client> clients){
    for (int i=0;i<nombreClients;i++){
        { 
            if (i==0){
                System.out.println("La liste des Clients:");
            }
            System.out.println( "id:"+clients.get(i).id_client+" | Nom: " + clients.get(i).getNom()+ " | Prénom: " + clients.get(i).getPrenom());
        }
    }
}



//affichage_liste_client
 //    public String afficher_client(){
  //     return toString(getIdClient());

  //  }


//remove contrat

//public void remove(Contrat c){
//    contrats.remove(c);
//}




    
    
}

