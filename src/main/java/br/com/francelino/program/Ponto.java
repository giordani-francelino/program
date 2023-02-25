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

import java.lang.Math;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class Ponto {

    private Double x;
    private Double y;

    public Ponto() {
        x = 0.0;
        y = 0.0;
    }

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;

    }

    public Double calcularDistancia(Ponto p) {
        Double distancia;
        distancia = Math.pow(this.x - p.x, 2.0) + Math.pow(this.y - p.y, 2.0);

        distancia = Math.sqrt(distancia);
        return distancia;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + "0";
    }

}
