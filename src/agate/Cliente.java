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
public class Cliente {
    
    private String nombre;
    private Personal contacto;
    
    private Campaña campaña;
    private ArrayList<Campaña> campañas;
    
    public Cliente()
    {
        this.contacto = new Personal();   
        this.nombre = "";
        this.campaña = new Campaña();
        this.campañas = new ArrayList<Campaña>();
        
    }

    public Personal getContacto() 
    {
        return contacto;
    }

    public void setContacto(Personal contacto) 
    {
        this.contacto = contacto;
    }
    
    
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String a)
    {
        this.nombre = a;
    }
    
    public String toString()
    {
        return contacto.getNombre();
    }
    
    public void AddCampaña()
    {
        this.campañas.add(this.campaña);
    }
    
    public void borrarCampaña(String a)
    {
        for(int i = 0 ; i<campañas.size(); i++)
        {
            if(a.equals(campañas.get(i).getNombre())) campañas.remove(i);
        }
        
    }
    
   
    
    
    public void MostrarCampañas()
    {
       for(int i = 0 ; i<this.campañas.size(); i++)
       {
           System.out.println("Nombre de Campaña: "+this.campañas.get(i).getNombre());
           System.out.println( "Fecha Estimada de finalizacion: "+this.campañas.get(i).getFechaPlaneada());
           System.out.println("Fecha Real de Finalizacion: "+this.campañas.get(i).getFechaFinal());
           System.out.println("Director AGAPE responsable de la Campaña:");
           this.campañas.get(i).getDatosDirector();
           System.out.println("Presupuesto Estimado: $"+this.campañas.get(i).getPresupuestoEstimado());
           System.out.println("Presupuesto Real Utilizado: "+this.campañas.get(i).getPresupuestoReal());
           System.out.println(".........................................");
       }
        
    }

    public Campaña getCampaña() 
    {
        return campaña;
    }

    public void setCampaña(Campaña campaña) 
    {
        this.campaña = campaña;
    }

    public ArrayList<Campaña> getCampañas() 
    {
        return campañas;
    }

    public void setCampañas(ArrayList<Campaña> campañas) 
    {
        this.campañas = campañas;
    }
    
    
}
