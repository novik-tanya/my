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
public class SecurityControlOffCommand implements CommandInt
{
    SecurityControl security;

    public SecurityControlOffCommand( SecurityControl security)
    {
        this.security=security;
    }
    

    public void execute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        security.disarm();
    }

    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        security.arm();
    }
    
}
