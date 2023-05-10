package Vues;

import Controlers.*;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FrmCommander extends JFrame{
    private JPanel pnlRoot;
    private JLabel lblTitre;
    private JLabel lblNumCommande;
    private JTextField txtNumCommande;
    private JLabel lblClients;
    private JComboBox cboClients;
    private JLabel lblLivreurs;
    private JTable tblPizzas;
    private JComboBox cboLivreurs;
    private JButton btnCommander;

    ModelJTable mdl;

    CtrlClient ctrlClient;
    CtrlLivreur ctrlLivreur;
    CtrlPizza ctrlPizza;


    public FrmCommander() throws SQLException, ClassNotFoundException {
        this.setTitle("Commander");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ConnexionBDD maCnx = new ConnexionBDD();

        // A vous de jouer
        mdl = new ModelJTable();
        ctrlPizza = new CtrlPizza();
        ctrlClient = new CtrlClient();
        ctrlLivreur = new CtrlLivreur();
        mdl.loadDatasPizzas(ctrlPizza.getAllPizzas());
        tblPizzas.setModel(mdl);


       cboClients.addItem(ctrlClient);
       cboLivreurs.addItem(ctrlLivreur);



        btnCommander.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // A vous de jouer


            }
        });
    }
}
