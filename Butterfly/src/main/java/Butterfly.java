import prateekgupta.entity.ButterflyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Butterfly {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory= configuration.buildSessionFactory();
        Session session= factory.openSession();
        ButterflyEntity butterflyEntity =session.get(ButterflyEntity.class,1);
        System.out.println(butterflyEntity);
        session.close();
        factory.close();
    }
}
