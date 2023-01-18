public class contrat {
    private int numcontrat;
    private String premierconducteur;
    private String secondconducteur;
    private String datecontrat;
    private float kmdedepart;
    private float kmderetour;
    

// constrcuteur

public contrat(int numcontrat, String premierconducteur , String secondconducteur ,  String datecontrat ,  float kmdedepart , float kmderetour ){
    this.numcontrat=numcontrat;
    this.premierconducteur=premierconducteur;
    this.secondconducteur=secondconducteur;
    this.datecontrat=datecontrat;
    this.kmdedepart=kmdedepart;
    this.kmderetour=kmderetour;
    
}
public contrat(){}

//getters&setters

public int getNumcontart(){
    return this.numcontrat;
}

public String getPremierconducteur(){
    return this.premierconducteur;
}

public String getSecondconducteur(){
    return this.secondconducteur;
}

public String getDatecontrat(){
    return this.datecontrat;
}

public float getKmdedepart(){
    return this.kmdedepart;
}

public float getKmderetour(){
    return this.kmderetour;
}

public void setNumcontrat( int numcontrat ){
    this.numcontrat=numcontrat ;
}

public void setPremierconducteur( String premierconducteur ){
        this.premierconducteur=premierconducteur ; 
}       
public void setSecondconducteur( String secondconducteur ){
            this.secondconducteur=secondconducteur ;  
}

public void setDatecontrat( String datecontrat ){
                this.datecontrat=datecontrat ;
}

public void setKmdedepart( float kmdedepart ){
    this.kmdedepart=kmdedepart ;
}

public void setKmderetour( float kmderetour ){
    this.kmderetour=kmderetour ;
}


/// methode consulter contrat
public void consulter_contrat(contrat C){
    System.out.println("Le numéro de contrat est:"+numcontrat+"\nLe premier conducteur est:"+premierconducteur+"\nLe second conducteur est:"+secondconducteur+"\nLa date du contrat est:"+datecontrat+"\nKm de depart est:"+kmdedepart+"\nKm de retour est:"+kmderetour+"\nLe prix journalie convenu");
}
}
