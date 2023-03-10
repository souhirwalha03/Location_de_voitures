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
        this.vehicules = new ArrayList<>();
        nombreAgents ++;
    }

    public Agent () {
        nombreAgents++;
    }

    
//getters
    public int getidAgent (){
        return this.id_agent;
    }

//setters
    public void setidAgent (int id_agent){
        this.id_agent = id_agent;
    }

//toString
public String toString(){
         
    return "Id:"+ this.id_agent + " | Nom:"+ this.getNom()+" | Prenom:"+ this.getPrenom()  ;
}


//methode ajouer un agent
public static void  ajouter_agent(){
        Scanner sc =new Scanner(System.in);
        Agent ag=new Agent();

        System.out.println("id:");
        ag.setidAgent(sc.nextInt()); 
        System.out.println("Nom:");
        ag.setNom(sc.next());
        System.out.println("Prénom:");
        ag.setPrenom(sc.next());
        
        Agent.Agents.add(ag);
    
}

 //methode afficher liste des agents
    public static void affAgents (){
        for (int i=0;i<nombreAgents;i++){
            { if (i==0){
                System.out.println("La liste des Agents :");
                }
             System.out.println( "id:"+Agent.Agents.get(i).id_agent+" | Nom: " + Agent.Agents.get(i).getNom()+ " | Prénom: "+ Agent.Agents.get(i).getPrenom());
            }
        }
    }

//recherche
    public static int Recherche_Ag (int id) {

        int v=-1;
        int i=0;
        
        
                while(i<nombreAgents) {
                    if ( Agent.Agents.get(i).getidAgent() == id )
                    {
                            v = Agents.indexOf(Agent.Agents.get(i));
                    }
                    i++;
                }
                if (v==-1)
                System.out.println("wrong id");
        
        
         return v ;
        }

    




    
   
}
