
package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioneAuto extends Auto {
	private String nomeFile;
	Scanner scannerLine = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	
	public void aggiungiAuto(List<Auto> listaAuto) {
		Auto auto = new Auto();
		
		System.out.println("Inserisci i dati per la nuova auto: ");
		
		System.out.println("inserisci id: ");
		int id = scannerInt.nextInt();
		
		System.out.println("inserisci marca: ");
		String marca = scannerLine.nextLine();
		
		System.out.println("inserisci modello: ");
		String modello= scannerLine.nextLine();
		
		System.out.println("inserisci anno: ");
		int anno = scannerInt.nextInt();
		
		System.out.println("inserisci targa: ");
		String targa = scannerLine.nextLine();
		
		System.out.println("inserisci prezzo: ");
		double prezzo = scannerInt.nextDouble();
		
		System.out.println("inserisci tipo di carburante: ");
		String tipoCarburante = scannerLine.nextLine();
		
		auto.setId(id);
		auto.setMarca(marca);
		auto.setModello(modello);
		auto.setAnno(anno);
		auto.setTarga(targa);
		auto.setPrezzo(prezzo);
		auto.setTipoCarburante(tipoCarburante);
		
		listaAuto.add(auto);
		
	}
	public void modificaAuto(List<Auto>listaAuto) {
		Auto auto =cercaAutoPerTarga(listaAuto);
		System.out.println("Inserisci i dati per modificare l'auto: ");
		
		System.out.println("modifica id: ");
		int id = scannerInt.nextInt();
		
		System.out.println("modifica marca: ");
		String marca = scannerLine.nextLine();
		
		System.out.println("modifica modello: ");
		String modello= scannerLine.nextLine();
		
		System.out.println("modifica anno: ");
		int anno = scannerInt.nextInt();
		
		System.out.println("modifica targa: ");
		String targa = scannerLine.nextLine();
		
		System.out.println("modifica prezzo: ");
		double prezzo = scannerInt.nextDouble();
		
		System.out.println("modifica tipo di carburante: ");
		String tipoCarburante = scannerLine.nextLine();
		
		auto.setId(id);
		auto.setMarca(marca);
		auto.setModello(modello);
		auto.setAnno(anno);
		auto.setTarga(targa);
		auto.setPrezzo(prezzo);
		auto.setTipoCarburante(tipoCarburante);
		
		//listaAuto.set(id, auto);
		
	}
	public void eliminaAuto(List<Auto> listaAuto) {
		System.out.println("Inserisci id dell'auto da eliminare: ");
		System.out.println("id: ");
		int id = scannerInt.nextInt();
		
		for(Auto auto:listaAuto) {
			if(auto.getId() == id) {
				listaAuto.remove(auto);
			}
		}
		
	}
	public void visualizzaAuto(List<Auto> listaAuto) {
		System.out.println(listaAuto);
	}
	public Auto cercaAutoPerTarga(List<Auto> listaAuto) {
		System.out.println("cerca per auto per targa ");
		System.out.println("Inserisci targa: ");
		String targa = scannerLine.nextLine();
		
		// fare un check della targa nella listaAuto
		// se corrisponde esce risultato
		//altrimenti veicolo non esiste
		boolean targaUguale = false;
		for(Auto auto : listaAuto) {
			if(targa.equals(auto.getTarga()) ) {
				targaUguale = true;
				// recuperare dati del veicolo corrispondente
				System.out.println("veicolo trovato: ");
				//stampa i dati del veicolo corrispondente 
				System.out.println(auto.toString());
				return auto;
			}
		}
		System.out.println("targa non trovata.");
		return null; 

	}
	
	
	public List<Auto> cercaAutoPerAnno(List<Auto> listaAuto) {
		System.out.println("Inserisci anno che ti interessa");
		List<Auto> autoPerAnno = new ArrayList<Auto>();
		int anno = scannerInt.nextInt();
		for(Auto auto:listaAuto) {
			if(auto.getAnno() == anno) {
				autoPerAnno.add(auto);
			}
		}
		return autoPerAnno;
		
	}
	
	public void leggiDaFile() {
		
	}
	public void scriviSuFile() {
		
	}
}
