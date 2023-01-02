public class Utilisateur {
    private String nom;
    private String prenom;
    private String login;
    private String pwd;

    

    //CONSTRUCTOR
    public Utilisateur(String nom,String prenom)
        {
            this.nom=nom;
            this.prenom=prenom;
        }

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

//aff nom & prenom de l'utilisateur
    public void aff_Util(){
        System.out.print("name"+this.nom+",prenom"+this.prenom);
    }

    




}
