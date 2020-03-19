package calc;

public class CalculatriceTableau {

	public static int sommeElements(int[] tabInt) {
		for (int i = 1; i < tabInt.length; i++) {
			tabInt[0] += tabInt[i];
		}
		return tabInt[0];
	}

	public static int plusPetitElement(int[] tabInt) {
		for (int i = 1; i < tabInt.length; i++) {
			if (tabInt[0] > tabInt[i]) {
				tabInt[0] = tabInt[i];
			}
		}

		return tabInt[0];
	}

	public static int sommeElementsDeuxTableaux(int[] tabInt, int[] tabInt2) {
		for (int i = 1; i < tabInt.length; i++) {
			tabInt[0] += tabInt[i];
		}
		for (int i = 1; i < tabInt2.length; i++) {
			tabInt2[0] += tabInt[i];
		}
		return tabInt[0] + tabInt2[0];

	}

	public static int[] triAscendant(int[] tabInt) {
		int longueur = tabInt.length;
		int valMin = 0;
		boolean permut;
		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (tabInt[i] > tabInt[i + 1]) {
					valMin = tabInt[i];
					tabInt[i] = tabInt[i + 1];
					tabInt[i + 1] = valMin;
					permut = true;
				}
			}
		} while (permut);
		return tabInt;
	}

	public static int[] descendant(int tabInt[]) {
		int longueur = tabInt.length;
		int valMax = 0;
		boolean permut;
		do {
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				if (tabInt[i] < tabInt[i + 1]) {
					valMax = tabInt[i];
					tabInt[i] = tabInt[i + 1];
					tabInt[i + 1] = valMax;
					permut = true;
				}
			}
		} while (permut);
		return tabInt;
	}

	public static boolean conjonction(boolean[] a) {
		boolean b = true;
		for (int i = 0; b && i < a.length; i++) {
			b &= a[i];
		}
		return b;
	}

	public static boolean conjonction2(boolean[] a) {
		int i = 0;
		while (i != a.length - 1) {
			i++;
			if (!a[i]) {
				return a[i];
			}
		}
		return a[i];
	}

	public static long nombreDElementsPair(int[] a) {
		int compte = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				compte++;
			}
		}
		return compte;
	}

	public static int[] triAscendantDeuxTableaux(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int compteur = 0;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			compteur++;
		}
		for (int i = 0; i < b.length; i++) {
			c[compteur] = b[i];
			compteur++;
		}
		;
		return triAscendant(c);

	}

//	public static int[] triAscendantDeuxTableaux2(int[] a, int[] b) {
//		int[] c = new int[a.length + b.length];
//		for (int i = 0; i < a.length || i < b.length; i++) {
//			if (i < a.length) {
//				c[i] = a[i];
//				c[i+a.length] = b[i];
//			} else {
//				c[i-a.length] = b[i];
//			}
//		}
//
//		return triAscendant(c);
//	}

	public static boolean chercheSiUnElementExiste(int param, int[] tab) {
		boolean existe = false;
		for (int i = 0; i < tab.length && existe != true; i++) {
			if (tab[i] == param) {
				existe = true;
			}
		}
		return existe;
	}

	public static int[] mettreZeroDansLesCasesAIndicesImpair(int[] tab) {
		for (int i = 1; i < tab.length; i += 2) {
			tab[i] = 0;
		}
		return tab;
	}

	public static int[] decalerLesElementsTableauDUneCase(int[] tab) {
		int tampo = tab[tab.length - 1];
		for (int i = tab.length - 1; i > 0; i--) {
			tab[i] = tab[i - 1];
		}
		tab[0] = tampo;

		return tab;

	}
	
}
