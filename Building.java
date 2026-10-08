import java.util.ArrayList;

public class Building {
    private final String name;
    private final ArrayList<Room> rooms = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        return rooms.stream().mapToInt(Room::getLampCount).sum();
    }

    public int getTotalWatt() {
        return rooms.stream().mapToInt(Room::getTotalWatt).sum();
    }

    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        System.out.println();
        for (Room room : rooms) {
            room.printRoom();
        }
        System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");
    }
}
