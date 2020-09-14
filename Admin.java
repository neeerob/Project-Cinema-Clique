import java.lang.*;

public class Admin
{
	public String adminId = "admin1234";
	public String adminPassword = "1234";
	
	public Account accounts[] = new Account[100];
	public Movies movies[] = new Movies[100];
	
	
	public boolean insertUser(Account a)
    {
        boolean flag = false;
        for(int i = 0;i<accounts.length;i++)
        {
            if(accounts[i] == null)
            {
                accounts[i] = a;
                flag = true;
                break;
            }

        }
        return flag;
    } 
	
	public boolean insertMovie(Movies m)
	{
		boolean flag = false;
		
		for(int i=0; i<movies.length;i++)
		{
			if(movies[i]==null)
			{
				movies[i]=m;
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public Movies searchMovie(String Movie)
	{
		Movies m2 = null;
		
		for(int i=0; i<movies.length; i++)
		{
			if(movies[i] != null)
			{
				if(movies[i].getMovie() == Movie)
				{
					m2 = movies[i];
					break;
				}
			}
		}
		return m2;
	}
	
	public boolean deleteMovie(Movies m)
	{
		boolean flag = false;
		
		for(int i=0; i<movies.length;i++)
		{
			if(movies[i] == m)
			{
				movies[i]=null;
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllUser()
	{
		for(int i=0; i<accounts.length;i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("Name : "+accounts[i].getUserFullName());
				System.out.println("User Name : "+accounts[i].getUserUserName());
				System.out.println("E-Mail : "+accounts[i].getUserEmailID());
				System.out.println("\n-----------------------------\n");
			}
		}
	}
}

//addMovie,,deleteMovie,,showAllUser.