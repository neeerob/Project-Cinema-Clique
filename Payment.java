import java.lang.*;

public class Payment 
{
    public Movies movies[] = new Movies[100];

    protected String visaCard;
    protected String userName;
    protected String numberBehindCard;
    protected String pinNumber;

    Payment(String visaCString,String userName,String numberBehindCard,String pinNumber)
    {
        this.visaCard = visaCard;
        this.userName = userName;
        this.numberBehindCard = numberBehindCard;
        this.pinNumber = pinNumber;

    }
    public void setVisaCard(String visaCard)
    {
        this.visaCard = visaCard;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setNumberBehindCard(String numberBehindCard)
    {
        this.numberBehindCard = numberBehindCard;
    }
    public void setPinNumber(String pinNumber)
    {
        this.pinNumber = pinNumber;
    }
    public String getVisaCard()
    {
        return visaCard;
    }
    public String getUserName()
    {
        return userName;
    }
    public String getNumberBehindCard()
    {
        return numberBehindCard;
    }
    public String getPinNumber()
    {
        return pinNumber;
    }
    
    

}
