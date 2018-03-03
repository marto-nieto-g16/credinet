/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditnet_v2.mvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SERVIDOR
 */
public class Abonos {
   
    private String cedula;
    private String fecha_abono;
    private long cantidad_abonada;
    
       public static Abonos load(ResultSet rs) throws SQLException{
        Abonos abono = new Abonos();
        abono.setCedula(rs.getString("identificacion"));
        abono.setFecha_abono(rs.getString("fecha"));
        abono.setCantidad_abonada(rs.getInt("apellidos"));
        return abono;
    }

    /**
     * @return the presta
     */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the fecha_abono
     */
    public String getFecha_abono() {
        return fecha_abono;
    }

    /**
     * @param fecha_abono the fecha_abono to set
     */
    public void setFecha_abono(String fecha_abono) {
        this.fecha_abono = fecha_abono;
    }

    /**
     * @return the cantidad_abonada
     */
    public long getCantidad_abonada() {
        return cantidad_abonada;
    }

    /**
     * @param cantidad_abonada the cantidad_abonada to set
     */
    public void setCantidad_abonada(long cantidad_abonada) {
        this.cantidad_abonada = cantidad_abonada;
    }
    
}
