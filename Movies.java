import java.lang.*;

public class Movies
{
	String movieName ;	
	String director;
	String story;
	String duration;
	String Comingsoon;	
	String Showtime;
	double ticketPrice;
	
	Movies(){}
	
	Movies(String movieName, String director, String story, String duration)
	{
		this.movieName=movieName;
		this.director=director;
		this.story=story;
		this.duration=duration;
	}
	public void SetMovie(String movieName)
	{
		this.movieName = movieName;
	}
	public void SetComingsoon(String Comingsoon)
	{
		this.Comingsoon = Comingsoon;
	}
	public void SetShowtime(String Showtime)
    {
	   this.Showtime = Showtime;
    }
	public void setDirector(String director)
	{
		this.director = director;
	}
	public void setStory(String story)
	{
		this.story=story;
	}
	public void setDuration(String duration)
	{
		this.duration=duration;
	}
	public void setTicketPrice(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
	public String getDirector()
	{
		return director;
	}
	
	public String getStory()
	{
		return story;
	}
	
	public String getDuration()
	{
		return duration;
	}
		
     public String getMovie()
	{
		return movieName;
	}
	public String getComingsoon()
	{
		return Comingsoon;
	}
	public String getShowtime()
	{
		return Showtime;
	}
	
	public double getTicketPrice()
	{
		return ticketPrice;
	}
	
	
}