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
public class GarageCloseCommand implements CommandInt
{
     GarageDoor door;
    public GarageCloseCommand(GarageDoor door )
    {
        this.door=door;
    }

    public void execute() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        door.down();
    }

    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        door.up();
    }
    
}
