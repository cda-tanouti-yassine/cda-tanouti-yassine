package calc;

import java.util.Random;

public class Calculatrice {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int soustraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int max(int a, int b) {
		if (a < b) {
			return b;
		} else
			return a;
	}

	public static char signe(int a) {
		char b = '-';
		char c = '+';
		if (a < 0) {
			return b;
		} else {
			return c;
		}
	}

	public static long factorielle(int a) {// iteration
		int b = 1;
		int c = 1;
		if (a != 0) {
			while (c < a + 1) {
				b *= c;
				c++;
			}
		}

		return b;
	}

	public static long factorielle2(int a) { // récursivité
		long n = 1;
		if (a != 0) {
			return a * factorielle2(a - 1);
		}
		return n;
	}

	public static boolean conjonction(boolean a, boolean b) {
		return a && b;
	}

	public static boolean disjonction(boolean a, boolean b) {
		return a || b;
	}

	public static boolean negation(boolean a) {
		return !a;
	}

	public static int aleatoireInferieur(int str) {
		return new Random().nextInt(str);

	}
}
