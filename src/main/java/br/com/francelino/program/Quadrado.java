/*
 * Copyright (C) 2023 Casa
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

/**
 *
 * @author Casa
 */
public class Quadrado {

    private float lado;
    
    public Quadrado(){
        
    }
    
    public Quadrado(float lado) throws Exception{
        setLado(lado);
    }

    public void setLado(float lado) throws Exception {
        if (lado < 0) {
            throw new Exception("Lados não podem ser negativos");
        } 
            this.lado = lado;
        
    }
//<editor-fold defaultstate="collapsed" desc="comment">
    //from
//</editor-fold>

    public float getLado() {
        return this.lado;
//        return lado;
    }

    public float calcularArea() {
        return lado * lado;
    }
}
