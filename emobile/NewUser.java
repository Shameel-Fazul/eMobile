/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;

/**
 *
 * @author hnd
 */
public class NewUser 
{
    
        private String Username;
        private String Type;
        private String Password;
        private String ConfirmPassword;

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the ConfirmPassword
     */
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    /**
     * @param ConfirmPassword the ConfirmPassword to set
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }
    public void addUser(NewUser obj) throws Exception
    {
       String  SQL="insert into [User] values('"+obj.Username+"','"+obj.Type+"','"+obj.Password+"')";
       DBConnection objcon=new DBConnection();
       System.out.println(""+SQL);
       objcon.addValue(SQL);
    }
    
}
