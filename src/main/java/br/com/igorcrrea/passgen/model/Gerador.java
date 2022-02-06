package br.com.igorcrrea.passgen.model;

import java.util.Random;

public class Gerador {

	final static String maiusculo="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String minusculo="abcdefghijklmnopqrstuvwxyz";
	final static String numeros="0123456789";
	final static String simbolos="!@#$%&*_=+-/?";
	
	public static String gerar(String chave, Integer tamanhoSenha) {
		Integer seed = getChave(chave);
		return calcula(seed,tamanhoSenha);
	}

	public static String calcula(Integer seed, Integer tamanhoSenha) {
		String valores= values();
		Integer valRandom = seed+tamanhoSenha;
		Random rnd = new Random(valRandom);
		char[] senha = new char[tamanhoSenha];
		
		for(int i = 0; i<tamanhoSenha;i++) {
			senha[i]= valores.charAt(rnd.nextInt(valores.length()));
		}
		if(verificaRequisitos(String.valueOf(senha))) {
			return String.valueOf(senha);
		}
		return calcula(valRandom, tamanhoSenha);
	}
	
	private static Integer getChave(String entrada) {
		int chave =0;
		char caractere[] = new char[entrada.length()];

		for (int i = 0; i < entrada.length(); i++) {
			chave += caractere[i] = entrada.charAt(i);
		}
		return chave;
	}
	
	private static final String values(){
		
		final String values= maiusculo+minusculo+numeros+simbolos;
		
		return values;
	}
	
	private static boolean verificaRequisitos(String senha) {
		
		boolean temNum = false, temMai = false, temMin = false, temSim= false;
		
		for(int i = 0; i < senha.length();i++) {
			String caractere = Character.toString(senha.charAt(i));
			if(maiusculo.contains(caractere)&& temMai ==false) temMai = true ;
			if(minusculo.contains(caractere)&& temMin ==false) temMin = true ;
			if(numeros.contains(caractere)&& temNum ==false) temNum = true ;
			if(simbolos.contains(caractere)&& temSim ==false) temSim = true ;
		}
		if(temMai == true && temMin == true && temNum == true && temSim == true) {
			return true;
		}
		return false;
	}
	
}
