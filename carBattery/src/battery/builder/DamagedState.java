package battery.builder;


public class DamagedState implements State {

    Carbattery carbattery;
    public DamagedState(Carbattery carbattery) {
        this.carbattery = carbattery;
    }

    @Override
    public void buyCarbattery() {
        System.out.println("Installing car battery");
        carbattery.setState(carbattery.getBuyState());
    }

    @Override
    public void useCarbattery() {
        System.out.println("Car batteries are used in car for the engine");
    }

    @Override
    public void washCarbattery() {
        System.out.println("Car battery damaged can be repaired");

    }

    @Override
    public void destroyCarbattery() {
        System.out.println("Car battery died");

    }


}
