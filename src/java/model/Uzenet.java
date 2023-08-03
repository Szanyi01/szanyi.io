/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Uzenet implements Serializable{
    
    private int id;
    private String name;
    private String email;
    private String telefonszam;
    private String targy;
    private String uzenet;

    public Uzenet() {
    }

    public Uzenet(int id, String name, String email,String telefonszam, String targy, String uzenet) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefonszam = telefonszam;
        this.targy = targy;
        this.uzenet = uzenet;
    }

    public Uzenet(String name, String email, String telefonszam, String targy, String uzenet) {
        this.name = name;
        this.email = email;
        this.telefonszam = telefonszam;
        this.targy = targy;
        this.uzenet = uzenet;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getTargy() {
        return targy;
    }

    public void setTargy(String targy) {
        this.targy = targy;
    }

    public String getUzenet() {
        return uzenet;
    }

    public void setUzenet(String uzenet) {
        this.uzenet = uzenet;
    }
    
    
    
    
}
