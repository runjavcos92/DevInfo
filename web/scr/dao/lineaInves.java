/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANCISCONAVA
 */
public class lineaInves{
    
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

    public lineaInves(Integer idLineaInves, String linea) {
        this.idLineaInves = idLineaInves;
        this.linea = linea;
    }  
}
