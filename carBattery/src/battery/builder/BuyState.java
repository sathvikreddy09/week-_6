package battery.builder;

public class BuyState implements State {

    Carbattery carbattery;
    public BuyState(Carbattery carbattery) {
        this.carbattery = carbattery;
    }

    @Override
    public void buyCarbattery() {
        System.out.println("Installing Carbatteries");

    }

    @Override
    public void useCarbattery() {
        System.out.println("Carbatteries are used in cars to charge the engine");
        carbattery.setState(carbattery.getUseState());

    }

    @Override
    public void washCarbattery() {
        System.out.println("Charging carbatteries");
        carbattery.setState(carbattery.getChargedState());
    }

    @Override
    public void destroyCarbattery() {
        System.out.println("Car battery Damaged");
        carbattery.setState(carbattery.getDamagedState());
    }

}