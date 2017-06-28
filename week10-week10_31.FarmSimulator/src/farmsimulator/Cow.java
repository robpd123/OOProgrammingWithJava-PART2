/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author comet
 */
import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private BulkTank udders;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this("rand");
    }

    public Cow(String name) {
        Random rand = new Random();
        int udderCapacity = 15 + rand.nextInt(26);

        udders = new BulkTank(udderCapacity);

        if (name.equals("rand")) {
            this.name = NAMES[rand.nextInt(NAMES.length)];
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udders.getCapacity();
    }

    public double getAmount() {
        return udders.getVolume();
    }

    @Override
    public double milk() {
        double milkInCow = getAmount();
        udders.getFromTank(milkInCow);
        return milkInCow;
    }

    @Override
    public void liveHour() {
        Random rand = new Random();
        double milkProduced = 0.7 + rand.nextDouble() * 1.3;
        udders.addToTank(milkProduced);
    }

    @Override
    public String toString() {
        return name + " " + udders;
    }
}
