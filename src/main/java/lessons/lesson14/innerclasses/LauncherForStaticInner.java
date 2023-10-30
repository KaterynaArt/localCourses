package lessons.lesson14.innerclasses;

public class LauncherForStaticInner {

    public static void main(String[] args) {
        OuterCarStatic.Inner_Electric innerElectric = new OuterCarStatic.Inner_Electric();
        innerElectric.turnOnIgnition();
    }
}
