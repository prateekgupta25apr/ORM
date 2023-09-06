import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DaoImpl implements Dao{

    @Override
    public boolean save(SessionFactory factory,Table1Entity entity) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public void read(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            Query<?> query=session.createNamedQuery("getAll");
            System.out.println(query.getResultList());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean update(SessionFactory factory, Table1Entity entity) {
        try(Session session = factory.openSession()) {
            Transaction transaction= session.beginTransaction();
            Query<?> query=session.createNamedQuery("updateName");
            query.setParameter("providedName",entity.getName());
            query.setParameter("providedId",entity.getId());
            query.executeUpdate();
            transaction.commit();
            return true;
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
