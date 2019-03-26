/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;
import java.util.Scanner;

/**
 *
 * @author Kevin Loarca 0901-17-11537
 */
public class ListasEnlazadas
{
    	Nodo Primero;
	public ListasEnlazadas(){
		Primero=null;
	}
        
        public void Localizacion(){
            Scanner entrada = new Scanner(System.in);
                Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
                int pos;
                System.out.println("Que posicion desdea localizar: ");
                pos = entrada.nextInt();
		if (pos>=0){
			while (k!=pos && actual.Siguiente != null){
				anterior=actual;
                                actual=actual.Siguiente;
				k++;
				
			}
                        System.out.println("Datos en posicion " +pos+" :   "+actual.info);
		}
        }
        
        //Revisa si la primera casilla esta vacio si esta vacia lo regresa
	public boolean vacia(){
		if (Primero==null){
			return(true);
		} else{
			return(false);
		}
	}
        
        //Ingresa el primer datos en el nodo y lo iguala o una variable temporal que se utilizara mas adelante
	public void InsertarEnPrimero(int Dato){
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
        
        //Igual la varible a otra para que la otra se pueda quedar en blanco
	public void borrarPrimero(){
		Primero=Primero.Siguiente;
	}
        
        //
	public String Listar(){
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null){
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
        
	public void borrarUltimo(){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null){
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
        
	public void borrarPosicion(int pos){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0){
			while (k!=pos && actual.Siguiente != null){
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}

}
