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
public class TVOffCommand implements CommandInt
{
     TV tv;

    public TVOffCommand(TV tv) 
    {
        this.tv=tv;
    }
    

    public void execute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tv.off();
        
    }
    
    
}
