/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.perfintrack.uts_tif.rp23.cidb_kelompok4.calculator.calcObject;

/**
 *
 * @author Lenovo
 */
public class CalcNumber implements ICalcObject{
    private double value;
    
    public CalcNumber(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
    
    @Override
    public final Type getType() {return Type.NUMBER;}
}
