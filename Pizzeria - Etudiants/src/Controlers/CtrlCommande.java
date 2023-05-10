package Controlers;

import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtrlCommande
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlCommande() {
        cnx = ConnexionBDD.getCnx();
    }

    public int getDernierNumeroDeCommande()
    {
        int maxNumero = 0;

        // A vous de jouer

        return maxNumero;
    }
    public void InsertConsultation(int numCde, int numClient,int numLivreur)
    {
        // A vous de jouer

    }
}
