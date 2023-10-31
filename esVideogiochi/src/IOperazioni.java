import models.VideoGioco;

public interface IOperazioni {

	public VideoGioco createGioco();
	public void getAll();
	public void addGioco(VideoGioco gioco);
	public void deleteGioco(String nome);
	public void updateGioco();
}
