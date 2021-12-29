package Test;

// �ٹ�����, ���� �̸� ������ �����Ѵ�.
public class CompactDisc extends Product{

	private String albumTitle;	// �ٹ� ����
	private String artist;	// ���� �̸� ����
	
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
		System.out.println("�ٹ� ���� >> " + albumTitle);
		System.out.println("���� >> " + artist + "\n");
	}
}
