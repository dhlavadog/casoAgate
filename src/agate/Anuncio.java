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
    private String escrito;
    private String grafico;
    private String fotografia;
    
    
    public Anuncio()
    {
        this.escrito = "";
        this.grafico = "";
        this.fotografia = "";
    }

    public String getEscrito() {
        return escrito;
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
