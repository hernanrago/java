package methods;

import entities.Auto;
import org.hibernate.SessionFactory;

public class AutoMethod extends GenericMethod<Auto> {

    public AutoMethod(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
