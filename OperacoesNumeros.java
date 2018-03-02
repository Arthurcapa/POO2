public class OperacoesNumeros {
    
void numeroPositivo(int n) {
    
    if (n<0) {
        System.out.println("0");
    } else {
        System.out.println("1");
    }
    
}

int somaInteiros(int a, int b) {
    int soma = 0;
    if (a>b) {
        while(a!=b) {
            a=a-1;
            soma=soma+a;
        } 
    }
    
    if (b>a) {
        while(b!=a) {
            b=b-1;
            soma=soma+b;
        } 
    }
    return soma;
    }
    
int somaInteirosDivisao(int a, int b, int c) {
    int soma = 0;
    if(a>1) {
        if(b>c) {
            while(b !=(c-1)) {
                if(b%a == 0) {
                    soma = soma + b;
                }	 	  	  		   	      	     	  	     	    	 	
                b=b-1;
            }
        }
        
        if(c>b) {
             while(c !=(b-1)) {
                if(c%a == 0) {
                    soma = soma + c;
                }
                c=c-1;
            }
        }
        
        if(b==c && soma==0) {
            if(b%a == 0) {
                soma = soma + b;
            }
        }
    } else {
        System.out.println("Erro");
    }
    return soma;
}

void tempo(int s) {
    int horas = 0;
    int minutos =0;
    int segundos =0;
    
    horas =s/3600;
    s = s%3600;
    minutos = s/60;
    s= s%60;
    segundos = s;
    
    System.out.println(horas+" horas\n"+minutos+" minutos\n"+segundos+" segundos");
}	 	  	  		   	      	     	  	     	    	 	
}
