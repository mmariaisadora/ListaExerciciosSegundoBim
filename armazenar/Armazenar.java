/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.armazenar;

/**
 *
 * @author aluno
 */
public class Armazenar {

    public static void main(String[] args) {
        Armazenavel ArquivoCache = new ArquivoCache();
        
        ArquivoCache.salvar();
        ArquivoCache.carregar();
    }
}
