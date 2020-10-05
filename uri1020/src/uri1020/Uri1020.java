
package uri1020;

import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        int mes=0, ano= 0, dia=0;
        System.out.println("Digite o numero de dias para consultar ano, mes, dia");
        dias = sc.nextInt();
            while(dias > 365 && dias >30){
                dias = dias - 365;
                ano++;
            }
            while(dias >= 30 && dias < 365){
                dias = dias - 30;
                mes++;
            }
            while(dias > 0 && dias < 30){
                dias = dias - 1;
                dia++;
            }              
        System.out.println(+ ano +" ano(s) \n" + mes + " mes(es) \n" + dia + " Dia(s) " );
    }
    
}

 