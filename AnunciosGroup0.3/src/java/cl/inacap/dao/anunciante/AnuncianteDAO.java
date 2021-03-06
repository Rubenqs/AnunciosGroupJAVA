/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.dao.anunciante;

import cl.inacap.connect.ConnectionFactory;
import cl.inacap.model.Anunciante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author zamorator
 */
public class AnuncianteDAO {

    public Anunciante IniciarSesionAnunciante(String nombre, String password) throws Exception {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = null;
        ResultSet rs = null;
        Anunciante anunciante = null;
        try {

            con = cf.obtenerConexion();
            CallableStatement proc = con.prepareCall("{CALL SP_INICIARSESIONANUNCIANTE(?,?)}");
            proc.setString(1, nombre);
            proc.setString(2, password);
            rs = proc.executeQuery();
            while (rs.next()) {
                anunciante = new Anunciante();
                anunciante.setNombre_u_anunciante(rs.getString("NOMBRE_U_ANUNCIANTE"));
                anunciante.setId_comuna(rs.getInt("ID_COMUNA"));
                anunciante.setNombre_anunciante(rs.getString("NOMBRE_ANUNCIANTE"));
                anunciante.setDireccion_anunciante(rs.getString("DIRECCION_ANUNCIANTE"));
                anunciante.setPassword_anunciante(rs.getString("PASSWORD_ANUNCIANTE"));
                anunciante.setEmail_anunciante(rs.getString("EMAIL_ANUNCIANTE"));
            }
        } catch (Exception ex) {
            cf.cerrarConexion();
            ex.printStackTrace();
            throw new Exception();
        } finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        }
        return anunciante;
    }

    public boolean AgregaAnunciante(Anunciante anunciante) throws Exception {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = null;
        try {
            con = cf.obtenerConexion();
            CallableStatement proc = con.prepareCall("{CALL SPAGREGAANUNCIANTE(?,?,?,?,?,?)}");
            proc.setString(1, anunciante.getNombre_u_anunciante());
            proc.setInt(2, anunciante.getId_comuna());
            proc.setString(3,anunciante.getNombre_anunciante());
            proc.setString(4, anunciante.getDireccion_anunciante());
            proc.setString(5, anunciante.getPassword_anunciante());
            proc.setString(6, anunciante.getEmail_anunciante());
            proc.executeQuery();
            System.out.println("SPAGREGAANUNCIANTE");
            
            
        } catch (Exception ex) {
            cf.cerrarConexion();
            ex.printStackTrace();
            throw new Exception();
        } finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        }
        return true;
    }

    public int ConsultaNombreAnunciante(String nombre_u_anunciante) throws Exception {
        //select count(*) from anunciante where nombre_u_anunciante = "";
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = null;
        ResultSet rs = null;
        int resultado = 0;
        try {
            con = cf.obtenerConexion();
            CallableStatement proc = con.prepareCall("{CALL SPCONSULTANOMBREANUNCIANTE(?)}");
            proc.setString(1, nombre_u_anunciante);
            rs = proc.executeQuery();
            System.out.println("SPCONSULTANOMBREANUNCIANTE");
            
            while (rs.next()) {
                resultado = rs.getInt(1);
            }
        } catch (Exception ex) {
            cf.cerrarConexion();
            ex.printStackTrace();
            throw new Exception();
        } finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        }
        return resultado;
    }

    public boolean ActualizaAnunciante(Anunciante anunciante) throws Exception {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = cf.obtenerConexion();
            CallableStatement proc = con.prepareCall("{CALL SPACTUALIZAANUNCIANTE(?,?,?,?,?,?)}");
            proc.setInt(1, anunciante.getId_comuna());
            proc.setString(2, anunciante.getNombre_anunciante());
            proc.setString(3, anunciante.getDireccion_anunciante());
            proc.setString(4, anunciante.getPassword_anunciante());
            proc.setString(5, anunciante.getNombre_u_anunciante());
            proc.setString(6, anunciante.getEmail_anunciante());
            proc.executeQuery();
            System.out.println("SPACTUALIZAANUNCIANTE");
        } catch (Exception ex) {
            ex.printStackTrace();
            cf.cerrarConexion();
            throw new Exception();
        } finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        }
        return true;
    }

    public Anunciante ConsultaIngresoAnunciante(String nombre_u_anunciante) throws Exception{
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = null;
        ResultSet rs = null;
        Anunciante anunciante = null;
        try {

            con = cf.obtenerConexion();
            CallableStatement proc = con.prepareCall("{CALL SPCONSULTAINGRESOANUNCIANTE(?)}");
            proc.setString(1, nombre_u_anunciante);
            rs = proc.executeQuery();
            System.out.println("SPCONSULTAINGRESOANUNCIANTE");
            while (rs.next()) {
                anunciante = new Anunciante();
                anunciante.setNombre_u_anunciante(rs.getString("NOMBRE_U_ANUNCIANTE"));
                anunciante.setEstado_anunciante(rs.getString("ESTADO_ANUNCIANTE"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            cf.cerrarConexion();
            throw new Exception();
        } finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        }
        return anunciante;
    }
    
    
    public Boolean validarcupon(int codigo_cupon, String nombre_u_anunciante) throws Exception {
            ConnectionFactory cf = new ConnectionFactory();
            Connection con = null;
            boolean rs = false;
         try {  
            con = cf.obtenerConexion();
            // se crea instancia a procedimiento.
            CallableStatement proc = con.prepareCall("{CALL SP_VALIDAR_CUPON(?,?,?)}");           
            proc.setInt(1,codigo_cupon);
            proc.setString(2,nombre_u_anunciante);
            proc.registerOutParameter(3, java.sql.Types.BOOLEAN);
            System.out.println(proc);
            rs = proc.execute();
            System.out.println(proc.getBoolean(3));
            
            return proc.getBoolean(3);
               
        }catch (Exception ex) {
            cf.cerrarConexion();
            ex.printStackTrace();
            throw new Exception();
       }finally {
            cf.cerrarConexion();
            con = null;
            cf = null;
        } 
        
        }
}
