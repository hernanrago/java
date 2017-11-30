package net.helvault.hibernate.etc;

import java.util.List;
import net.helvault.hibernate.entities.Auto;
import net.helvault.hibernate.sessionmanager.SessionManager;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hernan
 */
public class TestQueriesParametrizadas {
    
    public static List<Auto> obtenerAutosSegunCritero(Session session,String anoModelo,String marca) {
        Query query=session.createQuery("from Auto where anoModelo like :ano_modelo and marca like :marca");
        query.setParameter("ano_modelo", '%'+anoModelo);
        query.setParameter("marca",marca+"%");
        if(anoModelo.equals("")&&marca.equals("")){
        query=session.createQuery("from Auto");
        }
        List<Auto> autos=query.list();
        
        return autos;
    }
    
}
