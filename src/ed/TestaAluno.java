package ed;

import java.util.ArrayList;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Gabriel");
		Aluno a2 = new Aluno("Alice");
		
		Vetor lista = new Vetor();
		
			System.out.println(lista.tamanho());
		lista.adiciona(a1);
			System.out.println(lista.tamanho());
		lista.adiciona(a2);
			System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.pega(1));
		
		Aluno a3 = new Aluno("Fernando");
		lista.adiciona(1, a3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
	}

}
