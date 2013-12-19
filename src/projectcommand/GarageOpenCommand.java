/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author stud221
 */
public class GarageOpenCommand  implements CommandInt
{
    GarageDoor door;
    public GarageOpenCommand(GarageDoor door )
    {
        this.door=door;
    }
    public void execute()
    {
        door.up();
    
    }

    public void undo() {
        door.down();
    }

}
