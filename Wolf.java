import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Animal{
    public Wolf(String name, int energy){
        super(name, energy);
    }
    public int attack(){
        return ThreadLocalRandom.current().nextInt(5, 13);

    }
}
