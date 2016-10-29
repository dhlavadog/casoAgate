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
        
        int opcion[] = new int[4];
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
                                      if(clientes.get(nombreCliente).getCampañas().size() == 0) System.out.println("No existe ninguna campaña activa");
                                      System.out.println("Campañas Activas con el Cliente: "+clientes.get(nombreCliente).getCampaña().getNombre()+"\n");
                                      System.out.println(".....................................................");
                                      clientes.get(nombreCliente).MostrarCampañas();
                                      System.out.println("Opciones:");
                                      System.out.println("1. Agregar Anuncio");
                                      System.out.println("2. Borrar Anuncio");
                                      System.out.println("3. Volver");
                                      opcion[2] = leer.nextInt();
                                      switch(opcion[2])
                                      {
                                          case 1 : System.out.println("AGREGAR ANUNCIO");
                                                   System.out.println("Ingrese el nombre de la campaña");
                                                   String b = leer.next();
                                                   for(int i = 0 ; i < clientes.get(nombreCliente).getCampañas().size() ; i++)
                                                   {
                                                     if( clientes.get(nombreCliente).getCampañas().get(i).getNombre().equals(b))
                                                     {
                                                         System.out.println("La campaña seleccionada es: "+clientes.get(nombreCliente).getCampañas().get(i).getNombre());
                                                         System.out.println("............................................");
                                                         System.out.println("Que tipo de anuncio va a agregar");
                                                         System.out.println("1. Anuncio de periodico");
                                                         System.out.println("2. Anuncio de revista");
                                                         System.out.println("3. Anuncio de Internet");
                                                         System.out.println("4. Anuncio de Television");
                                                         System.out.println("5. Anuncio de Radio");
                                                         System.out.println("6. Anuncio de carteles");
                                                         System.out.println("7. Folletos");
                                                         System.out.print("Seleccione uno de los numeros correspondientes a las opciones: ");
                                                         opcion[3] = leer.nextInt();
                                                         switch(opcion[3])
                                                            {
                                                             case 1 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setTipo("Periodico");
                                                             case 2 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setTipo("Revista");
                                                             case 7 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setTipo("Folleto");
                                                                      System.out.println("Escriba el nombre del Anuncio");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setNombre(leer.next());
                                                                      System.out.println("Ingrese el grafico del anuncio del anuncio (nombre.jpg)");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setGrafico(leer.next());
                                                                      System.out.println("Ingrese el Texto del anuncio");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setEscrito(leer.next());
                                                                      System.out.println("Ingrese las fotograficas");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().setFotografia(leer.next());
                                                                      System.out.println("...................................................................");
                                                                      System.out.println("Anuncio de "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getTipo()+" creado");
                                                                      System.out.println("Tipo: "+ clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getTipo());
                                                                      System.out.println("Nombre: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getNombre());
                                                                      System.out.println("Grafico: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getGrafico());
                                                                      System.out.println("Texto: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getEscrito());
                                                                      System.out.println("Fotografia"+clientes.get(nombreCliente).getCampañas().get(i).getAnuncio().getFotografia());
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncio();
                                                                      break;
                                                                      
                                                             case 3 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setTipo("Internet");
                                                                      System.out.println("Escriba el nombre del Anuncio");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setNombre(leer.next());
                                                                      System.out.println("Ingrese el grafico del anuncio del anuncio (nombre.jpg)");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setGrafico(leer.next());
                                                                      System.out.println("Ingrese el Texto del anuncio");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setEscrito(leer.next());
                                                                      System.out.println("Ingrese las fotograficas");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setFotografia(leer.next());
                                                                      System.out.println("Ingrese Animaciones");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().setAnimaciones(leer.next());                                            
                                                                      System.out.println("...................................................................");
                                                                      System.out.println("Anuncio de "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getTipo()+" creado");
                                                                      System.out.println("Tipo: "+ clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getTipo());
                                                                      System.out.println("Nombre: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getNombre());
                                                                      System.out.println("Grafico: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getGrafico());
                                                                      System.out.println("Texto: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getEscrito());
                                                                      System.out.println("Fotografia"+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getFotografia());
                                                                      System.out.println("Animacion: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioInternet().getAnimaciones());
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncioInternet();
                                                                      break;
                                                                      
                                                             case 4 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().setTipo("Television");
                                                                      System.out.println("Escriba el nombre del Video");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().setVideo(leer.next());
                                                                      System.out.println("Ingrese nombre de la pelicula");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().setPelicula(leer.next());
                                                                      System.out.println("Ingrese numero de actores a participar");
                                                                      int numActores = leer.nextInt();
                                                                      
                                                                      for( int n = 0; n< numActores ; n++)
                                                                      {
                                                                          clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getActores().add(new Personal());
                                                                          System.out.println("Actor "+n);
                                                                          System.out.println("Ingrese nombre");
                                                                          clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getActores().get(n).setNombre(leer.next());
                                                                          
                                                                                                                                                                     
                                                                      }
                                                                      System.out.println("...................................................................");
                                                                      System.out.println("Video: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getVideo());
                                                                      System.out.println("Pelicula: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getPelicula());
                                                                      System.out.println("Actores involucrados: ");
                                                                      for( int n = 0; n < clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getActores().size() ; n++ )
                                                                        {
                                                                            System.out.print(clientes.get(nombreCliente).getCampañas().get(i).getAnuncioTv().getActores().get(n).getNombre()+" ");
                                                                        }
                                                                      System.out.println("\n");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncioTv();
                                                                      break;
                                                                      
                                                             case 5 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().setTipo("Radio");
                                                                      System.out.println("Ingrese Empleo de Audio");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().setAudio(leer.next());
                                                                      
                                                                      System.out.println("Ingrese numero de actores a participar");
                                                                       numActores = leer.nextInt();  
                                                                      for( int n = 0; n< numActores ; n++)
                                                                      {
                                                                          clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getActores().add(new Personal());
                                                                          System.out.println("Actor "+n);
                                                                          System.out.println("Ingrese nombre");
                                                                          clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getActores().get(n).setNombre(leer.next());                                                                                              
                                                                      }
                                                                      System.out.println("Ingrese el nombre de la Alocucion");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().setAlocucion(leer.next());
                                                                      System.out.println("Ingrese el nombre de la musica");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().setMusica(leer.next());
                                                                      System.out.println("...................................................................");
                                                                      System.out.println("Anuncio de "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getTipo()+" creado");
                                                                      System.out.println("Audio: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getAudio());
                                                                      System.out.println("Actores Involucrados: ");
                                                                      for( int n = 0; n < clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getActores().size() ; n++ )
                                                                        {
                                                                            System.out.print(clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getActores().get(n).getNombre()+" ");
                                                                        }
                                                                      System.out.println("\n");
                                                                      System.out.println("Alocucion: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getAlocucion());
                                                                      System.out.println("Musica"+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioRadio().getMusica());
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncioRadio();
                                                                      break;
                                                                      
                                                             case 6 : clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().setTipo("Cartel");
                                                                      System.out.println("Escriba el nombre del Cartel");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().setNombre(leer.next());
                                                                      System.out.println("Ingrese el grafico del anuncio (nombre.jpg)");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().setGrafico(leer.next());
                                                                      System.out.println("Ingrese las fotografias");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().setFotografia(leer.next());
                                                                      System.out.println("Actores involucrados: ");
                                                                      for( int n = 0; n < clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getActores().size() ; n++ )
                                                                        {
                                                                            System.out.print(clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getActores().get(n).getNombre()+" ");
                                                                        }
                                                                      System.out.println("\n");
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncioCarteles();
                                                                      
                                                                      System.out.println("...................................................................");
                                                                      System.out.println("Anuncio de "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getTipo()+" creado");
                                                                      System.out.println("Tipo: "+ clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getTipo());
                                                                      System.out.println("Nombre: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getNombre());
                                                                      System.out.println("Grafico: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getGrafico());
                                                                      System.out.println("Texto: "+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getEscrito());
                                                                      System.out.println("Fotografia"+clientes.get(nombreCliente).getCampañas().get(i).getAnuncioCarteles().getFotografia());
                                                                      clientes.get(nombreCliente).getCampañas().get(i).AddAnuncioCarteles();
                                                                      break;
                                                                      
                                                             default :System.out.println("Ingrese un valor valido");
                                                                      
                                                           
                                                                      
                                                                      
                                                                      
                                                                       
                                                                       
                                                                       
                                                            }
                                                         
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
