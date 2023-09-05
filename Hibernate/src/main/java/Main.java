import com.prateek_gupta.utils.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {
        SessionFactory factory= SessionFactoryUtil.getFactory();
        Session session= factory.openSession();
        Table1Entity table1 =session.get(Table1Entity.class,1);
        System.out.println(table1);
        session.close();
        factory.close();
    }
}
