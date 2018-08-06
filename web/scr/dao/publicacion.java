/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FRANCISCONAVA
 */
public class publicacion {
    
    private Integer id_publicacion;
    private String año;
    private String formato;
    private String primerAutor;
    private String autorCorrespondiente;
    private String coautor;
    private String nombreArticulo;
    private Integer volumen;
    private String paginas;

    public void setId_publicacion(Integer id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public Integer getId_publicacion() {
        return id_publicacion;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getAño() {
        return año;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setPrimerAutor(String primerAutor) {
        this.primerAutor = primerAutor;
    }

    public String getPrimerAutor() {
        return primerAutor;
    }

    public void setAutorCorrespondiente(String autorCorrespondiente) {
        this.autorCorrespondiente = autorCorrespondiente;
    }

    public String getAutorCorrespondiente() {
        return autorCorrespondiente;
    }

    public void setCoautor(String coautor) {
        this.coautor = coautor;
    }

    public String getCoautor() {
        return coautor;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public publicacion(Integer id_publicacion, String año, String formato, String primerAutor, String autorCorrespondiente, String coautor, String nombreArticulo, Integer volumen, String paginas) {
        this.id_publicacion = id_publicacion;
        this.año = año;
        this.formato = formato;
        this.primerAutor = primerAutor;
        this.autorCorrespondiente = autorCorrespondiente;
        this.coautor = coautor;
        this.nombreArticulo = nombreArticulo;
        this.volumen = volumen;
        this.paginas = paginas;
    }
   
}
