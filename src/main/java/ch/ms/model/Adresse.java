package ch.ms.model;

import javax.persistence.*;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String strasseNr;

    @Column(nullable = false)
    private String ort;

    @Column(nullable = false)
    private int plz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrasseNr() {
        return strasseNr;
    }

    public void setStrasseNr(String strasseNr) {
        this.strasseNr = strasseNr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }
}
