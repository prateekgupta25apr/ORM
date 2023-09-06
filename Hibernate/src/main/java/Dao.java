import org.hibernate.SessionFactory;

public interface Dao {

    boolean save(SessionFactory factory,Table1Entity entity);

    void read(SessionFactory factory);

    boolean update(SessionFactory factory,Table1Entity entity);
}
