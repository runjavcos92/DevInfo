package com.mvc.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANCISCONAVA
 */
public class institutoDTO {
    
    private Integer id_instituto;
    private String nombre;

    public void setId_instituto(Integer id_instituto) {
        this.id_instituto = id_instituto;
    }

    public Integer getId_instituto() {
        return id_instituto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public institutoDTO(Integer id_instituto, String nombre) {
        this.id_instituto = id_instituto;
        this.nombre = nombre;
    }

   
}
