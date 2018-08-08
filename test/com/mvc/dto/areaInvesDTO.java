package com.mvc.dto;

public class areaInvesDTO{
    
    private Integer idArea;
    private String nombreArea;

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    
    public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID_AREA").append(getIdArea()).append("\n");
		sb.append("AREA").append(getNombreArea()).append("\n");
		return sb.toString();
	}
   
       
}
