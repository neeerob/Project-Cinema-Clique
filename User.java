import java.lang.*;


public class User
{
	protected CreatAccount creatAccount[] = new CreatAccount[100];
    
    public boolean insertUserAccount(CreatAccount account)
    {
        boolean flag = false;
        for(int i = 0;i<creatAccount.length;i++)
        {
            if(creatAccount[i] == null)
            {
                creatAccount[i] = account;
                flag = true;
                break;
            }

        }
        return flag;
    } 
    public boolean logIn(String userName, String userPassword)
    {
        boolean flag = false;
        
            for(int i=0;i<creatAccount.length;i++)
            {
                if(userName.equals(creatAccount[i].getUserUserName()) && userPassword.equals(creatAccount[i].getUserPassWord()))
                {
                    flag = true;
                    break;
                }
            }
        return flag;
    }
    
}