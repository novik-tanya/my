/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author Пользователь
 */
public class GardenLightOnCommand implements CommandInt
{
     GardenLight garden;

    public GardenLightOnCommand(GardenLight garden)
    {
        this.garden=garden;
    }

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        garden.manualOn();
        garden.setDuskTime();
        
    }

    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        garden.manualOff();
    }
    
    
    
}
