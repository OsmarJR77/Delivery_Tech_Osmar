public class Dados_Nao_Primitivos {

  public static void main(String[] args) {
    
    String nome = "Naruto Uzumaki";     // String é um tipo não primitivo de dados

    String nomeMaisculo = nome.toUpperCase();   // a vaiavel nomeMaiusculo recebe o valor de nome em MAIUSCULO

    System.out.println(" - - - - - - -  ");   // Pula uma linha em vazio
    System.out.println("O nome " + nome + " agora texto está em MAIUSCULO :  " + nomeMaisculo);
    String aldeia = "ALDEIA DA FOLHA";

    String aldeiaMinusculo = aldeia.toLowerCase();  // a variavel aldeiaMinusculo recebe o valor de aldeia em minusculo

    System.out.println(" - - - - - - - ");   // Pula uma linha em vazio
    System.out.println(aldeia + " que é o nome da aldeia do " + nome + " está em minusculo :  " + aldeiaMinusculo);

    System.out.println(" ");   // Pula uma linha em vazio



  }
}
