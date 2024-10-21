import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    
    Scanner usuario = new Scanner(System.in);

    
    String nomes[] = new String[3];
    int notas[] = new int[3];

    
    
    
    for(int i = 0; i < nomes.length; i ++) {
      System.out.println("Digite o nome do aluno " + ( i + 1) + ":" );
      nomes[i] = usuario.nextLine();
    }

    
    for(int i = 0; i < notas.length; i ++){
      System.out.println("Agora digite a nota do aluno " + (i + 1) + ":");
      notas[i] = usuario.nextInt();
    }
    

    
    for(int i = 0; i < nomes.length; i ++){
      System.out.println("O aluno " + nomes[i] + " tirou a nota " + notas[i]);
    }
    
  }
}