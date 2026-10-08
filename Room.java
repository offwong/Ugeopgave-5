import java.util.ArrayList;
import java.util.stream.Collectors;

public class Room {
    private final String name;
    private final ArrayList<Lamp> lamps = new ArrayList<>();
    private final ArrayList<Window> windows = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        return lamps.stream().mapToInt(Lamp::getWatt).sum();
    }

    public int getTotalWindowArea() {
        return windows.stream().mapToInt(Window::getAreaCm2).sum();
    }

    public void printRoom() {
        String lampList = lamps.stream().map(Lamp::toString).collect(Collectors.joining(", "));
        String windowList = windows.stream().map(Window::toString).collect(Collectors.joining(", "));
        System.out.println(name + " (" + lamps.size() + " lamper, " + windows.size() + " vinduer)");
        System.out.println("  Lamper: " + lampList + " (total: " + getTotalWatt() + "W)");
        System.out.println("  Vinduer: " + windowList);
        System.out.println();
    }
}
