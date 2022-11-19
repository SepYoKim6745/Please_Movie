package Please_Movie;

public class Movie {
	private String title;    //영화 제목  
	private String imageUrl; //영화 포스터 url
	private String[] actor;    //배우 
	private String director; //감독 
	private String stroy;    //줄거리  
	private String genre;    //장르  
	private String review; //클래스 다이어그램과 다르게 String으로 수정
	private int rate;        //평점  
	private int minAge;     //연령제한 
	private int ranking;   //  순위  
	private int runningTime; //영화시간  
	
	public void setMovieInfo(String title, String imageUrl, String story, String genre, int runningTime) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.stroy = story;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public void setMoviePeople(String[] actor, String director) {
		this.actor = actor; //이거 모르겠네
		this.director = director;
		
		
	}
	
}