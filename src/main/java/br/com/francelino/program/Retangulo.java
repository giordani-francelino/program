/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.francelino.program;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class Retangulo {

    private float ladoA;
    private float ladoB;

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float calcularArea() {
        return ladoA * ladoB;
    }

}
