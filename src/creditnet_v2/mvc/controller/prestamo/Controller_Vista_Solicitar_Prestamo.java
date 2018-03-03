/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditnet_v2.mvc.controller.prestamo;

import creditnet_v2.ManejadorBaseDatos;
import creditnet_v2.mvc.model.Prestamos;
import creditnet_v2.mvc.vistas.prestamos.Historial_Prestamos;
import creditnet_v2.mvc.vistas.prestamos.Solicitar_Prestamo_Nuievo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Controller_Vista_Solicitar_Prestamo {
    
    private static Connection con;
    private  static List prest;
    
    public static int Prestamo(String presto){
        int resultado_prestamo = 0;
        try{
            if(presto.equals("")){
                presto = "0";
            }
            resultado_prestamo = Integer.parseInt(presto);
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error, El Dato Ingresado No es un Numero" ,"Error", JOptionPane.ERROR_MESSAGE);
            resultado_prestamo = 0;
        }
        return resultado_prestamo;
    }
    
    public  static int Interes(String interes){
        int resultado_interes = 0;
        try{
            if(interes.equals("")){
                interes = "0";
            }
            resultado_interes = Integer.parseInt(interes);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, El Dato Ingresado No es un Numero" ,"Error", JOptionPane.ERROR_MESSAGE);
            resultado_interes = 0;
        }
        return resultado_interes;
    }
    
    public  static int Valor_Pagar(int prestamo, int interes){
        int resultado_pagar = 0;
        try{
            resultado_pagar = ((prestamo *interes)/100) + prestamo;
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error, El Dato Ingresado No es un Numero" ,"Error", JOptionPane.ERROR_MESSAGE);
           resultado_pagar = 0;
        }
       return resultado_pagar;
    }
    
    public static void Solicitar_PrestamoNuevo(Prestamos prestamo) throws Exception{
       ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
        mbd.conectar();
        setCon((Connection) mbd.getConexion());
        if (getCon() == null ) {
            JOptionPane.showMessageDialog(null, " No hay Conexion ");
        }
        PreparedStatement pst = null;
        try {
              pst = (PreparedStatement) getCon().prepareStatement("Insert Into prestamos values(?,?,?,?,?,?,?)");
              pst.setString(1,prestamo.getCedula());
              pst.setString(2,prestamo.getFecha_inicial());
              pst.setString(3,prestamo.getFecha_final());
              pst.setInt(4, (int) prestamo.getMonto_prestado());
              pst.setInt(5, (int) prestamo.getMonto_a_pagar());
              pst.setInt(6,prestamo.getInteres());
              pst.setString(7, prestamo.getEstado());
              pst.executeUpdate();
        }finally {
            if (pst != null) {
                 pst.close();
            }
        }

    }
    
    public static Prestamos Buscar(String identificacion) throws SQLException{
    if(identificacion == null) {
       JOptionPane.showMessageDialog(null,"No Existe ese Pedido");
     }
     ResultSet rs = null;
     PreparedStatement pst = null;
     Prestamos prestamos = null;
     try {
       ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
       mbd.conectar();
       setCon((Connection) mbd.getConexion());
       pst = (PreparedStatement) getCon().prepareStatement("select * from prestamos where identificacion = ?");
       pst.setString(1, identificacion.trim());
       rs = pst.executeQuery();
       while(rs.next()) {
         prestamos= Prestamos.load(rs);
       }
     }finally {
         if (rs != null) {
          rs.close();
         }
         if (pst != null) {
           pst.close();
          }
       return prestamos;
     }
 }
public static void limpiarCampo(){
      //Solicitar_Prestamo_Nuievo.campo_identificacion.setText("");
         Solicitar_Prestamo_Nuievo.campo_nombres2.setText("");
         Solicitar_Prestamo_Nuievo.campo_apellido2.setText("");
         Solicitar_Prestamo_Nuievo.campo_direccion2.setText("");
         Solicitar_Prestamo_Nuievo.campo_monto_Prestar.setText("");
         Solicitar_Prestamo_Nuievo.campo_interes.setText("");
         Solicitar_Prestamo_Nuievo.campo_monto_pagar.setText("");
           
} 

    /**
     * @return the con
     */
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
     * @return the client
     */
    public static List getPrest() {
        return prest;
    }

    /**
     * @param aPrest
     */
    public static void setPrest(List aPrest) {
        prest = aPrest;
    }
      public static void listarPrestamos() throws SQLException, Exception {
     ResultSet rs = null;
     PreparedStatement pst = null;
     setPrest(new LinkedList());
     try {
         ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
         mbd.conectar();
         setCon((Connection) mbd.getConexion());
         pst = (PreparedStatement) getCon().prepareStatement("select * from prestamos");
         rs = pst.executeQuery();
         while(rs.next()) {
           getPrest().add(Prestamos.load(rs));
         }
     } finally {
        if (rs != null) {
           rs.close();
        }
        if (pst != null) {
          pst.close();
        }
    }
 } 
      
   public static Prestamos enlistarClientes(String identificacion){
        Prestamos presta = null;
        try {
            
            Historial_Prestamos.dtm.setNumRows(0);

            listarPrestamos();
            Iterator it = getPrest().iterator();
            while(it.hasNext()){
                Prestamos prestamoss = (Prestamos) it.next();
                if(identificacion.equals(prestamoss.getCedula())){
                   presta = prestamoss;
                }
                String[] fila = {prestamoss.getFecha_inicial(), prestamoss.getFecha_final(), prestamoss.getEstado()};
               Historial_Prestamos.dtm.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(Controller_Vista_Solicitar_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return presta;
    }
    
    
}
