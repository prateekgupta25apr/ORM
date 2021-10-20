package PrateekGupta.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "butterfly_details")
public class DTO {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "speciesName")
    private String speciesName;
    @Column(name = "wingSize")
    private int wingSize;
    @Column(name = "wingColor")
    private String wingColor;
    @Column(name = "age")
    private int age;
    @Column(name = "origin")
    private String origin;
    @Column(name = "antennaeSize")
    private int antennaeSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAntennaeSize() {
        return antennaeSize;
    }

    public void setAntennaeSize(int antennaeSize) {
        this.antennaeSize = antennaeSize;
    }

    @Override
    public String toString() {
        return "ButterFly {" +
                "id=" + id +
                ", speciesName='" + speciesName + '\'' +
                ", wingSize=" + wingSize +
                ", wingColor='" + wingColor + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                ", antennaeSize=" + antennaeSize +
                '}';
    }
}
