/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        

        Cuenta cuentaO1 = new Cuenta();

                                           //uno sin parametros

        Cuenta cuentaD1 = new Cuenta(); 



        Cuenta cuentaO2 = new Cuenta("Juan","123",5000);

                                                            //otro con parametros

        Cuenta cuentaD2 = new Cuenta("Pepe","321",7000);

        

        

        cuentaO2.visualizar();

        cuentaD2.visualizar();

        

        

        System.out.println("\nIntroduce la cantidad a retirar en la cuenta 02:");

        

        double retiro = leer.nextDouble();

        

        cuentaO2.reintegrar(retiro);

        

        cuentaO2.visualizar();

        

        System.out.println("\nIntroduce la cantidad a ingresar en la cuenta 02:");

        

        double importe = leer.nextDouble();

        

        cuentaO2.ingresar(importe);

        

        cuentaO2.visualizar();

        

        

        

        

        System.out.println("\nIntroduce la cantidad a transferir a la cuenta D2: ");

        

        double trans = leer.nextDouble();

        

        cuentaO2.transferencia(cuentaD2, trans);

        

        cuentaO2.visualizar();

        cuentaD2.visualizar();
    }
    
}
