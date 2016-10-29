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
public class anuncioRadio extends Anuncio 
{
    private String audio;
    private Personal actor;
    private ArrayList<Personal> actores;
    private String alocucion;
    private String musica;
    
    public anuncioRadio()
{
    super();
    this.audio = "";
    this.actor = new Personal();
    this.alocucion = "";
    this.musica = "";
    this.actores = new ArrayList <Personal>();
    
}

    public ArrayList<Personal> getActores() 
    {
        return actores;
    }

    public void setActores(ArrayList<Personal> actores) 
    {
        this.actores = actores;
    }

    
    public String getAudio() 
    {
        return audio;
    }

    public void setAudio(String audio) 
    {
        this.audio = audio;
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
    
    
    
}


