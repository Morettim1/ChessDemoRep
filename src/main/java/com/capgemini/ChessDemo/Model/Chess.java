package com.capgemini.ChessDemo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Chess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long        id;
    String      voornaam;
    String      achternaam;
    String      tussenvoegsel;
    LocalDate   geboortedatum;
    int         gewonnenPartijen;
    int         remises;
    int         verlorenPartijen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public int getGewonnenPartijen() {
        return gewonnenPartijen;
    }

    public void setGewonnenPartijen(int gewonnenPartijen) {
        this.gewonnenPartijen = gewonnenPartijen;
    }

    public int getRemises() {
        return remises;
    }

    public void setRemises(int remises) {
        this.remises = remises;
    }

    public int getVerlorenPartijen() {
        return verlorenPartijen;
    }

    public void setVerlorenPartijen(int verlorenPartijen) {
        this.verlorenPartijen = verlorenPartijen;
    }
}


