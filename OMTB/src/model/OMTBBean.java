package model;
public class OMTBBean {
	private int cityId,
				movieId,
				theaterId,
				numberOfSeats;
	private String cityName, 
				   movieName,
				   theaterName,
				   theaterAddress,
				   posterLink,
				   castImage1,castImage2,castImage3,castImage4,castImage5,
				   cast1,cast2,cast3,cast4,cast5,
				   movieStartDate,
				   movieEndDate,
				   showTime;
	public String getMovieStartDate() {
		return movieStartDate;
	}
	public void setMovieStartDate(String movieStartDate) {
		this.movieStartDate = movieStartDate;
	}
	public String getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(String movieEndDate) {
		this.movieEndDate = movieEndDate;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getPosterLink() {
		return posterLink;
	}
	public void setPosterLink(String posterLink) {
		this.posterLink = posterLink;
	}
	public String getCastImage1() {
		return castImage1;
	}
	public void setCastImage1(String castImage1) {
		this.castImage1 = castImage1;
	}
	public String getCastImage2() {
		return castImage2;
	}
	public void setCastImage2(String castImage2) {
		this.castImage2 = castImage2;
	}
	public String getCastImage3() {
		return castImage3;
	}
	public void setCastImage3(String castImage3) {
		this.castImage3 = castImage3;
	}
	public String getCastImage4() {
		return castImage4;
	}
	public void setCastImage4(String castImage4) {
		this.castImage4 = castImage4;
	}
	public String getCastImage5() {
		return castImage5;
	}
	public void setCastImage5(String castImage5) {
		this.castImage5 = castImage5;
	}
	public String getCast1() {
		return cast1;
	}
	public void setCast1(String cast1) {
		this.cast1 = cast1;
	}
	public String getCast2() {
		return cast2;
	}
	public void setCast2(String cast2) {
		this.cast2 = cast2;
	}
	public String getCast3() {
		return cast3;
	}
	public void setCast3(String cas3) {
		this.cast3 = cas3;
	}
	public String getCast4() {
		return cast4;
	}
	public void setCast4(String cast4) {
		this.cast4 = cast4;
	}
	public String getCast5() {
		return cast5;
	}
	public void setCast5(String cast5) {
		this.cast5 = cast5;
	}
	private float fare;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterAddress() {
		return theaterAddress;
	}
	public void setTheaterAddress(String theaterAddress) {
		this.theaterAddress = theaterAddress;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
}