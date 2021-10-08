package battery.builder;


public class Main {

    public static void main(String[] args) {

        CarbatteryBuilder battery = new CarbatteryBuilder();
        Carbattery car = battery.Electrodes().Frame().Acid().build();


        car.buyCarbattery();

        car.destroyCarbattery();

        car.washCarbattery();

        car.useCarbattery();

        car.buyCarbattery();


    }
}
