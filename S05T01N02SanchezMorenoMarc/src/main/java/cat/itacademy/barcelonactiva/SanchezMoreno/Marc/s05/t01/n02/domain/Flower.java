package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain;

import jakarta.persistence.*;


@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String country;

    public Flower() {
    }

    public Integer getid() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country =country;
    }
}
