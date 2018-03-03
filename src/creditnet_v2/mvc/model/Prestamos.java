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
public class Prestamos {
    private String cedula;
    private String fecha_inicial;
    private String fecha_final;
    private long monto_prestado;
    private long monto_a_pagar;
    private int interes;
    private String estado;
    
        public static Prestamos load(ResultSet rs) throws SQLException{
        Prestamos presta = new Prestamos();
        presta.setCedula(rs.getString("identificacion"));
        presta.setFecha_inicial(rs.getString("fecha_inicial"));
        presta.setFecha_final(rs.getString("fecha_final"));
        presta.setMonto_prestado(rs.getLong("monto_prestar"));
        presta.setMonto_a_pagar(rs.getLong("monto_pagar"));
        presta.setInteres(rs.getInt("interes"));
        presta.setEstado(rs.getString("estado"));
        return presta;
    }

    /**
     * @return the cliente
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

 
    /**
     * @return the monto_prestado
     */
    public long getMonto_prestado() {
        return monto_prestado;
    }

    /**
     * @param monto_prestado the monto_prestado to set
     */
    public void setMonto_prestado(long monto_prestado) {
        this.monto_prestado = monto_prestado;
    }

    /**
     * @return the monto_a_pagar
     */
    public long getMonto_a_pagar() {
        return monto_a_pagar;
    }

    /**
     * @param monto_a_pagar the monto_a_pagar to set
     */
    public void setMonto_a_pagar(long monto_a_pagar) {
        this.monto_a_pagar = monto_a_pagar;
    }

    /**
     * @return the porcentaje_prestamo
     */
    public int getInteres() {
        return interes;
    }

    /**
     * @param porcentaje_prestamo the porcentaje_prestamo to set
     */
    public void setInteres(int interes) {
        this.interes = interes;
    }

    /**
     * @return the fecha_inicial
     */
    public String getFecha_inicial() {
        return fecha_inicial;
    }

    /**
     * @param fecha_inicial the fecha_inicial to set
     */
    public void setFecha_inicial(String fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    /**
     * @return the fecha_final
     */
    public String getFecha_final() {
        return fecha_final;
    }

    /**
     * @param fecha_final the fecha_final to set
     */
    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
