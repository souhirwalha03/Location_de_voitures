import java.util.*;


public class Client extends Utilisateur {
    private int id_client;

//associations
    private ArrayList <Contrat> contrats;
    private ArrayList <Facture> factures;
    private ArrayList <Vehicule> vehicules;



//constructeur
    public Client (int id_client) {
        this.id_client=id_client;
        contrats = new  ArrayList<Contrat>();
        factures = new  ArrayList<Facture>();
        vehicules = new  ArrayList<Vehicule>();
    }

    public Client (int id_client,String nom, String prenom, String login, String mdp ){
        super(nom, prenom,login, mdp);
        this.id_client=id_client;
        
    }

//getter
    public int getIdClient (){
        return this.id_client;
    }

    public ArrayList <Contrat> getContrat() {
        return(contrats);
    }

    public ArrayList <Facture> getfacture() {
        return(factures);
    }

    public ArrayList <Vehicule> getvehicule() {
        return(vehicules);
    }

//setter
    public void setIdClient (int id_cient){
        this.id_client = id_client;
    }

//toString




//affichage_liste_client
     public String afficher_client(){
        return toString();

    }


//remove contrat

//public void remove(Contrat c){
//    contrats.remove(c);
//}



    
    
}

