package esVideogiochi;
import models.VideoGioco;

public interface IOperazioni {

	public VideoGioco createGioco(String nome, String genere);
	public void getAll();
	public void addGioco(VideoGioco gioco);
	public void deleteGioco(String nome);
	public void updateGioco(VideoGioco gioco, String nome, String genere);
}
