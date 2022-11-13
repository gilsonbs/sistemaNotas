import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("SISTEMA DE REGISTRO DE NOTAS\n");
        System.out.println("Digite a Matricula do Aluno: ");
        int matricula = teclado.nextInt();


        System.out.println("Digite o nome do Aluno: (sem espaços)");
        String alu = teclado.next();

        System.out.println("Digite o Sobrenome do Aluno: (sem espaços)");
        String alu1 = teclado.next();

        System.out.println("Digite a primeira nota: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = teclado.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = teclado.nextInt();

        System.out.println("Digite a quantidade de presenças: ");
        int pres = teclado.nextInt();

        float calcPres = (pres * 100)/60;
        int calcNotas = (n1 + n2 + n3) / 3;

        System.out.println("ALUNO: \n" + alu +" "+ alu1);
        System.out.println("MEDIA DE NOTAS: \n" + calcNotas);
        System.out.println("PERCENTUAL DE PRESENÇA: "+ calcPres + "%");
    }
}
