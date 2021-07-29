//Segunda atualização de teste
package com.dio;

import com.dio.model.Gato;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);	
	}
}

class Livro{
	private String nome;
	private String npag;
}
