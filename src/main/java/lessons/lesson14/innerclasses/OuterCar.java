package lessons.lesson14.innerclasses;

public class OuterCar {


    public void beginOfTravel(){
        Inner_Electric innerElectric = new Inner_Electric();
        innerElectric.turnOnIgnition();


        Inner_Engine innerEngine = new Inner_Engine();
        innerEngine.startEngine();
    }
    private class Inner_Engine {
        public void startEngine(){
            System.out.println("Starting engine");
        }

    }

    private class Inner_Electric {
        public void turnOnIgnition(){
            System.out.println("Turning on ignition");
        }

    }
}
