/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DBModel {
    private Connection conn;
    private PreparedStatement getUzenet;
    private PreparedStatement addUzenet;
    
    
    public DBModel(Connection conn) throws SQLException{
        this.conn = conn;
        getUzenet=conn.prepareStatement("SELECT * FROM uzenetek");
        addUzenet=conn.prepareStatement("INSERT INTO uzenet (nev,email,telefonszam,targy,uzenet) VALUES (?,?,?,?,?)");
    }
    
    
    public List<Uzenet> getUzenetek() throws SQLException{
         ResultSet rs = getUzenet.executeQuery();
        List<Uzenet> uzenetek = new ArrayList<>();
        while (rs.next()) {
            String name=rs.getString("nev");
            String email=rs.getString("email");
            String telefonszam=rs.getString("telefonszam");
            String targy = rs.getString("targy");
            String uzenet=rs.getString("uzenet");

            Uzenet uzi = new Uzenet(name,email,telefonszam,targy,uzenet);
            uzenetek.add(uzi);
        }
        return uzenetek;
    }
    public int addUzenet(Uzenet uzenet) throws SQLException{
    addUzenet.setString(1, uzenet.getName());
    addUzenet.setString(2, uzenet.getEmail());
    addUzenet.setString(3, uzenet.getTelefonszam());
    addUzenet.setString(4, uzenet.getTargy());   
    addUzenet.setString(5, uzenet.getUzenet()); 
    return addUzenet.executeUpdate();
}
    
    
    
}
