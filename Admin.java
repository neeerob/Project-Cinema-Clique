import java.lang.*;

public class Admin
{
	public String adminId = "admin1234";
	public String adminPassword = "1234";
	
	protected String dimention2d = "2d";
	protected String dimention2D = "2D";
	protected String dimention3D = "3D";
	protected String dimention3d = "3d";

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
				if(movies[i].getMovie().equals(Movie))
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
	public void showAllMovies()
	{
		System.out.println("---------------------------");

		for(int i = 0;i<movies.length;i++)
		{
			if(movies[i] != null)
			{
			movies[i].showMovies();
			}
		}
	}

	public void showTicketPricing()
	{
		System.out.println("---------------------------");
		for(int i =0;i<movies.length;i++)
		{
			if(movies[i] != null)
			{
				if(movies[i].getDimention().equals(dimention2D) || movies[i].getDimention().equals(dimention2d))
				{
					System.out.println("Movies Name : " + movies[i].getMovie());
					System.out.println("Time : " + movies[i].getTime()+movies[i].getAmOrPm());
					System.out.println("Movies Dimention : 2D");
					System.out.println("Movies Price : 450"  );
					System.out.println("---------------------------");
				}
				if(movies[i].getDimention().equals(dimention3D) || movies[i].getDimention().equals(dimention3d))
				{
					System.out.println("Movies Name : " + movies[i].getMovie());
					System.out.println("Movies Dimention : 3D");
					System.out.println("Movies Price : 550" );
					System.out.println("---------------------------");
				}
				
				

			}
		}
	}
}

//addMovie,,deleteMovie,,showAllUser.