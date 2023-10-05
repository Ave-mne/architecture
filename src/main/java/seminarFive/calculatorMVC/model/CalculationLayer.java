package seminarFive.calculatorMVC.model;


import seminarFive.calculatorMVC.model.substractOperation.SubstractOperation;
import seminarFive.calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        SumOperation sumOperation = new SumOperation(a, b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        SubstractOperation substractOperation = new SubstractOperation(a, b);
        return substractOperation.subtract();
    }
}