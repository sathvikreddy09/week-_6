package battery.builder;

public class Carbattery
{
    UseState useState;
    ChargedState chargedState;
    BuyState buyState;
    DamagedState damagedState;
    State state;

    Carbattery()
    {
        useState = new UseState(this);
        chargedState= new ChargedState(this);
        damagedState = new DamagedState(this);
        buyState=new BuyState(this);
        state=buyState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public UseState getUseState() {
        return useState;
    }

    public ChargedState getChargedState() {
        return chargedState;
    }

    public BuyState getBuyState() {
        return buyState;
    }

    public DamagedState getDamagedState() {
        return damagedState;
    }

    public void buyCarbattery()  {
        state.buyCarbattery();
    }

    public void useCarbattery()  {
        state.useCarbattery();
    }

    public void washCarbattery() {
        state.washCarbattery();
    }
    public void destroyCarbattery() {
        state.destroyCarbattery();
    }

}
