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
public class StereoOffCommand implements CommandInt
{
      Stereo stereo;
    
    public StereoOffCommand(Stereo stereo)
    {
        this.stereo=stereo;
    }


    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        stereo.off();
    }

    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        stereo.on();
    }
    
}
