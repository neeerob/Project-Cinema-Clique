import java.lang.*;

public class Movies
{
	String Movie ;
	
	String Comingsoon;
	
	String Showtime;
	
	Movies()
	{}
	
	Movies(String Movie ,String Comingsoon,String Showtime)
	{
		this.Movie = Movie;
		this.Comingsoon = Comingsoon;
		this.Showtime= Showtime;
	}
	public void SetMovie(String Movie)
	{
		Movie = Movie;
	}
	public void SetComingsoon(String Comingsoon)
	{
		Comingsoon = Comingsoon;
	}
	public void SetShowtime(String Showtime)
    {
	   Showtime = Showtime;
    }
     public String getMovie()
	{
		return Movie;
	}
	public String getComingsoon()
	{
		return Comingsoon;
	}
	public String getShowtime()
	{
		return Showtime;
	}
	
	
	
	
}