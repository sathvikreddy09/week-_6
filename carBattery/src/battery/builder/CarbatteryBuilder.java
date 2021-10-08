package battery.builder;


public class CarbatteryBuilder implements Builder{

    CarbatteryBuilder(){

    }

    @Override
    public Builder Electrodes() {
        System.out.println("Car batteries are run by storing electricity");
        return this;
    }

    @Override
    public Builder Frame() {
        System.out.println("electrodes transfer the charge");
        return this;
    }

    @Override
    public Builder Acid() {
        System.out.println("A discharged car battery is useless");
        return this;
    }

    @Override
    public Carbattery build() {
        Carbattery s=new Carbattery();
        System.out.println("A car battery is installed!");
        return s;
    }
}
