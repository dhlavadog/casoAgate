/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agate;


import java.util.*;
/**
 *
 * @author PC
 */
public class Campaña 
{
    private String nombre;
    private Personal director;
    private Fecha fechaPlaneada;
    private Fecha fechaFinal;
    private int presupuestoEstimado;
    private int presupuestoReal;
    private Anuncio anuncio;
    private ArrayList<Anuncio> anuncios;
    private anuncioInternet anuncioInternet;
    private anuncioTv anuncioTv;
    private anuncioRadio anuncioRadio;
    private anuncioCarteles anuncioCarteles;
    
    
    public Campaña()
    {
        this.nombre = "";
        this.director = new Personal();
        this.fechaPlaneada = new Fecha(0,0,0);
        this.fechaFinal = new Fecha(0,0,0);
        this.presupuestoEstimado =0;
        this.presupuestoReal = 0;
        this.anuncios= new ArrayList<Anuncio>();
        this.anuncio = new Anuncio();
        this.anuncioInternet = new anuncioInternet();
        this.anuncioTv = new anuncioTv();
        this.anuncioCarteles = new anuncioCarteles();
    }

    public anuncioCarteles getAnuncioCarteles() 
    {
        return anuncioCarteles;
    }

    public void setAnuncioCarteles(anuncioCarteles anuncioCarteles) 
    {
        this.anuncioCarteles = anuncioCarteles;
    }
    

    public anuncioRadio getAnuncioRadio() 
    {
        return anuncioRadio;
    }

    public void setAnuncioRadio(anuncioRadio anuncioRadio) 
    {
        this.anuncioRadio = anuncioRadio;
    }
    
    

    public anuncioTv getAnuncioTv() 
    {
        return anuncioTv;
    }

    public void setAnuncioTv(anuncioTv anuncioTv) 
    {
        this.anuncioTv = anuncioTv;
    }
    

    public anuncioInternet getAnuncioInternet() 
    {
        return anuncioInternet;
    }

    public void setAnuncioInternet(anuncioInternet anuncioInternet) 
    {
        this.anuncioInternet = anuncioInternet;
    }
    

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public Personal getDirector() 
    {
        return director;
    }

    public void setDirector(Personal director) 
    {
        this.director = director;
    }
    
   
    
    public void setFechaPlaneada(int a, int b, int c)
    {
        this.fechaPlaneada.setDia(a);
        this.fechaPlaneada.setMes(b);
        this.fechaPlaneada.setAnio(c);
        
    }
    
     public void setFechaFinal(int a, int b, int c)
    {
        this.fechaFinal.setDia(a);
        this.fechaFinal.setMes(b);
        this.fechaFinal.setAnio(c);
        
    }
     
    public String getFechaPlaneada()
    {
        return this.fechaPlaneada.getDia()+"/"+this.fechaPlaneada.getMes()+"/"+this.fechaPlaneada.getAnio();
    }
    
    public String getFechaFinal()
    {
        return this.fechaFinal.getDia()+"/"+this.fechaFinal.getMes()+"/"+this.fechaFinal.getAnio();
    }
    
    public void getDatosDirector()
    {
        System.out.println("Nombre: "+this.director.getNombre());
        System.out.println("Telefono: "+this.director.getTelefono());
        System.out.println("Direccion: "+this.director.getDireccion());
        
    }

    public int getPresupuestoEstimado()
    {
        return presupuestoEstimado;
    }

    public void setPresupuestoEstimado(int presupuestoEstimado) 
    {
        this.presupuestoEstimado = presupuestoEstimado;
    }

    public int getPresupuestoReal() 
    {
        return presupuestoReal;
    }

    public void setPresupuestoReal(int presupuestoReal) 
    {
        this.presupuestoReal = presupuestoReal;
    }
    
    public void setAnuncio(Anuncio a)
    {
        this.anuncio = a;
    }
    
    public Anuncio getAnuncio()
    {
        return this.anuncio;
    }
    
    public void setAnuncios(ArrayList<Anuncio> a)
    {
        this.anuncios = a;
    }
    
    public ArrayList<Anuncio> getAnuncios()
    {
        return this.anuncios;
    }
    public void AddAnuncio()
    {
        this.anuncios.add(this.getAnuncio());
    }
    public void AddAnuncioInternet()
    {
        this.anuncios.add(this.getAnuncioInternet());
    }
    
    public void AddAnuncioTv()
    {
        this.anuncios.add(this.getAnuncioTv());
    }
    
    public void AddAnuncioRadio()
    {
        this.anuncios.add(this.getAnuncioRadio());
    }
    
    public void AddAnuncioCarteles()
    {
        this.anuncios.add(this.getAnuncioCarteles());
    }
    
    
    
    
    
}
