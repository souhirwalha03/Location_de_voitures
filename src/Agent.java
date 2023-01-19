import java.util.*;


public class Agent extends Utilisateur {
    private int id_agent;

//associations
    private ArrayList <Facture> factures;
   
    
//constructeur
    public Agent (int id_agent,String nom, String prenom){
        super(nom, prenom);
        this.id_agent=id_agent;

        //contrats = new  ArrayList<Contrat>();
        //factures = new  ArrayList<Facture>();
        nombreAgents ++;
    }
    public Agent () {
        nombreAgents++;
    }


//get
    public int getidAgent (){
        return this.id_agent;
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

   

//afficher liste d'agent
     //public String afficher_agent(){
     //   return toString(getidAgent());

    //}

    public static void affAgents (ArrayList<Agent> Agents){
        for (int i=0;i<nombreAgents;i++){
            
             System.out.println( "id:"+Agents.get(i).id_agent+" | Nom: " + Agents.get(i).getNom()+ " | Prénom: "+ Agents.get(i).getPrenom());
        }
    }
    
    

    
}
