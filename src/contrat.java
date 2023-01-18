import java.util.*;


 public class Contrat {

    private int numcontrat;
    private String datecontrat;
    private float kmdedepart;
    private float kmderetour;
    
//association
    private Client client;
    private Agent agent;

    

// constrcuteur

public Contrat(int numcontrat, String premierconducteur , String secondconducteur ,  String datecontrat ,  float kmdedepart , float kmderetour ){
    this.numcontrat=numcontrat;
    this.datecontrat=datecontrat;
    this.kmdedepart=kmdedepart;
    this.kmderetour=kmderetour;
    
}
public Contrat(){}

//getters&setters

public int getNumcontart(){
    return this.numcontrat;
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
public void consulter_contrat(Contrat C){
    System.out.println("Le numéro de contrat est:"+numcontrat+"\nLa date du contrat est:"+datecontrat+"\nKm de depart est:"+kmdedepart+"\nKm de retour est:"+kmderetour+"\nLe prix journalie convenu");
}
}

