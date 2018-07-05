package com.poslovna.poslovna.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class KursUValuti {

    @Id
    private long id;

    private Float kupovni;

    private Float prodajni;

    private Float srednji;

    @ManyToOne
    private Valuta osnovna;

    @ManyToOne
    private Valuta prema;

    @ManyToOne
    private KursnaLista pripada;

    public KursUValuti() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Float getKupovni() {
        return kupovni;
    }

    public void setKupovni(Float kupovni) {
        this.kupovni = kupovni;
    }

    public Float getProdajni() {
        return prodajni;
    }

    public void setProdajni(Float prodajni) {
        this.prodajni = prodajni;
    }

    public Float getSrednji() {
        return srednji;
    }

    public void setSrednji(Float srednji) {
        this.srednji = srednji;
    }

    public Valuta getOsnovna() {
        return osnovna;
    }

    public void setOsnovna(Valuta osnovna) {
        this.osnovna = osnovna;
    }

    public Valuta getPrema() {
        return prema;
    }

    public void setPrema(Valuta prema) {
        this.prema = prema;
    }

    public KursnaLista getPripada() {
        return pripada;
    }

    public void setPripada(KursnaLista pripada) {
        this.pripada = pripada;
    }
}
