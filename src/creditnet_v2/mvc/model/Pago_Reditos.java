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
public class Pago_Reditos {
    
    private int cedula;
    private long redito_pagar;
    private String fecha;
    
       public static Pago_Reditos load(ResultSet rs) throws SQLException{
        Pago_Reditos reditos = new Pago_Reditos();
        reditos.setCedula(rs.getInt("identificacion"));
        reditos.setFecha(rs.getString("fecha"));
        reditos.setRedito_pagar(rs.getInt("apellidos"));
        return reditos;
    }

    /**
     * @return the presta
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param presta the presta to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the redito_pagar
     */
    public long getRedito_pagar() {
        return redito_pagar;
    }

    /**
     * @param redito_pagar the redito_pagar to set
     */
    public void setRedito_pagar(long redito_pagar) {
        this.redito_pagar = redito_pagar;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
