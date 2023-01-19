import java.util.*;


public class Client extends Utilisateur {
    private int id_client;
    //private static List<Client> clients = new ArrayList<Client>();


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
    public void setIdClient (int id_cient){
        this.id_client = id_client;
    }

    public void setVehicule (ArrayList <Vehicule> vehicules){
        this.vehicules = vehicules;
    }

//toString

public String toString(int id_client){
    return toString(getIdClient());
}



//affichage_liste_client
 //    public String afficher_client(){
  //     return toString(getIdClient());

  //  }


//remove contrat

//public void remove(Contrat c){
//    contrats.remove(c);
//}


public static void affClients (ArrayList<Client> clients){
    for (int i=0;i<nombreClients;i++){
        
         System.out.println( "id:"+clients.get(i).id_client+" | Nom: " + clients.get(i).getNom()+ " | Prénom: " + clients.get(i).getPrenom());
    }
}

    
    
}

