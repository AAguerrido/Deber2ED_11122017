/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso
 */
class DiaAnyo {
    
    private int mes, dia; //se declara los atributos de tipo private
   
	 
    public DiaAnyo(int d, int m){ //se inicializa el constructor
        dia=d; 
        mes=m; 
    } 
    public boolean igual(DiaAnyo d){ //el metodo boolean muestra en pantalla el mes y el dia
        if((dia == d.dia) && (mes == d.mes)) //en el if se compara si las variables ingresadas son inguales 
            return true;//devuelve un valor verdadero 
        else
            return false;//devuelve un valor falso 
	} 
    public void visualizar(){ //permite visualizar las variables
	JOptionPane.showMessageDialog(null,"mes= " + mes + " , dia= " + dia);
    } 
} 

public class Ejercicio_cumpleanyos{ //clase principal
	public static void main(String[] ar) throws IOException{
		DiaAnyo hoy; //variable del tipo DiaAnyo con el nombre hoy
		DiaAnyo cumpleanyos; //variable del tipo DiaAnyo con el nombre cumpleanyos
		int d,m; //variables del tipo entero
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //la clase BufferedReader puede ingresar datos y almacenarlos en una variable
		JOptionPane.showMessageDialog(null,"Introduzca fecha de hoy, dia: "); 
		d=Integer.parseInt (JOptionPane.showInputDialog(entrada));
		JOptionPane.showMessageDialog(null,"Introduzca el numero del mes: "); 
		m=Integer.parseInt (JOptionPane.showInputDialog(entrada)); 
		
		hoy = new DiaAnyo(d,m); // Hacemos un llamado a la variable hoy
		
		JOptionPane.showMessageDialog(null,"Introduzca la fecha de nacimiento, dia: ");
		d=Integer.parseInt (JOptionPane.showInputDialog(entrada));
		JOptionPane.showMessageDialog(null,"Introduzca el numero del mes: "); 
		m=Integer.parseInt (JOptionPane.showInputDialog(entrada));
		
                cumpleanyos = new DiaAnyo(d,m); //llamado a la variable cumpleanyos 
		
		JOptionPane.showMessageDialog(null," La fecha de hoy es: "); 
		hoy.visualizar(); //visualiza los datos dentro de la variable hoy 
		JOptionPane.showMessageDialog(null," Su fecha de nacimiento es: ");
		cumpleanyos.visualizar(); //visualiza los datos dentro de la variable "hoy" 
		
		if(hoy.igual(cumpleanyos)) //comparacion de la fecha ingresada a la fecha del cumpleaños
	           JOptionPane.showMessageDialog(null," Feliz Cumpleaños! "); //igual se despliega un mensaje
		else
	            JOptionPane.showMessageDialog(null,"No es su cumpleaños"); //falso se desplegara un mensaje
	}
    

