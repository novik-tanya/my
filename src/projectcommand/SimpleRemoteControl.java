/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author stud221
 */
public class SimpleRemoteControl
{
    CommandInt slot;
    
    public SimpleRemoteControl() {}
    
    public void SetCommand(CommandInt command)
    {
        slot=command;
    }
    public void buttonWasPressed()
    {
        slot.execute();
    }

}
