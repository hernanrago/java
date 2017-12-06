package net.helvault.hibernate.etc;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hernan
 */
public class TestPaginacion {
    
    public static List <Auto> getAutosConPaginacion (Session session, int registroInicial, int cantidad) {
        
        Query query=session.createQuery("from Auto");
        query.setFirstResult(registroInicial);
        query.setMaxResults(cantidad);
        
        List<Auto> autos = query.list();
        
        return autos;
    }
}
