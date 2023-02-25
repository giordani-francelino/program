/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.francelino.program;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author &lt;francelino at ifnmg&gt;
 */
public class Program {

    public static void main(String[] args) {
        int x = 10;

        String nome;
        nome = ("teste");
        String nome1 = "brasil";
        System.out.println(nome == nome1);

        System.out.println(">>" + nome);
        System.out.println(">>" + nome.toUpperCase());
        System.out.println(">>" + nome);
        System.out.println(">>" + nome.length());

        
        
        Quadrado q1;

        try {
//            q1.setLado(-2.5f);
            q1 = new Quadrado(2);

            System.out.println(q1.getLado());
            System.out.println(q1.calcularArea());
        } catch (Exception ex) {
//            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        Retangulo r1;
        r1 = new Retangulo();
        r1.setLadoA(2.3f);
        r1.setLadoB(5.2f);
        System.out.println("Retângulo ladoA: " + r1.getLadoA());
        System.out.println("Retângulo ladoB: " + r1.getLadoB());
        System.out.println("Retângulo Área: " + r1.calcularArea());

    }
}
