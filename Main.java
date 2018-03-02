import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        OperacoesNumeros operacao = new OperacoesNumeros();
        
        Scanner input = new Scanner(System.in);
        int rep = 0;
        while(rep==0){
        System.out.println("1:Descobrir se número é positivo ou negativo\n2-Soma dos números entre dois inteiros\n3-Soma de numeros entre dois inteiros divisiveis por x\n4-Segundos para horas/minutos/segundos\n5-Sair");
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                
            System.out.println("Digite o número");
            int a = input.nextInt();
            operacao.numeroPositivo(a);
            break;
            
            case 2:
                
            System.out.println("Digite o primeiro inteiro");
            int int1 = input.nextInt();
            System.out.println("Digite o segundo inteiro");
            int int2 = input.nextInt();
            System.out.println(operacao.somaInteiros(int1, int2));
            break;
            
            case 3:
                
            System.out.println("Digite o divisor");
            int divisor = input.nextInt();
            System.out.println("Digite o primeiro inteiro");
            int int3 = input.nextInt();
            System.out.println("Digite o segundo inteiro");
            int int4 = input.nextInt();
            System.out.println(operacao.somaInteirosDivisao(divisor, int3, int4));
            break;
            
            case 4:
                System.out.println("Digite os segundos");
            int segundos = input.nextInt();
            operacao.tempo(segundos);
            break;
            default:
            rep = 1;
        }	 	  	  		   	      	     	  	     	    	 	
        }
    }
}