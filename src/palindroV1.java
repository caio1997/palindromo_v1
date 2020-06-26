import java.util.Arrays;
import java.util.Scanner;

//Desenvolvido por Caio Marinho Coelho
public class palindroV1 {

	public static void main(String[] args) {
		
		System.out.println("-------------- DESAFIO 01 --------------");
		System.out.println();
		System.out.println("--------- PALAVRAS PAL�NDROMOS ---------");
		System.out.println();
		
		//Declara��o das variaveis de input do usu�rio
		String p1, p2;
		
		//Declara��o do Scanner para input do usu�rio
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a palavra/string desejada: ");
		
		//Foram utilizadar as fun��es TRIM para remover espa�os antes, TOUPPERCASE para colocar tudo em mai�sculo e REPLACEALL para remover os espa�os entre as strings
		p1 = in.nextLine().trim().toUpperCase().replaceAll(" ", "").replaceAll("-","").replace(",", "").replaceAll("!","").replaceAll(":", "");
		
		//p2 ir� receber o valor de p1 para que mais na frente vire outro vetor
		p2 = p1;
		
		System.out.println();
		
		
		//Contar os tamanhos da string
		Integer l1 = p1.length();
		
		//Criar os vetores que ser�o utilizados mais a frente no c�digo
		char[] chP1 = new char[l1];
		char[] chP2 = new char[l1];
		
		
		//Ir� percorrer a string p1 e gravar em um vetor (chP1)
		for(int i = 0; i < l1; i++ ){
			chP1[i] = (p1.charAt(i));
			
		}
		//Vari�vel cont criada para incrementar os posi��es da string
		int cont = 0;
		//Ir� percorrer a o vetor de tras pra frente salvando a string na ordem dela, fazendo com que salve ao contr�rio
		for(int i = l1 - 1; i >= 0; i--){
			chP2[i] = (p2.charAt(cont));
			cont++;
		}
			
		//Transformando os vetores para String novamente
		String forString1 = Arrays.toString(chP1);
		String forString2 =Arrays.toString(chP2);
			
		
		//Ir� verificar se a primeira string � igual a segunda, caso sej� elas ser�o padrindromas
		if(forString1.equals(forString2)) {
			System.out.println("A palavra " + p1 + " � pal�ndromo");
		}else {
			System.out.println("A palavra "+ p1 + " n�o � pal�ndromo");
		}
	}
}
