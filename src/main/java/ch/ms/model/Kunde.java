package ch.ms.model;

import javax.persistence.Column;

public class Kunde extends User{

    @Column(nullable = false)
    private Firma firma;

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }
}
