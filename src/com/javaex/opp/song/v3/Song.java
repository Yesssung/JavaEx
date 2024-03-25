package com.javaex.opp.song.v3;

	// v3. this 생성자 
public class Song {
	

	// this Artist와 Title만 먼저 생성
	public Song(String Title, String Artist) {
		this.Title = Title;
		this.Artist = Artist;
		System.out.println("Artist,  Title 필드 초기화 생성자");
	}
	
	
	// 개발자 작성 모든 필드 생성자
	public Song(String Title, String Artist , int Track, String Album, int Year, String Composer) {
		this(Title, Artist);
		this.Album = Album;
		this.Composer = Composer;
		this.Year = Year;
		this.Track = Track;
		System.out.println("전체 필드 초기화 생성자");
	}
	
	// 필드
	private String Title;
	private String Artist;
	private String Album;
	private String Composer;
	private int Year;
	private int Track;
	
	
	
	// 메소드(getters, setters)
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		Album = album;
	}
	public String getComposer() {
		return Composer;
	}
	public void setComposer(String composer) {
		Composer = composer;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getTrack() {
		return Track;
	}
	public void setTrack(int track) {
		Track = track;
	}

	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d 번 track, %s 작곡)%n", Artist, Title, Album, Year, Track, Composer );
	}
}
