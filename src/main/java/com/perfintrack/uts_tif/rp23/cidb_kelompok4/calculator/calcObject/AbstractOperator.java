/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.perfintrack.uts_tif.rp23.cidb_kelompok4.calculator.calcObject;

/**
 *
 * @author Lenovo
 */
public abstract class AbstractOperator implements ICalcObject {
    @Override
    public final Type getType() {return Type.OPERATOR;}
    
    abstract public CalcNumber evaluate(CalcNumber left, CalcNumber right);
    abstract public CalcNumber evaluate(CalcNumber value);
    abstract public char getChar();
}
