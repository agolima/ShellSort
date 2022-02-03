public class Principal {

	public static void main(String[] args) {
		int[] valoresExemplo = { 23, 36, 84, 12, 3, 56, 998, 9, 10, 11 };

		Ordenacao ord = new Ordenacao();
		int[] arrayOrdenado = ord.ShellSort(valoresExemplo);

		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}

	}
}
