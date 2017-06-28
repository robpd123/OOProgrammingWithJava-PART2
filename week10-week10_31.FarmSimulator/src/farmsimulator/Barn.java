/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.ArrayList;

public class Barn {

    private MilkingRobot milkingRobot;
    private BulkTank bulkTank;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow) {
        try {
            milkingRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("Milking robot has not been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow : cows) {
                milkingRobot.milk(cow);
            }
        } catch (Exception e) {
            throw new IllegalStateException("Milking robot has not been installed");
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }

}
