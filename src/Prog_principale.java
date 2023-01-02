import java.util.*;

public class Prog_principale {
    public static void main(String[] args) {
        Client client1 = new Client(123,"emma", "mmmm", "emma03", "1234");
        System.out.println(client1.toString());

        Client client2 = new Client(253,"leila", "pppp", "leila03", "12345");
        System.out.println(client2.toString());

        Client client3 = new Client(253,"hennah", "DDDDD", "hennah03", "12345");
        System.out.println(client3.toString());

        List<Utilisateur> Users = new ArrayList<Utilisateur>();
        Users.add(client1);
        Users.add(client2);
        Users.add(client3);
    
		
        
    }
}
