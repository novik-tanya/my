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
public class SprinklerOnCommand implements CommandInt
{
    Sprinkler sprinkler;

    public SprinklerOnCommand(Sprinkler sprinkler) 
    {
        this.sprinkler=sprinkler;
    }

    public void execute() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sprinkler.waterOn();
    }

    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        sprinkler.waterOff();
    }
    
    
}
