/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author stud221
 */
public class RemoteControlTest
{
    public static void main(String[] arg)
    {
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        GarageDoor garageDoor=new GarageDoor();
        LightOnCommand lightOn=new LightOnCommand(light);
        GarageOpenCommand garageOpen=new  GarageOpenCommand(garageDoor);

        remote.SetCommand(lightOn);
        remote.buttonWasPressed();
        remote.SetCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
