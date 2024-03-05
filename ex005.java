import java.util.Scanner; 

		public class ex005{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int colunas = 4;
        final int linhas = 3;
        double[][] notasAlunos = new double[linhas][colunas];
        
        for (int i=0;i<linhas; i++){
        	
        	System.out.println("Aluno "+(i+1)+" Notas: ");
        	System.out.println();
        	
        	  for (int j = 0; j < 4; j++) {
                  System.out.print("Digite a nota " + (j + 1) + ": ");
                  notasAlunos[i][j] = in.nextDouble();   
        	  }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Aluno " + (i + 1) + " Notas: ");
            
            for (int j = 0; j < 4; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }

            System.out.println();
        	
        }
        
	}
	}
