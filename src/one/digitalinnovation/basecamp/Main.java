package one.digitalinnovation.basecamp;
import java.util.Scanner;

class Main {
    public static void main(String[] args){

        //complete os espaços em branco com sua solução para o problema

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        System.out.print("Escreva o horario de inicio do jogo: ");
        inicio = scan.nextInt();
        System.out.print("Escreva o horário de termino do jogo: ");
        fim = scan.nextInt();
        horas = fim-inicio  ;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas <  0  ){
            System.out.print("O JOGO DUROU " + ((24-inicio)+fim) + " HORA(S)\n");
        }else if(horas >  1  ){
            System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " +  1  + " HORA(S)\n");
        }
    }
}
