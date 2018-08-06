/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANCISCONAVA
 */
public class  revista{
    
    private Integer idRevista;
    private String nombreCompleto;
    private String nombreAbreviado;
    private String issn;
    private double factor;
    private String grupo;
    private String Edicion;

    public void setIdRevista(Integer idRevista) {
        this.idRevista = idRevista;
    }

    public Integer getIdRevista() {
        return idRevista;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreAbreviado(String nombreAbreviado) {
        this.nombreAbreviado = nombreAbreviado;
    }

    public String getNombreAbreviado() {
        return nombreAbreviado;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getEdicion() {
        return Edicion;
    }

    public revista(Integer idRevista, String nombreCompleto, String nombreAbreviado, String issn, double factor, String grupo, String Edicion) {
        this.idRevista = idRevista;
        this.nombreCompleto = nombreCompleto;
        this.nombreAbreviado = nombreAbreviado;
        this.issn = issn;
        this.factor = factor;
        this.grupo = grupo;
        this.Edicion = Edicion;
    }   
}
