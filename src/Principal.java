import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * 
 * @author edveloso
 *
 */
public class Principal {

	
	//visibilidade retorno nome    litaParametros
	
	//4 visibilidades
	//public private protected default
	public Principal() {
		System.out.println("Este é o contrutor padrão");
	}
	
	//sobrecarga
	public Principal(String nome){
		System.out.println("meu nome é " + nome);
	}
	
	
	//ponto de entrada de todo programa java
	//a Jvm vai carregar este método da classe primeiro
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		/*
		 * Qualquer programa pode ser escrito usando estas três estruturas
		 * básicas:
		 * Sequência (comando, atribuição, tipos)
		 * Seleção ou decisão (if, switch)
		 * Iteração ou laço (for, while, do while)
		 * 
		 * tipo {
		 *    fortemente tipado
		 *    estaticamente tipado
		 * }
		 * 
		 * Lógica
		 * Paradigma
		 * Sintaxe
		 */
		//Tipos
		// primitivo (atribui literais)
		    //  8 
			// boolean short byte char int float double long 	 
		// referencia (objeto - metodos e atributos)
		//  Classes do blioteca java
		// Classes de bibliotecas de terceiros
		// Classes criadas por você
		
		//debug - porque mostra o valor do construtor?
		
//		boolean b = false; //2 bytes
//		short s = 200; //2 bytes
//		char ch = 'd'; // 2 bytes
//		int x = 10; // 4 bytes
//		long longa =  26; // 8 bytes
//		byte baite = -128;
//		
//		double d = 50; // 4 bytes pf
//		float f = 55; // 8 bytes pf
//		
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE);
//		
//		int nova = (int) longa;
//		
//		String nome;
//		nome = "serverino";
//		new String("");
//		
//		Principal principal = new Principal();
//		
//		System.out.println(principal);
//		
		List<String> aLista = new ArrayList<String>();
		aLista.add("abc");
		aLista.add("cde");
		aLista.add("jos");
		
		List<String> bLista = new ArrayList<String>();
		bLista.add("abcs");
		aLista.add("cde");
		aLista.add("jos");
		
		System.out.println(aLista.containsAll(bLista));
		List<String> lista2;
		System.out.println( 22 >> 2);
		//10000
				
	}
	
}
