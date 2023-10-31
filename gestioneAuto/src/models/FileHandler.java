package models;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;

public class FileHandler {
	private static String nomeFile = "macchine.txt";
	private List<Auto> auto = new ArrayList<>();
	
	public FileHandler(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	
	
	//riceve in input una lista di auto e ne scrive i dettagli sul file di testo
    public static void scriviSuFile(List<Auto> macchine, Boolean append) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile, append))) {
        for(Auto auto : macchine) {
            writer.write(auto.mostraDettagli());
            writer.newLine();
        }

    } catch (IOException e) {
        e.printStackTrace();
        }
    }
	
	public static List<Auto> leggiDaFile() {
        List<Auto> auto = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(nomeFile))){
            String riga;
            while((riga = reader.readLine()) != null) {
            String[] parti = riga.split(",");
            if(parti.length == 7) {
                riga = reader.readLine();
                int id = Integer.parseInt(parti[0]);
                String marca = parti[1];
                String modello = parti[2];
                int anno = Integer.parseInt(parti[3]);
                String targa = parti[4];
                double prezzo = Double.parseDouble(parti[5]);
                String tipoCarburante = parti[6];
                Auto newAuto = new Auto(id,marca,modello,anno,targa,prezzo,tipoCarburante);
                auto.add(newAuto);
            }
            System.out.println("Non ho piu` niente da leggere all'interno del file.");
        }
            //Se i parametri di parti non sono esattamente 7
            System.out.println("Numero parametri non corretto, devono essere 7!");
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return auto;
    }
	/*
	public static List<Auto> leggiDaFile() {
		List<Auto> auto = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(nomeFile))){
			String[] riga riga.split(",");
			while((riga = reader.readLine()) != null) {
				riga = reader.readLine();
				riga.split(",");
				String id = riga;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	*/
}