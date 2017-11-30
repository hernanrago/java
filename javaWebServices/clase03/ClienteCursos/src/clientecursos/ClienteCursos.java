package clientecursos;

public class ClienteCursos {

    public static void main(String[] args) {
        // TODO code application logic here
        NewJerseyClient cliente = new NewJerseyClient();
        String Q=cliente.countREST();
        System.out.println(Q);
        NewJerseyClient newJerseyClient = cliente.find_JSON(NewJerseyClient.class,);
        
        
    }
    
}
