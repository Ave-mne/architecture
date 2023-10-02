package HomeWork3;

import HomeWork3.model.excersize.ExcersizeFactory;
import HomeWork3.model.excersize.IExcersizeFactory;
import HomeWork3.model.workout.Workout;
import HomeWork3.view.ConsoleView;
import HomeWork3.view.IView;

public class Main {
    public static void main(String[] args) {

        Workout workout = new Workout();
        IExcersizeFactory iExcersizeFactory = new ExcersizeFactory();
        IView iView = new ConsoleView(workout, iExcersizeFactory);
        iView.run();

    }
}