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
public class anuncioCarteles extends Anuncio
{
    private Personal actor;
    private ArrayList <Personal> actores;
    
    
    public anuncioCarteles()
    {
        super();
        this.actor = new Personal();
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
    
    

    public Personal getActor() 
    {
        return actor;
    }

    public void setActor(Personal actor) 
    {
        this.actor = actor;
    }
    
    
    
}
