package battery.builder;

public class ChargedState implements State {

    Carbattery carbattery;
    public ChargedState(Carbattery carbattery) {
        this.carbattery = carbattery;
    }

    @Override
    public void buyCarbattery() {
        System.out.println("Car battery already is being charged");
        carbattery.setState(carbattery.getBuyState());
    }

    @Override
    public void useCarbattery() {
        System.out.println("Car batteries are the source of energy to the car ");
        carbattery.setState(carbattery.getUseState());
    }

    @Override
    public void washCarbattery() {
        System.out.println("Car battery discharched can be charged");
    }

    @Override
    public void destroyCarbattery() {
        System.out.println("carbattery damaged");
        carbattery.setState(carbattery.getDamagedState());
    }


}