package battery.builder;

public interface Builder {
    Builder Electrodes();
    Builder Frame();
    Builder Acid();
    Carbattery build();
}