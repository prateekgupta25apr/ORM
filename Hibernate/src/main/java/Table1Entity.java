import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table1")
public class Table1Entity {
    @Id
    @GenericGenerator(name = "autoincrement", strategy = "increment")
    @GeneratedValue(generator = "autoincrement")
    Integer id;

    String name;

    @Override
    public String toString() {
        return "Table1Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
