import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosExcepion exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExcepion {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosExcepion();
            
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem~
        for (int i = 0; i < contagem; i++) 
        System.out.println(i);


	}
}
    
    
