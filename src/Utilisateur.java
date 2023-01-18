import java.util.*;


public class Utilisateur {
    
    private String nom;
    private String prenom;
    
//CONSTRUCTOR
    public Utilisateur(String nom,String prenom)
        {
            this.nom=nom;
            this.prenom=prenom;
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



 public String toString(int id) {
    return "id:"+id+"| Nom: " + this.getNom() + "| Prénom: " + this.getPrenom();
}




}
