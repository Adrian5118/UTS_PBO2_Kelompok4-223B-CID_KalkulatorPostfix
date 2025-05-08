/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.perfintrack.uts_tif.rp23.cidb_kelompok4.calculator.calcObject.Operators;

import com.perfintrack.uts_tif.rp23.cidb_kelompok4.calculator.calcObject.AbstractOperator;
import com.perfintrack.uts_tif.rp23.cidb_kelompok4.calculator.calcObject.CalcNumber;

/**
 *
 * @author Lenovo
 */
public class OperatorCos extends AbstractOperator{
    @Override
    public final CalcNumber evaluate(CalcNumber left, CalcNumber right) {
        throw new UnsupportedOperationException("Cosine operation does not accept two values!");
    }
    @Override
    public final CalcNumber evaluate(CalcNumber val) {
        return new CalcNumber(Math.cos(val.getValue()));
    }
    @Override
    public final char getChar() {
        return 'C';
    }
}
