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
public class Usuarios {
    
    private String nombres;
    private String apellidos;
    private String nombre_usuario;
    private String passwd;
    
        public static Usuarios load(ResultSet rs) throws SQLException{
        Usuarios user = new Usuarios();
        user.setNombres(rs.getString("nombres"));
        user.setApellidos(rs.getString("apellidos"));
        user.setNombre_usuario(rs.getString("user"));
        user.setPasswd(rs.getString("passwd"));
        return user;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
