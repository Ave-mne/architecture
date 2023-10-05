package seminarFive.calculatorMVC;

import seminarFive.calculatorMVC.View.ConsoleView;
import seminarFive.calculatorMVC.View.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}