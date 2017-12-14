package ed;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	int totalAlunos = 0;
	
	public void garanteEspaco(){
		if ( totalAlunos == alunos.length ){
			Aluno[] novoArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}

	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalAlunos;
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalAlunos;
	}

	// Aqui colocamos o Aluno na próxima posição vazia.
	public void adiciona(Aluno aluno) {
		
		garanteEspaco();
		
		this.alunos[totalAlunos] = aluno;
		totalAlunos++;

	}

	// Aqui colocamos o Aluno em qualquer posição do array.
	public void adiciona(int posicao, Aluno aluno) {
		
		garanteEspaco();
		
		if (!posicaoValida(posicao)) throw new IllegalArgumentException("Poição Inválida!");
		for (int i = posicao; i < totalAlunos; i++) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição inválida!");
		return alunos[posicao];

	}

	public void remove(int posicao) {
		
		if (!posicaoValida(posicao)) throw new IllegalArgumentException("Poição Inválida!");
		
		for (int i = posicao; i < totalAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		
		totalAlunos--;
	}

	public boolean contem(Aluno aluno) {
		// Coloquei totalAlunos pois vou percorrer apenas até a posição que sei
		// que tem aluno.
		for (int i = 0; i < totalAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}

		return false;
	}

	public int tamanho() {
		return totalAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}

}
