public class Window {
    private final int widthCm;
    private final int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getAreaCm2() {
        return widthCm * heightCm;
    }

    @Override
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}
