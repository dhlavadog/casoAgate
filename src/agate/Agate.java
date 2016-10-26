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
public class Agate 
{

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
        Scanner leer = new Scanner(System.in);
        HashMap <String, Cliente> clientes = new HashMap<String,Cliente>();
        
        Personal a = new Personal();
        Cliente c1;
        String nombreCliente, nombreCampaña;
        
        int opcion[] = new int[3];
        boolean menu = true;
        
    while (menu == true)
    {    
        c1 = new Cliente();
        a = new Personal();
        
        
        System.out.println("AGATE LTD \n");
        System.out.println("Bienvenido");
        System.out.println("................................................");
        System.out.println("1. Clientes");
        System.out.println("2. Campañas");
        opcion[0] = leer.nextInt();
        
        switch(opcion[0])
        {
            case 1 : System.out.println("CLIENTES \n");
                     System.out.println("1. Agregar nuevo cliente");
                     System.out.println("2. Ver clientes actuales");
                     System.out.print("Seleccione una opcion: ");
                     opcion[1] = leer.nextInt();
                     
                     switch(opcion[1])
                     {
                         case 1 : System.out.println("AGREGAR NUEVO CLIENTE\n");
                                  System.out.println("Ingrese nombre del Cliente");
                                  c1.setNombre(leer.next());
                                  System.out.println("Ingrese nombre del contacto");
                                  a.setNombre(leer.next());
                                  System.out.println("Ingrese telefono de contacto");
                                  a.setTelefono(leer.next());
                                  System.out.println("Ingrese direccion de contacto");
                                  a.setDireccion(leer.next());
                                  c1.setContacto(a);
                                  clientes.put(c1.getNombre(), c1);
                                  
                                  break;
                         case 2 : System.out.println("\n CLIENTES ACTUALES \n");
                                  
                                      System.out.println("Nombre: "+clientes.keySet());
                                      
                                  break;
                                  
                         default : System.out.println("Ingrese un numero valido");         
                                   break;
                         
                     }
                     
                     break;
                     
            case 2 : System.out.println("CAMPAÑAS\n");
                     System.out.println("1. Ingresar nueva campaña");
                     System.out.println("2. Ver campañas Activas");
                     System.out.println("3. Finalizar Campaña");
                     System.out.println("Ingrese un numero asociado con las opciones");
                     opcion[1]= leer.nextInt();
                     switch(opcion[1])
                     {
                         case 1 : Personal director = new Personal();
                                  Campaña campaña = new Campaña();
                                  System.out.println("NUEVA CAMPAÑA\n");
                                  System.out.println("Ingrese el nombre del Cliente asociado a esta nueva campaña");
                                  nombreCliente = leer.next();
                                  if(clientes.containsKey(nombreCliente))
                                  {
                                      System.out.println("......................................................");
                                      System.out.println("Cliente Activo:"+nombreCliente);
                                      System.out.println("Contacto Directo:"+clientes.get(nombreCliente));
                                      System.out.println("Ingrese el nombre, direccion y telefono (respectivamente) del miembro de AGATE LTD que se encargara de esta campaña: ");
                                      System.out.println("NOTA: Presione Enter por cada valor Ingresado:");
                                      director.setNombre(leer.next());
                                      director.setDireccion(leer.next());
                                      director.setTelefono(leer.next());
                                      campaña.setDirector(director);
                                      System.out.println("Ingrese nombre de Campaña");
                                      campaña.setNombre(leer.next());
                                      System.out.println("Ingrese presupuesto Estimado para la Campaña");
                                      campaña.setPresupuestoEstimado(leer.nextInt());
                                      System.out.println("Ingrese dia, mes y año estimados para terminar la Campaña, respectivamente");
                                      System.out.println("Presione ENTER cada vez que ingrese un dato: ");
                                      campaña.setFechaPlaneada(leer.nextInt(), leer.nextInt(), leer.nextInt());
                                      clientes.get(nombreCliente).setCampaña(campaña);
                                      clientes.get(nombreCliente).AddCampaña();
                                      
                                  }
                                  else System.out.println("No existe el cliente escrito o no esta activo con AGATE LTD");
                                  break;
                         case 2 : System.out.println("CAMPAÑAS ACTIVAS\n");
                                  System.out.println("Ingrese nombre de Cliente");
                                  nombreCliente = leer.next();
                                  if(clientes.containsKey(nombreCliente))
                                  {
                                      System.out.println("Campañas Activas con el Cliente: "+clientes.get(nombreCliente).getCampaña().getNombre()+"\n");
                                      System.out.println(".....................................................");
                                      clientes.get(nombreCliente).MostrarCampañas();
                                      System.out.println("Opciones:");
                                      System.out.println("1. Agregar Anuncio");
                                      System.out.println("2. Borrar Anuncio");
                                      System.out.println("3. Volver");
                                      int an = leer.nextInt();
                                      switch(an)
                                      {
                                          case 1 : System.out.println("AGREGAR ANUNCIO");
                                                   System.out.println("Ingrese el nombre de la campaña");
                                                   String b = leer.next();
                                                   for(int i = 0 ; i < clientes.get(nombreCliente).getCampañas().size() ; i++)
                                                   {
                                                     if( clientes.get(nombreCliente).getCampañas().get(i).getNombre().equals(b))
                                                     {
                                                         System.out.println("La campaña seleccionada es"+clientes.get(nombreCliente).getCampañas().get(i).getNombre());
                                                         //prueba de que acerta al nombre, borrar despues
                                                     }
                                                     
                                                     else System.out.println("No existe una campaña activa con ese nombre");
                                                   }
                                                  
                                                   
                                          
                                      }
                                      
                                  }
                                  else System.out.println("No existen campañas activas con ese cliente");
                                  break;  
                                  
                         case 3 : System.out.println("FINALIZAR CAMPAÑA");
                                  System.out.println("................................................");
                                  System.out.println("Ingrese el nombre de la Empresa Vinculada");
                                  nombreCliente = leer.next();
                                  if(clientes.containsKey(nombreCliente))
                                  {
                                      Campaña c = new Campaña();
                                      System.out.println("Cliente: "+nombreCliente);
                                      System.out.println("Ingrese el nombre de la Campaña a Finalizar");
                                      nombreCampaña = leer.next();
                                      System.out.println("Ingrese costos reales de la Campaña");
                                      c.setPresupuestoReal(leer.nextInt());
                                      
                                      System.out.println("Ingrese Fecha(dia, mes y año respectivamente) de terminacion de la campaña");
                                      c.setFechaFinal(leer.nextInt(), leer.nextInt(), leer.nextInt());
                                      clientes.get(nombreCliente).setCampaña(c);
                                      clientes.get(nombreCliente).MostrarCampañas();
                                      clientes.get(nombreCliente).borrarCampaña(nombreCampaña);
                                      System.out.println("Campaña "+nombreCampaña+" Finalizada");
                                      
                                  }
                                  else System.out.println("No existe un Cliente vinculado con ese nombre");
                                  
                         default : System.out.println("Ingrese un numero valido"); 
                         
                     }
                             
                     
                     break;
                     
            default : System.out.println("Ingrese un numero valido");
                      break;
              
            
        }
        
    }    
}
    
}
