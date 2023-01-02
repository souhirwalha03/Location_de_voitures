public class Agent extends Utilisateur {
    private int id_agent;
    
    public Agent (int id_agent) {
        this.id_agent=id_agent;
    }
    public Agent (int id_agent,String nom, String prenom, String login, String mdp ){
        super(nom, prenom,login, mdp);
        this.id_agent=id_agent;
        
    }

    public int getIdClient (){
        return this.id_agent;
    }

    public void setIdClient (int id_cient){
        this.id_agent = id_agent;
    }

     public String afficher_agent(){
        return toString();

    }

    
}
