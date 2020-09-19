import java.lang.*;

public class Movies
{
	protected String movieName ;	
	protected String director;
	protected String story;
	protected String duration;
	protected String Comingsoon;	
	protected String Showtime;
	protected double ticketPrice;
	protected String dimention;
	protected String time;
	protected String amOrPm;

	
	
	Movies(){}
	
	Movies(String movieName, String director, String story, String duration,String dimention,String time,String amOrPm)
	{
		this.movieName=movieName;
		this.director=director;
		this.story=story;
		this.duration=duration;
		this.dimention = dimention;
		this.time = time;
		this.amOrPm = amOrPm;
		
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
	public void setDimention(String dimention)
	{
		this.dimention = dimention;
	}
	public String getDimention()
	{
		return dimention;
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
	public void setTime()
	{
		this.time = time;
	}
	public String getTime()
	{
		return time;
	}
	public void setAmOrPm()
	{
		this.amOrPm = amOrPm;
	}
	public String getAmOrPm()
	{
		return amOrPm;
	}

	public void showMovies()
	{
		System.out.println("Movie name : " + movieName);
		System.out.println("Movie duration : " + duration);
		System.out.println("Movie director name : " + director);

		System.out.println("-----------------------------");
	}

	
}