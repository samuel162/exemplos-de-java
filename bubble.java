""import java.util.Random;
public class bubble{
	public static void main(String[] args)
	{
		int vetor[] = new int[10];
		Random al = new Random();
		for (int i = 0; i < vetor.length; i++){
			vetor [i] = al.nextInt(44);
		}
		for (int i = 0; i < vetor.length; i++){
			for (int j = 0; j < vetor.length; j++){
				if (vetor [i] < vetor[j]){
					int aux = vetor [i];
					vetor [i] = vetor [j];
					vetor [j] = aux;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++){
			System.out.print(vetor [i] +"\t");
		}
	}
}
