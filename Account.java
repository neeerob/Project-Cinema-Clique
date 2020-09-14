import java.lang.*;

public class Account
{
	protected String userFullName;
    protected String userUserName="";
    protected String userEmailID;
    protected String userPhoneNumber;
    protected String userPassWord="";
    protected String userConPassword;
	
	Account(){};
	
	Account(String userFullName, String userUserName, String userEmailID, String userPhoneNumber, String userPassWord, String userConPassword)
	{
		this.userFullName = userFullName;
		this.userUserName = userUserName;
		this.userEmailID = userEmailID;
		this.userPhoneNumber = userPhoneNumber;
		this.userPassWord = userPassWord;
		this.userConPassword = userConPassword;
	}

    public void setUserFullName(String userFullName)
    {
        this.userFullName = userFullName;
    }
    public void setUserUserName(String userUserName)
    {
        this.userUserName = userUserName;
    }
    public void setUserEmailID(String userEmailID)
    {
        this.userEmailID = userEmailID;
    }
    public void setUserPhoneNumber(String userPhoneNumber)
    {
        this.userPhoneNumber = userPhoneNumber;
    }
    public void setUserPassWord(String userPassWord)
    {
        this.userPassWord = userPassWord;
    }
    public void setUserConPassword(String userConPassword)
    {
        this.userConPassword = userConPassword;
    }
    public String getUserFullName()
    {
        return userFullName;
    }
    public String getUserUserName()
    {
        return userUserName;
    }
    public String getUserEmailID()
    {
        return userEmailID;
    }
    public String getUserPhoneNumber()
    {
        return userPhoneNumber;
    }
    public String getUserPassWord()
    {
        return userPassWord;
    }
    public String getUserConPassword()
    {
        return userConPassword;
    }
}