package tools;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import calc.Calculatrice;

public class MotsUtils {
	public static String inverser(String a) {
		String test = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			test += a.charAt(i);
		}
		return test;
	}

	public static String caracteresCommuns(String str, String str2) {
		String retour = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str.charAt(i) == str2.charAt(j) && retour.indexOf(str2.charAt(j)) == -1) {
					retour += str2.charAt(j) + ",";

				}
			}
		}
		return retour;

	}

	public static boolean estUnPalindrome(String str) {

		return str.equals(inverser(str));
	}

	public static long sommeChiffresDansMot(String str) {

		int somme = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				somme += Character.getNumericValue(str.charAt(i));
			}

		}
		return somme;

	}

	public static String devinerAlgo(int a) {

		return Integer.toString(a * 2) + Integer.toString(a - 1);

	}

	public static int binaireInverse(String str) {
		int tampo = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (Character.getNumericValue(str.charAt(i)) == 1) {
					tampo = (tampo * 2) + 1;
				} else {
					tampo *= 2;
				}
			}
		}
		return tampo;

	}

	public static long sommeUnicodes(String str) {
		long somme = 0;
		for (int i = 0; i < str.length(); i++) {

			somme += str.charAt(i);

		}
		return somme;

	}

	public static String exercice29(int a, int b) {
//		String result = "";
//
//		if (a % 2 == 0) {
//			a += 1;
//		} else {
//			a += 2;
//		}
//		for (int i = b; i > 0; --i) {
//
//			result += a + "*";
//			a = a + 2;
//
//		}
//		return result.replaceAll(".$", "");

		return Stream.iterate((a % 2 == 0) ? a + 1 : a + 2, i -> i + 2).limit(b).map(t -> t.toString())
				.collect(Collectors.joining("*"));

	}

	public static String exercice30(float a) {
		String carac = Float.toString(a);
		int entier = 0;
		int deci = 0;
		int i = 0;
		for (; Character.isDigit(carac.charAt(i)); i++) {
			entier += Character.getNumericValue(carac.charAt(i));
		}
		for (i++; i < carac.length(); i++) {
			deci += Character.getNumericValue(carac.charAt(i));

		}

		return "T" + (entier + deci) + "E" + entier + "D" + deci;
	}

	public static int exercice31(String str) {
		str = str.toLowerCase();
		String somme = "";
		for (int i = 0; i < str.length(); i++) {

			somme += str.charAt(i) - 96;

		}
		return Integer.parseInt(somme);
	}

	public static String alphanumerique(String str) {
		int range = str.length();
		String result = "";
		String compteur = "";
		for (int i = 0; i < range; i++) {
			compteur = "";
			if (!Character.isDigit(str.charAt(i))) {
				result += str.charAt(i);
			} else if (i == range - 1) {
				break;
			} else {
				while (Character.isDigit(str.charAt(i))) {
					compteur += str.charAt(i);
					i++;
				}
				for (int j = Integer.parseInt(compteur); j > 0; --j) {
					result += str.charAt(i);
				}
			}
		}
		return result;
	}

	public static void afficherNombreOccurence(String str) {

		for (int j = 0; j < str.length(); j++) {
			char caract = str.charAt(j);
			int taille = str.length();
			str = str.replaceAll(str.charAt(j) + "", "");
			int taille2 = str.length();
			System.out.println(caract + " : " + (taille - taille2));

			j = -1;
		}

	}

	public static void afficherNombreOccurence2(String str) {
		if (str.length() != 0) {
			char caract = str.charAt(0);
			int taille = str.length();
			str = str.replaceAll(str.charAt(0) + "", "");
			int taille2 = str.length();
			System.out.println(caract + " ::: " + (taille - taille2));
			afficherNombreOccurence2(str);
		}

	}

	public static String alphanumerique2(String saisie) {

		int taille = saisie.length();
		String count = "";
		String sortie = "";
		while (Character.isDigit(saisie.charAt(taille - 1))) {
			taille -= 1;
		}
		for (int i = 0; i < taille; i++) {
			if (!Character.isDigit(saisie.charAt(i))) {
				sortie += saisie.charAt(i);
			} else {
				while (Character.isDigit(saisie.charAt(i))) {
					i++;
					count += saisie.charAt(i - 1);
				}
				int i1 = Integer.parseInt(count);
				sortie += saisie.charAt(i);
				count = "";
				while (i1 - 1 > 0) {
					sortie += saisie.charAt(i);
					i1--;
				}
			}
		}
		return sortie;
	}
}