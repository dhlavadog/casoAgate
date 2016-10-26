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
public class Personal 
{
    private String nombre;
    private String telefono;
    private String direccion;
    
    public Personal()
    {
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
    }
    
    
    public void setNombre( String a)
    {
        this.nombre = a;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    
    
            
            
            
            
    
}
