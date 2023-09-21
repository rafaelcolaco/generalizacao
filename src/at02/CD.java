package at02;

public class CD extends Midia {

	public CD(int codigo, String descricao, String gravadora, float duracao,int faixa, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixa(faixa);
		setArtista(artista);
		setAlbum(album);
	}
	
	private int faixa;
	private String artista;
	private String album;
	
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	

}
