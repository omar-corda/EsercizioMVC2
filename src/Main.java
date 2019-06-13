import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int chooser = 0;
		Scanner myScanf = new Scanner(System.in);

		while (chooser != 6) {

			System.out.println("Benvenuto nel registratore di cassa");
			System.out.println("1. registra un acquisto");
			System.out.println("2. verifica scorte");
			System.out.println("3. lista ingredienti di un gusto");
			System.out.println("4. incasso della giornata");
			System.out.println("5. gusto del giorno");
			System.out.println("6. esci");

			chooser = myScanf.nextInt();
			myScanf.nextLine();

			switch (chooser) {
			case 1: {
				System.out.println("Inserire il numero di gusti(1,2,3) 4 per annullare:");

				int gustiChoose = 0;
				gustiChoose = myScanf.nextInt();
				myScanf.nextLine();

				switch (gustiChoose) {
				case 1: {
					System.out.println("Inserisci il codice relativo al gusto scelto");
					System.out.println(""); // stamperemo la lista
					// qui inseriamo lo scanno
				}
				case 2: {
					System.out.println("Inserisci il codice relativo al primo gusto scelto");
					System.out.println(""); // stamperemo la lista
					// qui inseriamo lo scanno

					System.out.println("Inserisci il codice relativo al secondo gusto scelto");
					// qui inseriamo lo scanno

				}
				case 3: {
					System.out.println("Inserisci il codice relativo al primo gusto scelto");
					System.out.println(""); // stamperemo la lista
					// qui inseriamo lo scanno

					System.out.println("Inserisci il codice relativo al secondo gusto scelto");
					// qui inseriamo lo scanno

					System.out.println("Inserisci il codice relativo al terzo gusto scelto");
					// qui inseriamo lo scanno

				}
				case 4: {
					System.out.println("Ritorna al menu principale");
				}
				default: {
					System.out.println("Riprova");
				}
				}

			}

			case 2: {
				System.out.println("Inserisci il codice del prodotto da verificare");
				System.out.println();// stampiamo la lista
				// inseriamo lo scannnnnno
			}

			case 3: {
				System.out.println("Inserisci il codice del prodotto da verificare");
				System.out.println();// stampiamo la lista
				// inseriamo lo scannnnnno
			}

			case 4: {
				System.out.println("L'incasso della giornata è: ");// concatenare con incasso

			}

			case 5: {
				System.out.println("Il gusto del giorno è: ");// concatenare con nome gusto
			}

			case 6: {
				System.out.println("Uscita dal programma in corso. . .");
			}

			default: {
				System.out.println("Riprova");
			}

			}

		}
	}
}
