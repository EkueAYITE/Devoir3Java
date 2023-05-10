package Controlers;

import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtrlLivreur
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlLivreur() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<String> getAllLivreurs()
    {
        ArrayList<String> lesLivreurs = new ArrayList<>();

        // A vous de jouer
        try {
            ps = cnx.prepareStatement("SELECT nomLiv\n"
                    +"FROM Clients");
            rs= ps.executeQuery();

            while (rs.next()){
                String livreur = rs.getString("nomlivreur");
                lesLivreurs.add(livreur);
            }
            rs.close();
            ps.close();

        }
        catch (SQLException ex){}

        return lesLivreurs;
    }
    public int getIdLivreurByName(String nomLiv)
    {
        int numLiv = 0;

        // A vous de jouer


        return numLiv;
    }
}
