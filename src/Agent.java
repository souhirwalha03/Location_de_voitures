import java.util.*;


public class Agent extends Utilisateur {

    private int id_agent;
    public static ArrayList<Agent> Agents = new ArrayList<Agent>();
    public static int nombreAgents;

//associations
    private ArrayList <Facture> factures;
    private ArrayList <Vehicule> vehicules=Vehicule.vehicules;

   
    
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

//toString
public String toString(){
         
    return "Id:"+ this.id_agent + " | Nom:"+ this.getNom()
     +" | Prenom:"+ this.getPrenom()  ;
}


//methode ajouer un agent
public static void  ajouter_agent(){
        Scanner sc =new Scanner(System.in);
        Agent ag=new Agent();

        System.out.println("id:");
        ag.setidAgent(sc.nextInt()); 
        System.out.println("Nom");
        ag.setNom(sc.next());
        System.out.println("Prenom");
        ag.setPrenom(sc.next());
        
        Agent.Agents.add(ag);
    
}




 //methode afficher liste des agents
    public static void affAgents (ArrayList<Agent> Agents){
        for (int i=0;i<nombreAgents;i++){
            { if (i==0){
                System.out.println("La liste des Agents:");
                }
             System.out.println( "id:"+Agents.get(i).id_agent+" | Nom: " + Agents.get(i).getNom()+ " | Prénom: "+ Agents.get(i).getPrenom());
            }
        }
    }




    
   
}
