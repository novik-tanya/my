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
public class CeilingFanOnCommand implements CommandInt
{
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) 
    {
        this.fan=fan;
    }

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        fan.high();
        fan.setSpeed();
    }
    
}
