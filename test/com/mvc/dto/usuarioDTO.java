/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dto;

/**
 *
 * @author FRANCISCONAVA
 */
public class usuarioDTO {
    
    private String nombre;
    private String contraseña;
    private Integer id_instituto;
    private Integer id_rol;
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId_instituto(Integer id_instituto) {
        this.id_instituto = id_instituto;
    }

    public Integer getId_instituto() {
        return id_instituto;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public Integer getId_rol() {
        return id_rol;
    }

    public usuarioDTO(String nombre, String contraseña, Integer id_instituto, Integer id_rol) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id_instituto = id_instituto;
        this.id_rol = id_rol;
    }
}
