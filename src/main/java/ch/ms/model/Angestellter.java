package ch.ms.model;

import javax.persistence.*;

@Entity
public class Angestellter extends User{

    @Column
    private int angestelltSeit;

    public int getAngestelltSeit() {
        return angestelltSeit;
    }

    public void setAngestelltSeit(int angestelltSeit) {
        this.angestelltSeit = angestelltSeit;
    }
}
