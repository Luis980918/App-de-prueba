package com.company;

import javax.swing.*;

public class MultiplicacionDivision {
    int number1;
    int number2;
    double resultado;

    public MultiplicacionDivision(){
        number1= 0;
        number2= 0;
        resultado= 0;
    }
    public void multiplicacion(){
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 * number2;
        JOptionPane.showMessageDialog(null, "El resultado es" + resultado);
    }
    public void division(){
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = number1 / number2;
        JOptionPane.showMessageDialog(null, "El resultado es" + resultado);

}
    }
