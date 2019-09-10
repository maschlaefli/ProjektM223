package ch.ms.model;

import javax.persistence.*;

@Entity
public class Kunde extends User{

    @ManyToOne
    @JoinColumn(name = "firma_id", nullable = true)
    private Firma firma;

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }
}
