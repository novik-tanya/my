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
public class ApplianceControlOnCommand implements CommandInt
{

    ApplianceControl appliance;

    public ApplianceControlOnCommand(ApplianceControl appliance) {
        this.appliance=appliance;
    }
    
    

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    appliance.on();
    }

    public void undo() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        appliance.off();
    }
    
}
