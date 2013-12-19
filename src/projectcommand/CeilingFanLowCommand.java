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
        fan.low();
    }

    public void undo() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(prevSpeed==CeilingFan.HIGH){
            fan.high();}
        else if(prevSpeed==CeilingFan.MEDIUM){
            fan.medium();  }
        else if(prevSpeed==CeilingFan.LOW){
            fan.low();}
        else if(prevSpeed==CeilingFan.OFF){
            fan.off();
        }
             
    
    }
    
    
}
