import java.util.*;


public class Utilisateur {
    
    private String nom;
    private String prenom;
    private String login;
    private String mdp;

    
//CONSTRUCTOR
    public Utilisateur(String nom,String prenom, String login, String mdp)
        {
            this.nom=nom;
            this.prenom=prenom;
            this.login=login;
            this.mdp=mdp;
        }
    public Utilisateur (){}

//setter&getter nom
     public String getNom(){
        return this.nom;
    }

 
    public void setNom (String nom){
        this.nom=nom;
    }

//setter&getter prenom
     public String getPrenom(){
        return this.prenom;
    }


    public void setPrenom (String prenom){
        this.prenom=prenom;
    }

//setter&getter login
    public String getLogin(){
    return this.login;
    }


    public void setLogin (String login){
    this.login=login;
    }

//setter&getter mdp
    public String getmdp(){
    return this.mdp;
    }


        public void setmdp (String mdp){
    this.mdp=mdp;
}


 public String toString() {
    return "User name: " + this.getNom() + ", user prenom: " + this.getPrenom()+", user login: " + this.getLogin();
}




}
