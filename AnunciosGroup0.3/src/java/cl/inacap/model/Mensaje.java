/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.model;

/**
 *
 * @author zamorator
 */
public class Mensaje {

    private int id_mensaje;
    private String tipo_remitente;
    private String para;
    private String de;
    private String asunto;
    private String mensaje;
    private String nombre_u_anunciante;
    private int codigo_administrador;
    private String fecha;
    private String estado;
    private String nombre_administrador;

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre_u_anunciante() {
        return nombre_u_anunciante;
    }

    public void setNombre_u_anunciante(String nombre_u_anunciante) {
        this.nombre_u_anunciante = nombre_u_anunciante;
    }

    public int getCodigo_administrador() {
        return codigo_administrador;
    }

    public void setCodigo_administrador(int codigo_administrador) {
        this.codigo_administrador = codigo_administrador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_remitente() {
        return tipo_remitente;
    }

    public void setTipo_remitente(String tipo_remitente) {
        this.tipo_remitente = tipo_remitente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre_administrador() {
        return nombre_administrador;
    }

    public void setNombre_administrador(String nombre_administrador) {
        this.nombre_administrador = nombre_administrador;
    }
}
