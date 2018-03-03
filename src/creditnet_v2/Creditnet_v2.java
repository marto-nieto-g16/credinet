/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditnet_v2;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR
 */
public class Creditnet_v2 {
    private static Connection con;
    
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
            ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
             mbd.conectar();
             setCon((Connection) mbd.getConexion());
    if (getCon() == null ) {
        JOptionPane.showMessageDialog(null, " No hay Conexion ");
    }
    }
    
}
