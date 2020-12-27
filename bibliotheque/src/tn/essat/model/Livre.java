package tn.essat.model;


public class Livre {
	
	private int id;
		private String titre;
	private int qte;


public Livre(int id, String titre, int qte) {
	super();
	this.id = id;
	this.titre = titre;
	this.qte = qte;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}



}
