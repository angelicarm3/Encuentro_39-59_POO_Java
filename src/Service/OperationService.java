/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Operation;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class OperationService {
    private Scanner leer = new Scanner(System.in);

    public Operation createOperation() {

        System.out.println("Ingrese dos números.");
        int num1 = (leer.nextInt());
        int num2 = (leer.nextInt());

        return new Operation(num1, num2);
    }

    public int add(Operation o) {

        int addition = o.getNum1() + o.getNum2();

        return addition;
    }

    public int substract(Operation o) {

        int substraction = o.getNum1() - o.getNum2();

        return substraction;
    }

    public int multiply(Operation o) {

        if (o.getNum1() == 0 || o.getNum2() == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        } else {
            int multiplication = o.getNum1() * o.getNum2();
            return multiplication;
        }
    }

    public double divide(Operation o) {

        if (o.getNum2() == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            double division = (double) o.getNum1() / (double) o.getNum2();
            return division;
        }
    }
}
