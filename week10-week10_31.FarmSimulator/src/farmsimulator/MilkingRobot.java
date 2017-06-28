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
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot(){
        //tank = new BulkTank();
    }
    
    public BulkTank getBulkTank(){
        return tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
  
    public void milk(Milkable milkable) throws Exception{
        try{
            tank.addToTank(milkable.milk());
        } catch (Exception e){
            throw new IllegalStateException("No tank has been fixed");
        }
        tank.addToTank(milkable.milk());
    }
    
}
