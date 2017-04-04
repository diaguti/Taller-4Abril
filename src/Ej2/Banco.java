/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Estudiante
 */
public class Banco {
   private String codigo;
   private Tipo tipo;
   private Cuenta cuenta;

    public Banco(String codigo, Tipo tipo, Cuenta cuenta) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.cuenta = cuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
   
   
}
