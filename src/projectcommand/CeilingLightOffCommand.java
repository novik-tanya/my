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
public class CeilingLightOffCommand implements CommandInt
{
    CeilingLight ceiling;

    public CeilingLightOffCommand(CeilingLight ceiling) 
    {
        this.ceiling=ceiling;
    }
    
    

    public void execute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ceiling.off();
        
    }
    
}
