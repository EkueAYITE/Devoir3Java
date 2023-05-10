package Controlers;

import Tools.ConnexionBDD;
import com.mysql.cj.xdevapi.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtrlClient
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlClient() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<String> getAllClients()
    {
        ArrayList<String> lesClients = new ArrayList<>();

        // A vous de jouer
        try {
            ps = cnx.prepareStatement("SELECT nomCli\n"
                    +"FROM Clients");
            rs= ps.executeQuery();

            while (rs.next()){
                String client = rs.getString("nomClient");
                lesClients.add(client);
            }
            rs.close();
            ps.close();

        }
        catch (SQLException ex){}

        return lesClients;
    }
    public int getIdClientByName(String nomCli)
    {
        int numCli = 0;

        // A vous de jouer

        return numCli;
    }
}
