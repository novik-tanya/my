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
public class CeilingFanLowCommand implements CommandInt
{
     CeilingFan fan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan fan) 
    {
        this.fan=fan;
    }

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        prevSpeed=fan.getSpeed();
        fan.high();
    }

    public void undo() {
      if(prevSpeed==CeilingFan.LOW){
            fan.low();}
        else if(prevSpeed==CeilingFan.OFF){
            fan.off();
        }
             
    
    }
    
    
}
