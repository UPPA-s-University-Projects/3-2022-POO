import java.io.Console;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomPlats[] = { "Ananas", "Pizza", "Poulet basquaies", "Brownie", "Riz Pilaf", };

		// On affiche la liste des plats
		for (String plat : nomPlats) {
			System.out.println(plat);
		}

		System.out.println("---");
		// Affichages du tableau tri� (deux fa�ons diff�rentes)
		trierAfficherArrays(nomPlats);
		tri_bulle(nomPlats);
	}

	// Utilisation de java.util.Arrays pour trier "automatiquement"
	public static void trierAfficherArrays(String[] nomPlats) {
		// On trie le tableau
		Arrays.sort(nomPlats);

		// On affiche la liste des plats (triee)
		for (String plat : nomPlats) {
			System.out.println(plat);
		}
	}

	public static void tri_bulle(String[] tab) {
		int taille = tab.length;
		String tmp;
		for (int i = 0; i < taille; i++) {
			for (int j = 1; j < (taille - i); j++) {
				if(tab[j].compareTo(tab[i]) > 0) {
					// echanges des elements
					tmp = tab[j - 1];
					tab[j - 1] = tab[j];
					tab[j] = tmp;
				}

			}
		}
	}

}
