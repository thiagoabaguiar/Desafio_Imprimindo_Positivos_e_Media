import java.util.Scanner;

public class App {

    public static void main(String[] args){

        double numberReceived;
        int qtyNumPositives = 0;
        double avgNumPositives = 0;
        
        try (Scanner leitor = new Scanner(System.in)) {

            for (int i = 1; i <= 6; i++) {            
                
                System.out.println("Digite um número: ");
                numberReceived = leitor.nextDouble();   

                if (numberReceived > 0){
                    
                    qtyNumPositives++;
                    avgNumPositives = numberReceived + avgNumPositives;

                };                

            }
        }
        
        avgNumPositives = avgNumPositives / qtyNumPositives;
        System.out.println(qtyNumPositives + " números são valores positivos");
        System.out.println("Média: " + (String.format("%.1f", avgNumPositives)));

    }

}