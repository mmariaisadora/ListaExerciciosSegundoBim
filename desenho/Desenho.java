/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desenho;

/**
 *
 * @author aluno
 */
public class Desenho {

    public static void main(String[] args) {
         Desenhavel Retangulo = new Retangulo();
         Desenhavel Circulo = new Circulo();
         Desenhavel Triangulo = new Triangulo();
         
         Retangulo.desenhar();
         Circulo.desenhar();
         Triangulo.desenhar();
    }
}
