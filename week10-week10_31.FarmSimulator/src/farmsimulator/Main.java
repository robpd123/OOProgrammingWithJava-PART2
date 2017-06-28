package farmsimulator;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Arto");
        MilkingRobot r = new MilkingRobot();
        r.milk(cow);
    }

}
