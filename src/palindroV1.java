import java.util.Arrays;
import java.util.Scanner;

//Desenvolvido por Caio Marinho Coelho
public class palindroV1 {

	public static void main(String[] args) {
		
		System.out.println("-------------- DESAFIO 01 --------------");
		System.out.println();
		System.out.println("--------- PALAVRAS PALÍNDROMOS ---------");
		System.out.println();
		
		//Declaração das variaveis de input do usuário
		String p1, p2;
		
		//Declaração do Scanner para input do usuário
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a palavra/string desejada: ");
		
		//Foram utilizadar as funções TRIM para remover espaços antes, TOUPPERCASE para colocar tudo em maiúsculo e REPLACEALL para remover os espaços entre as strings
		p1 = in.nextLine().trim().toUpperCase().replaceAll(" ", "").replaceAll("-","").replace(",", "").replaceAll("!","").replaceAll(":", "");
		
		//p2 irá receber o valor de p1 para que mais na frente vire outro vetor
		p2 = p1;
		
		System.out.println();
		
		
		//Contar os tamanhos da string
		Integer l1 = p1.length();
		
		//Criar os vetores que serão utilizados mais a frente no código
		char[] chP1 = new char[l1];
		char[] chP2 = new char[l1];
		
		
		//Irá percorrer a string p1 e gravar em um vetor (chP1)
		for(int i = 0; i < l1; i++ ){
			chP1[i] = (p1.charAt(i));
			
		}
		//Variável cont criada para incrementar os posições da string
		int cont = 0;
		//Irá percorrer a o vetor de tras pra frente salvando a string na ordem dela, fazendo com que salve ao contrário
		for(int i = l1 - 1; i >= 0; i--){
			chP2[i] = (p2.charAt(cont));
			cont++;
		}
			
		//Transformando os vetores para String novamente
		String forString1 = Arrays.toString(chP1);
		String forString2 =Arrays.toString(chP2);
			
		
		//Irá verificar se a primeira string é igual a segunda, caso sejá elas serão padrindromas
		if(forString1.equals(forString2)) {
			System.out.println("A palavra " + p1 + " é palíndromo");
		}else {
			System.out.println("A palavra "+ p1 + " não é palíndromo");
		}
	}
}
