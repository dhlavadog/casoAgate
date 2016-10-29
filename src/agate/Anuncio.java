/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agate;

/**
 *
 * @author PC
 */
public class Anuncio 
{
    private String nombre;
    private String tipo;
    private String escrito;
    private String grafico;
    private String fotografia;
    
    
    public Anuncio()
    {
        this.nombre = "";
        this.tipo = "";
        this.escrito = "";
        this.grafico = "";
        this.fotografia = "";
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;   
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setTipo(String a)
    {
        this.tipo = a;
    }
    
    public String getTipo()
    {
        return this.tipo; 
    }

    public String getEscrito() {
        return this.escrito;
    }

    public void setEscrito(String escrito) 
    {
        this.escrito = escrito;
    }

    public String getGrafico() 
    {
        return grafico;
    }

    public void setGrafico(String grafico) 
    {
        this.grafico = grafico;
    }

    public String getFotografia() 
    {
        return fotografia;
    }

    public void setFotografia(String fotografia) 
    {
        this.fotografia = fotografia;
    }
    
   
    
    
    
}
