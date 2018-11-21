/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

/**
 *
 * @author Usuario
 */
class Cuenta {
     //atributos

    private String nombreCuenta, numCuenta;

    private double saldo;



    //metodos

    public Cuenta() {

    }



    public Cuenta(String nombreC, String numC, double saldo) {



        nombreCuenta = nombreC;

        numCuenta = numC;

        this.saldo = saldo;

    }



    public void setNombre(String nombreC) {

        nombreCuenta = nombreC;

    }



    public void setCuenta(String numCuenta) {

        this.numCuenta = numCuenta;

    }



    public void setSaldo(double saldo){

        this.saldo=saldo;

    }

    

    public String getNombre(){

        return nombreCuenta;

    }

    

    public String getNumCuenta(){

        return numCuenta;

    }

    

    public double getSaldo(){

        return saldo;

    }

    

    public boolean ingresar(double ingreso){

        if (ingreso>=0){

        saldo+=ingreso;

        return true;

        }

        else {

            System.out.println("\nLa cantidad no puede ser negativa");

            return false;

        }

        

    }

        

    public boolean reintegrar(double reintegro){

        if(saldo>0){

            saldo-=reintegro;

        return true;

        }

        else{

            System.out.println("\nNo hay suficiente saldo para un reintegro");

            return false;

        }

        

        }

    

    public void visualizar(){

        System.out.println("\nNombre de cuenta: "+getNombre()+"\nNumero de cuenta: "+getNumCuenta()+"\nSaldo de la cuenta: "+getSaldo());

    }

    

    public void transferencia(Cuenta cuentaDestino, double importe){

        if(saldo<=0 || importe>saldo){

            System.out.println("\nNo hay suficiente saldo en la cuenta Origen");

        }

        else{

            cuentaDestino.saldo+=importe;

            saldo-=importe;

        }
}
}

