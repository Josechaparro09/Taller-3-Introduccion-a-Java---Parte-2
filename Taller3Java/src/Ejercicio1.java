/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1. Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n 
elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena 
el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
 Requiere un aplicativo que le calcule rápidamente los siguientes datos: 
 Total productos vendidos en el día.
 Total ingresos por ventas del día.
 El producto más vendido.
 El producto más costoso vendido.
*/

import java.util.Scanner;

/**
 *
 * @author josec
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int nElementos;
        System.out.print("Ingrese el numero de articulos a agregar: ");
        nElementos=entrada.nextInt();
        
        long [] A= new long [nElementos];
        double [] B= new double [nElementos];
        int [] C = new int [nElementos];
        double[] totalVentas=new double[nElementos];
        int sumaProductosVendidos;
        double ingresoPorVentas =0 ;
        int mayor = 0,posMayor = 0,posCostoso;
        double prodMasCostoso;
        int sumProd = 0;
        
        
        for (int i = 0; i < nElementos; i++) {
            
            System.out.printf("Ingrese el codigo del producto #%d: ", i+1);
            A[i]=entrada.nextLong();
            System.out.printf("Ingrese el Valor de venta del producto #%d: ", i+1);
            B[i]=entrada.nextDouble();
            System.out.printf("Ingrese las cantidades vendidas del producto #%d: ", i+1);
            C[i]=entrada.nextInt();
            sumProd+=C[i];
            totalVentas[i]=B[i]*C[i];
            ingresoPorVentas+=totalVentas[i];
        }
            mayor=C[0];
            prodMasCostoso=B[0];
            
        for (int i = 0; i < nElementos; i++) {
            if (i<nElementos) {
                if (C[i]>mayor) {
                
                    mayor=C[i];
                    posMayor=i;
                
                }   
                if (B[i]>prodMasCostoso) {
                    
                    prodMasCostoso=B[i];
                    posCostoso=i;
                    
                }
                
            }
            
            
        }
        
        System.out.printf("Total productos vendidos del dia : %d productos%n", nElementos);
        System.out.printf("El total de ingresos por ventas del dia es de: %2f %n%n", ingresoPorVentas);
        System.out.printf("El producto mas vendido es: %n");
        System.out.printf("Codigo: %d%n",A[posMayor]);
        System.out.printf("Valor: %2f%n" , B[posMayor]);
        System.out.printf("Numero de ventas: %d%n" , C[posMayor]);
        
        
        
        
        
    }
            
            
            
            
            
    
}
