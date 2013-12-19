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
public class StereoOnWithCommand implements CommandInt
{
    Stereo stereo;
    
    public StereoOnWithCommand(Stereo stereo)
    {
        this.stereo=stereo;
    }

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        stereo.off();
    }
    
}
