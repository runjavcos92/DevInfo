package com.mvc.dto;

public class lineaInvesDTO{
    
    private Integer idLineaInves;
    private String linea;

    public void setIdLineaInves(Integer idLineaInves) {
        this.idLineaInves = idLineaInves;
    }

    public Integer getIdLineaInves() {
        return idLineaInves;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public lineaInvesDTO(Integer idLineaInves, String linea) {
        this.idLineaInves = idLineaInves;
        this.linea = linea;
    }  
}
