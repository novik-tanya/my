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
public class LightOffCommand implements CommandInt
{
    Light light;
    public LightOffCommand(Light light)
    {
        this.light=light;
    }

    public void execute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        light.off();
    }
    
    
}
