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
public class anuncioTv extends Anuncio
{
    private String video;
    private String pelicula;
    private Personal actor;
    private ArrayList <Personal> actores;
    private String alocucion;
    private String musica;

    public anuncioTv() 
    {
        super();
        this.video = "";
        this.pelicula = "";
        this.actor = new Personal();
        this.alocucion = "";
        this.musica = "";
        this.actores = new ArrayList<Personal>();
    }

    public ArrayList<Personal> getActores() 
    {
        return actores;
    }

    public void setActores(ArrayList<Personal> actores) 
    {
        this.actores = actores;
    }
    
    

    public String getVideo() 
    {
        return video;
    }

    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getPelicula() 
    {
        return pelicula;
    }

    public void setPelicula(String pelicula) 
    {
        this.pelicula = pelicula;
    }

    public Personal getActor() 
    {
        return actor;
    }

    public void setActor(Personal actor) 
    {
        this.actor = actor;
    }

    public String getAlocucion() 
    {
        return alocucion;
    }

    public void setAlocucion(String alocucion) 
    {
        this.alocucion = alocucion;
    }

    public String getMusica() 
    {
        return musica;
    }

    public void setMusica(String musica) 
    {
        this.musica = musica;
    }
    
    public void addActor()
    {
        this.actores.add(this.getActor());
    }
    
    
    
    
    
    
    
    
}
