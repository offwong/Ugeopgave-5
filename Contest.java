public class Contest {
    private final Animal animal1;
    private final Animal animal2;
    private int round = 0;

    public Contest(Animal animal1, Animal animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void playRound(){
        if (!animal1.isActive() || !animal2.isActive()){
            return;
        }
        round++;
        System.out.println("--- Runde " + round + " ---");

        attack(animal1,animal2);

        if (animal2.isActive()){
            attack(animal2, animal1);
        }
    }

    private void attack(Animal attacker, Animal defender){
        int damage = attacker.attack();
        defender.setEnergy(defender.getEnergy() - damage);

        System.out.println(attacker.getName() + " angriber "
                + defender.getName() + " for " + damage
                + "! (" + defender.getName() + " har "
                + defender.getEnergy() + " energi tilbage)");
    }

    public Animal getWinner(){
        if (animal1.isActive() && !animal2.isActive()){
            return animal1;
        }
        if (animal2.isActive() && !animal1.isActive()){
            return animal2;
        }
        return null;
    }
}
