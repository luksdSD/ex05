package exercicio05;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		for (int i = 0; i <= 5; i++) {
			switch (i) {
			case 1:
				System.out.println("Primeira Condição");
				break;
			case 4:
				System.out.println("Segundo caso");
				break;
			default:
				System.out.println("Nem uma condição encontrada");
				break;
			}
		}

	}

}
