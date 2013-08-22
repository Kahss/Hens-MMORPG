package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TestXStream {

	public TestXStream(){
		
	}
	public void CreateChar(String Name){
	try {
		XStream xstream = new XStream ( new DomDriver());
		// Test de création d'un perso de test pour la sérialisation
		Personnage perso = new Personnage(
			Name,
			100,
			100,
			100,
			100,
			100,
			100,
			100,
			100,
			100, // j'étais inspiré pour les valeurs
			100,
			100);
		
		// La variable initialPath est à modifié en fonction de l'endroit d'où l'on veut lancer la class
		// elle contient le chemin de Tests depuis la racine du système de fichier.
		// TODO : trouver un moyen de récupérer le répertoire initial, ici /home/dmaurel par exemple
		// TODO pour encore plus tard : récupérer le répertoire d'installation.
		
		String initialPath = "/Characters/";
		String path = initialPath.concat(perso.getNomPerso()).concat(".xml");
		System.out.println(path);
		File fichier = new File (path);
	    FileOutputStream fos = new FileOutputStream(fichier);
			try {
				xstream.toXML(perso, fos);
			    } finally {
				fos.close();
			    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException ioe) {
		    ioe.printStackTrace();
		}
	}
}
