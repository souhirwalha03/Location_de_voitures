import java.util.*;


public class Agent extends Utilisateur {
    private int id_agent;

//associations
    private ArrayList <Contrat> contrats;
    private ArrayList <Facture> factures;
   
    
//constructeur
    public Agent (int id_agent,String nom, String prenom){
        super(nom, prenom);
        this.id_agent=id_agent;
        contrats = new  ArrayList<Contrat>();
        factures = new  ArrayList<Facture>();
    }
    public Agent () {}


//get
    public int getidAgent (){
        return this.id_agent;
    }

    public ArrayList <Contrat> getContrat() {
        return contrats;
    }
    public ArrayList <Facture> getFacture() {
        return factures;
    }

//set
    public void setidAgent (int id_cient){
        this.id_agent = id_agent;
    }

    public void setFacture (ArrayList <Facture> factures){
        this.factures = factures;
    }

    public void setContrat (ArrayList <Contrat> contrats){
        this.contrats = contrats;
    }

//afficher liste d'agent
     public String afficher_agent(){
        return toString(getidAgent());

    }

    
}
