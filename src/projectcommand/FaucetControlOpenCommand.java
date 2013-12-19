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
public class FaucetControlOpenCommand implements CommandInt
{
    FaucetControl faucet;

    public FaucetControlOpenCommand(FaucetControl faucet)
    {
        this.faucet=faucet;
    }
    

    public void execute() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        faucet.openValue();
    }

    public void undo() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        faucet.closeValue();
    }
    
}
