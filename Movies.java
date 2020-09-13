import java.lang.*;

class Movies
{
	String Name;
    String Username ;
	String Email ;
	String Password ;
	int Phone;
	
	public Movies()
	{
		
	}
	public Movies(String Name,String Username,String Email,String Password,int Phone)
	{
		this.Name = Name;
		this.Username= Username;
		this.Email= Email;
		this.Password = Password;
		this.Phone = Phone;
	}
	public void setName(String Name)
	{
		Name = Name;
	}
	public void setUsername(String Username)
	{
		Username = Username;
	}
	public void setEmail(String Email)
	{
		Email = Email;
	}
	public void setPassword(String Password)
	{
		Password = Password;
	}
	public void setPhone (int Phone)
	{
		Phone = Phone;
	}
	
	public String getName()
	{
		return Name;
	}
	public String getUsername()
	{
		return Username;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getPassword()
	{
		return Password;
	}
	public int getPhone()
	{
		return Phone;
	}
	
	public void showinfo()
	{
		System.out.println("Name is :"+Name);
		System.out.println("User Name is :"+Username);
		System.out.println("Email Address is :"+Email);
		System.out.println("Password is :"+Password);
		System.out.println("Number is :"+Phone);
		
	}


	
}