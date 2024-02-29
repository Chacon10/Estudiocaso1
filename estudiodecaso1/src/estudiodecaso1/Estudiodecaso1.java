/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Estudiodecaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // parte 1 
        //hice que pidiera al usuario que ingre cantidad de facturas para registrar y guardar el valor 
        //declarar arreglos para almacenar los datos de facturas 
        
    int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a registrar: "));
    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
    int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente: "));
    int [] codigoFactura = new int[cantidadFacturas];
    int [] mesFactura = new int[cantidadFacturas];
    int [] anoFactura = new int[cantidadFacturas];
    double [] montoFactura = new double[cantidadFacturas];
    int [] estadoFactura = new int[cantidadFacturas];
    
    
    //Lo que hice acontinuacion fue utilizar un bucle for para iterar desde 0 hasta la cantidad de facturas
    // utilice arreglos para almacenar datos de cada factura
    //use tambien JOptionPane para pedir cada ingreso
    
    for(int i=0; i<cantidadFacturas; i++) {
      codigoFactura[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código de la factura " + (i+1) + ": "));
      
      mesFactura[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de la factura " + (i+1) + ": "));   
      
      anoFactura[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de la factura " + (i+1) + ": "));
      
      montoFactura[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto de la factura " + (i+1) + ": "));
      
      estadoFactura[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese estado de la factura " + (i+1) + " (1 para pagada, 2 para no pagada): "));
    }

    // Ultima parte de desarrollamiento
    // realice una inicializacion de las variables , recorrer arreglo, tambien imprimir y por ultimo dentro de bucle se calcula interes
    //cuaota mensual , tambein para calcular mes y anos de pagos
    //
    double montoTotal = 0;
    int cantidadNoPagadas = 0;
    
    for(int i=0; i<cantidadFacturas; i++) {
      if(estadoFactura[i] == 2) {
        montoTotal += montoFactura[i]; 
        cantidadNoPagadas++;
      }
    }
    
    double interes = 0.15; 
    int cantidadMeses = 4;
    
    double montoCuota = (montoTotal * (1 + interes)) / cantidadMeses;
   
     
    String resultado = "";
    resultado += "\nPLAN DE PAGO PARA " + nombreCliente;
    resultado += "\nCédula: " + cedulaCliente;
    
    for(int i=0; i<cantidadMeses; i++) {
      int mesPago = 3 + i; // Empieza a pagar desde marzo
      int anoPago = 2024;
      System.out.println("Cuota " + (i+1) + ": " + montoCuota + " colones, fecha de pago: " + mesPago + "-" + anoPago); 
    }
        int i = 0;
        String mesPago = null;
        String anoPago = null;
    
   resultado += "\nCuota " + (i+1) + ": " + montoCuota + " colones, fecha de pago: " + mesPago + "-" + anoPago;
    
   resultado += "\n\nMonto total adeudado por " + nombreCliente + ": " + montoTotal + " colones";
    
    JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
