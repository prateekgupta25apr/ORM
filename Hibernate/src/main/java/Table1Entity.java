import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "table1")
@NamedQueries({
        @NamedQuery(name = "getAll",query = "from Table1Entity"),
        @NamedQuery(name = "updateName",
                query = "update Table1Entity set name=:providedName " +
                        "where id=:providedId")
})
public class Table1Entity {
    @Id
    @GenericGenerator(name = "autoincrement", strategy = "increment")
    @GeneratedValue(generator = "autoincrement")
    Integer id;

    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Table1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
