package Please_Movie;

import java.util.Vector;

public class Movie {
	private String title;    //영화 제목  
	private String imageUrl; //영화 포스터 url
	private String[] actor;    //배우 
	private String director; //감독 
	private String story;    //줄거리  
	private String genre;    //장르  
	private Vector<String> review = new Vector<String>(); //클래스 다이어그램과 다르게 String으로 수정
	private int rate;        //평점  
	private int minAge;     //연령제한 
	private int ranking;   //  순위  
	private int runningTime; //영화시간  
	
	public void setMovieInfo(String title, String imageUrl, String story, String genre, int runningTime) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.story = story;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public void setMoviePeople(String[] actor, String director) {
		this.actor = actor; //이거 모르겠네
		this.director = director;
	}
	
	public void setMovieEvaluation(Vector<String> review, int rate, int ranking) {
		this.review = review;
		this.rate = rate;
		this.ranking = ranking;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImage() {
		return imageUrl;
	}
	
	public int getRanking() {
		return ranking;
	}
	
	public int getRuntime() {
		return runningTime;
	}
	
	public String[] getActor() {
		return actor; //이거 수정해야함
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getStory() {
		return story;
	}
	
	public Vector<String> getReview(){
		return review;
	}
	
	public int getRate() {
		return rate;
	}
	
	public int getMinAge() {
		return minAge;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Vector<String> setReview(String content){ //리뷰 작성시 벡터에 저장하는 함수
		review.add(content);
		return review;
	}
	
	
	
	
}