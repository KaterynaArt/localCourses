package lessons.lesson17.sorting.comparable;

import java.util.TreeSet;

public class Launcher {
    public static void main(String[] args) {
        TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(new Car("Bmw",2020));
        carTreeSet.add(new Car("Mercedes",2016));
        carTreeSet.add(new Car("Opel",2010));
        carTreeSet.add(new Car("Volvo",2005));

        for (Car car: carTreeSet){
            System.out.println(car);
        }
    }

}
