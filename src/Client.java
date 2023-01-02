public class Client extends Utilisateur {
    private int id_client;
    
    public Client (int id_client) {
        this.id_client=id_client;
    }
    public Client (int id_client,String nom, String prenom, String login, String mdp ){
        super(nom, prenom,login, mdp);
        this.id_client=id_client;
        
    }

    public int getIdClient (){
        return this.id_client;
    }

    public void setIdClient (int id_cient){
        this.id_client = id_client;
    }

     public String afficher_client(){
        return toString();

    }

    
    
}
