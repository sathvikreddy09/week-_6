package battery.builder;

public class UseState implements State{

    Carbattery carbattery;
    public UseState(Carbattery carbattery) {
        this.carbattery = carbattery;
    }

    @Override
    public void buyCarbattery() {
        System.out.println("Car battery is the energy source");
        carbattery.setState(carbattery.getBuyState());

    }

    @Override
    public void useCarbattery() {
        System.out.println("Car batteries die if not charged");
    }

    @Override
    public void washCarbattery() {
        System.out.println("A discharged car battery can be charged");
        carbattery.setState(carbattery.getChargedState());
    }

    @Override
    public void destroyCarbattery() {
        System.out.println("Car battery damaged");
        carbattery.setState(carbattery.getDamagedState());
    }



}
