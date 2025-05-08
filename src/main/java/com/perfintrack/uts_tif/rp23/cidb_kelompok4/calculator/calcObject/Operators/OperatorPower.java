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
public class OperatorPower extends AbstractOperator{
    @Override
    public final CalcNumber evaluate(CalcNumber left, CalcNumber right) {
        return new CalcNumber(Math.pow(left.getValue(), right.getValue()));
    }
    @Override
    public final CalcNumber evaluate(CalcNumber val) {
        throw new UnsupportedOperationException("Power operation does not accept only one value!");
    }
    @Override
    public final char getChar() {
        return '^';
    }
}
