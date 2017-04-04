/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private String dateCreation;
    private String nomCliente;
    private Movimiento movimiento;
    ArrayList <Movimiento> cantMovimientos = new ArrayList <Movimiento>();

    public Cuenta(int numeroCuenta, double saldo, String dateCreation, String nomCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.dateCreation = dateCreation;
        this.nomCliente = nomCliente;
        
    }
    
    
}
