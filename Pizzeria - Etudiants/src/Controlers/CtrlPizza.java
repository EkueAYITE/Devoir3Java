package Controlers;

import Entities.Pizza;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtrlPizza
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlPizza() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Pizza> getAllPizzas()
    {
        ArrayList<Pizza> lesPizzas = new ArrayList<>();

        // A vous de jouer
        try {
            ps = cnx.prepareStatement("SELECT pizzas.numPiz,pizzas.nomPiz,pizzas.nbPers,pizzas.prix,lignesCommandes.qte\n" +
                    "FROM pizzas\n" +
                    "INNER JOIN lignescommandes ON pizzas.numPiz = lignescommandes.refPizza" );
            rs = ps.executeQuery();

            while (rs.next()) {
                Pizza Unepizza  = new Pizza(rs.getString("numPiz"), rs.getString("nomPiz"), rs.getInt("nbPers"),rs.getInt("prix"),rs.getInt("qte"));
                lesPizzas.add(Unepizza);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {

        }

        return lesPizzas;
    }
}
