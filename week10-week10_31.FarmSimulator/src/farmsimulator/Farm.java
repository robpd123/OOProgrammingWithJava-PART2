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
import java.util.List;
import java.util.ArrayList;

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Farm Owner: ").append(owner);
        sb.append("\nBarn bulk tank: ").append(barn.toString());

        if (cows.isEmpty()) {
            sb.append("\nNo cows.");
        } else {
            sb.append("\nAnimals:\n");
            for (Cow cow : cows) {
                sb.append("        ").append(cow.toString()).append("\n");
            }
        }

        return sb.toString();
    }

}
