/*
 * OBJETIVO DA AULA : Criar classe, inserir dados e imprimir resultados
 * 
 * 1º parte: Criar condições para separar os personagens em Ranking a seguir: 
              -- Chonnin - - Jounin --- Gennin ----  
 
 * 2º parte: Solicitar os dados a seguir, para o primeiro ninja 1 ( personagem Naruto):
               -- nome -- idade -- nível de poder -- numero de missões 

 * 3º parte: Solicitar os dados a seguir, para o primeiro ninja 2 ( personagem Rock Lee):
               -- nome -- idade -- nível de poder -- numero de missões  
 */

import java.util.Scanner; // Importa a biblioteca da função Scanner e inserir dado via teclado

public class ClassePersonagem {    
    public static void main(String[] args) {

 // - 2º parte da lição - Rotina para ler o teclado com o comando Scanner ninja 1  -------------------------

    Scanner caixaDeTexto = new Scanner(System.in);

    System.out.println(" Cadastro do Ninja 1");
    System.out.println(" Qual o Nome do Ninja ? ");
    String nome1 = caixaDeTexto.nextLine();

    System.out.println(" Qual a Idade do Ninja ? ");
    int idade1 = caixaDeTexto.nextInt();

    System.out.println(" Qual o seu Nível de Poder ?");
    int Poder1 = caixaDeTexto.nextInt();

    System.out.println(" Qual o seu Número de Missões :");
    int missoes1 = caixaDeTexto.nextInt();

    String ranking1;
    
 // --------- Verificando Condiçoes para escolher o ranking -----------------------   
    if(missoes1 == 10 && Poder1 > 15) {
        ranking1 = "Chunnin";
    } // fim do if
    else if (missoes1 >= 20){
        ranking1 = "Jounnin";
    } // fim do elseif
    else {
        ranking1 = "Gennin";
    } // fim do else
 
 // ----------- imprimir as respostas do ninja 1 ------------------------------

 System.out.println("\n Resultado Ninja 1:");
 System.out.println("Nome : " + nome1);
 System.out.println("Idade : " + idade1);
 System.out.println("Nível de Poder : " + Poder1);
 System.out.println("Missões :  " + missoes1);
 System.out.println("Ranking : " + ranking1);
 System.out.println(" ------------------------ ");

 caixaDeTexto.nextLine();

// - 3º parte da lição - Rotina para ler o teclado com o comando Scanner ninja 2  ----------------------------------

    System.out.println(" Cadastro do Ninja 2");
    System.out.println(" Qual o Nome do Ninja ? ");
    String nome2 = caixaDeTexto.nextLine();

    System.out.println(" Qual a Idade do Ninja ? ");
    int idade2 = caixaDeTexto.nextInt();

    System.out.println(" Qual o seu Nível de Poder ?");
    int Poder2 = caixaDeTexto.nextInt();

    System.out.println(" Qual o seu Número de Missões :");
    int missoes2 = caixaDeTexto.nextInt();

    String ranking2;
    
 // --------- Verificando Condiçoes para escolher o ranking ---------   
    if(missoes2 == 10 && Poder2 > 15) {
        ranking2 = "Chunnin";
    } // fim do if
    else if (missoes2 >= 20){
        ranking2 = "Jounnin";
    } // fim do elseif
    else {
        ranking2 = "Gennin";
    } // fim do else
 
 // - - - imprimir as respostas do ninja 2 --------------------------------

 System.out.println("\n Resultado Ninja 1:");
 System.out.println("Nome : " + nome2);
 System.out.println("Idade : " + idade2);
 System.out.println("Nível de Poder : " + Poder2);
 System.out.println("Missões :  " + missoes2);
 System.out.println("Ranking : " + ranking2);
 System.out.println(" --------------------------------- ");
  System.out.println(" ------- Comparação final -------- ");

 // -----------Comparação final entre os ninjas ----------------------------------

 if(Poder1 > Poder2) {
    System.out.println(nome1 + " é mais poderoso que o " + nome2 + " !!!");
 } // fim do if
 else if (Poder2 > Poder1) {
    System.out.println(nome2 + " é mais poderoso que o " + nome1 + " !!!");
 }// fim do else if
 else {
    System.out.println(" Ambos possuem o mesmo poder, " + nome1 + " e o " + nome2);
 } // fim do else

 System.out.println("\n");  // pular 1 linha
 caixaDeTexto.close();

 // -----------------------------------------------
 // --- 1º parte da lição - Condições para separar por Ranking ------------------------------

    String ninja1 = "Naruto";     // criou uma String que receberá os nomes dos personagens
    String ninja2 = "Rock Lee";   // criou uma String que receberá os nomes dos personagens
    int nivelPoder1 = 49;         // criou uma INT que receberá o valor o nível de podr do personagem
    int nivelPoder2 = 67;         // criou uma INT que receberá o valor o nível de podr do personagem
    Short numeroDeMissoes = 8;    // criou uma short que receberá o numero de missões

    System.out.println(" Neste jogo, se eu usar o poder do  " + ninja1 + ", o nível é : " + nivelPoder1);
    System.out.println(" Posso usar o poder do " + ninja2 + " porque o nível " + nivelPoder2 + " é maior.");

 // --------- Verificando Condiçoes ---------   
    if(numeroDeMissoes == 10 && nivelPoder1 > 15) {
        System.out.println(" Ranking: Chunnin");
    } // fim do if
    else if (numeroDeMissoes >= 20){
        System.out.println(" Ranking: Jounin");
    } // fim do else if
    else {
        System.out.println(" Ranking: Gennin");
    } // fim do else
 // -----------------------------------------------

 System.out.println("\n"); // pular 1 linha
        
   } // fim do PSVM
} // fim do classePersonagem

