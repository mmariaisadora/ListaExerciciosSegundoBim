/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author aluno
 */
public class ingressoVIP extends ingresso {
    private float valorAdicional;
    
    public ingressoVIP(float valor, float valorAdicional) {
        super(valor);
        
        this.valorAdicional = valorAdicional; 
    }
      
     public String toString (){
         return " Ovalor do Ingresso VIP é: " + (this.getValor() + this.getValorAdicional());
     }
     public float getValorAdicional() {
         return valorAdicional;
     }
     public void setValorAdc(float valorAdicional){
         this.valorAdicional = valorAdicional;
     }
    
}
