import java.util.*;


public class Agent extends Utilisateur {
    private int id_agent;

//associations
    private ArrayList <Contrat> contrats;
    private ArrayList <Facture> factures;
   
    
//constructeur
    public Agent (int id_agent) {
        this.id_agent=id_agent;
    }
    public Agent (int id_agent,String nom, String prenom, String login, String mdp ){
        super(nom, prenom,login, mdp);
        this.id_agent=id_agent;
        contrats = new  ArrayList<Contrat>();
        factures = new  ArrayList<Facture>();

        
    }

//get
    public int getidAgent (){
        return this.id_agent;
    }

//set
    public void setidAgent (int id_cient){
        this.id_agent = id_agent;
    }

//toString



//afficher liste d'agent
     public String afficher_agent(){
        return toString();

    }

    
}
