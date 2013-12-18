/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author stud221
 */
public class LightOnCommand implements CommandInt
{
    Light light;
    public LightOnCommand(Light light)
    {
        this.light=light;
        //System.out.println("Light is on!");
    }
    public void execute()
    {
        light.on();
    }
}
