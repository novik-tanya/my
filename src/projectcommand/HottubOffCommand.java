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
public class HottubOffCommand implements CommandInt
{
    Hottub hottub;

    public HottubOffCommand( Hottub hottub) 
    {
        this.hottub=hottub;
    }
    
    

    public void execute() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        hottub.setTemperaturet();
        hottub.justOff();
    }
    
    
}
