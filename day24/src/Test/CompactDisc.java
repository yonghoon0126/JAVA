package Test;

// 앨범제목, 가수 이름 정보를 포함한다.
public class CompactDisc extends Product{

	private String albumTitle;	// 앨범 제목
	private String artist;	// 가수 이름 정보
	
	public CompactDisc(int productId, String description, 
			String maker, int price, String albumTitle, String artist) {
		super(productId, description, maker, price);
	
		this.albumTitle = albumTitle;
		this.artist = artist;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void showInfo() {

		super.showInfo();
		System.out.println("앨범 제목 >> " + albumTitle);
		System.out.println("가수 >> " + artist + "\n");
	}
}
