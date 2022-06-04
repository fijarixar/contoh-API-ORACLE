package com.example.juniorprogrammer.apicrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mobilku")
public class CarEntity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String mobil;
private String warna;
private String nomor;
private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobil='" + mobil + '\'' +
                ", warna='" + warna + '\'' +
                ", nomor='" + nomor + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
