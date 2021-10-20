import PrateekGupta.Entity.DTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Butterfly {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory= configuration.buildSessionFactory();
        Session session= factory.openSession();
        DTO dto=(DTO)session.get(DTO.class,1);
        System.out.println(dto);
        session.close();
        factory.close();
    }
}
