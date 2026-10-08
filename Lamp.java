public class Lamp {
    private final int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    @Override
    public String toString() {
        return watt + "W";
    }
}
