/**
 * Classe : Client
 * Objectif : Tester une relation BIdirectionnelle 1x1 entre Table et Client
 * @version 1.0
 * @author: Lopisteguy
 * @date : jj/mm/aaaa
 */
public class Client {
///ATTRIBUT
	private String nom="";
	private String telephone="";
	private Table maTable = null;
/// CONSTRUCTEUR
	public Client(String nom, String telephone) {
		this.setNom (nom);
		this.setTelephone(telephone);
	}
/// ENCAPSULATION nom, telephone, maTable
	public void setNom (String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone() {
		return this.telephone;
	}
	public void setMaTable (Table table) {
		this.maTable = table;
	}
	public Table getMaTable() {
		return this.maTable;
	}
/// METHODES USUELLES toString
	public String toString() {
		String resultat;
		resultat = "("+getNom()+" - "+getTelephone()+")";
		if (this.getMaTable() != null)
			 resultat += " <=> ("+this.getMaTable().getNumeroTable()+")";
		return resultat;
	}
/// METHODES SPECIFIQUES delierMaTable, lierMaTable(Table)
	public void delierMaTable () {          // D�lier la relation AVEC r�ciprocit�
	    if (this.getMaTable() != null) {    // Si je suis li�, alors,
	        this.getMaTable().setMonClient(null) ;// il ne doit plus pointer vers moi,
	        this.setMaTable(null);                // et je ne dois plus pointer vers lui.
	    }
	}
	public void lierMaTable(Table table) { // Lier la relation AVEC r�ciprocit�
	    if (table != null) {           // Si mon futur correspondant existe, alors
	        this.delierMaTable();          // me d�lier de mon correspondant actuel,
	        table.delierMonClient ();      // d�lier mon futur correspondant,
	        this.setMaTable(table);        // pointer vers lui,
	        table.setMonClient(this);      // le faire pointer vers moi.
	    }
	}
}