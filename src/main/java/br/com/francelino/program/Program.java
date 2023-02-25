/*
 * Copyright (C) 2023 Your Name &lt;francelino at ifnmg&gt;
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
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

        Ponto p1 = new Ponto(0.0,0.0);
        Ponto p2 = new Ponto(3.0,4.0);
        System.out.println("Distância: " + p1.calcularDistancia(p2));
        

    }
}
