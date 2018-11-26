
public class MovieDetails {

	String MovieName;
	String lead_Actor;
	String lead_Actories;
	
	public MovieDetails(String MovieName,String Actor,String Actress) {
		this.MovieName=MovieName;
		this.lead_Actor=Actor;
		this.lead_Actories=Actress;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getActor() {
		return lead_Actor;
	}

	public void setActor(String actor) {
		lead_Actor = actor;
	}

	public String getActress() {
		return lead_Actories;
	}

	public void setActress(String actress) {
		lead_Actories = actress;
	}
	
}
