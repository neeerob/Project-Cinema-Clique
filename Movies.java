import java.lang.*;

public class Movies
{
	String Movie ;
	
	String Comingsoon;
	
	Movies()
	{}
	
	Movies(String Movie ,String Comingsoon)
	{
		this.Movie = Movie;
		
		this.Comingsoon = Comingsoon;
	}
	public void setMovie(String Movie)
	{
		Movie = Movie;
	}
	public void setComingsoon(String Comingsoon)
	{
		Comingsoon = Comingsoon;
	}
	
	public String getMovie()
	{
		return Movie;
	}
	public String getComingsoon()
	{
		return Comingsoon;
	}
	
	
	
}