package ch.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Angestellter extends User{

    @Column(nullable = false)
    private int angestelltSeit;

    public int getAngestelltSeit() {
        return angestelltSeit;
    }

    public void setAngestelltSeit(int angestelltSeit) {
        this.angestelltSeit = angestelltSeit;
    }
}
