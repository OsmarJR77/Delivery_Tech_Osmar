### Introdução e Importância

---

Em 2014, o YouTube perdeu cerca de 50 milhões de dólares após ficar fora do ar por 24 horas devido a um erro de tipagem de dados.

Esse caso mostra a importância de linguagens fortemente tipadas, como o **Java**, onde todos os dados precisam ter seus tipos declarados de forma explícita.

No Java, existem dois tipos principais de dados:

- **Primitivos**
- **Não primitivos**

---

### Tipos de Dados Primitivos

---

Os principais tipos de dados primitivos em Java são:

- **int** – números inteiros
    
    ```java
    int idade = 16;
    
    ```
    
    Valor máximo: 2.147.483.647
    
- **double** – números decimais
    
    ```java
    double altura = 1.65;
    
    ```
    
- **char** – armazena um único caractere
    
    ```java
    char inicial = 'N';
    
    ```
    
    Deve estar entre aspas simples.
    
- **boolean** – valores verdadeiros ou falsos
    
    ```java
    boolean vivo = true;
    
    ```
    
- **long** – números inteiros maiores que o limite do `int`
    
    ```java
    long saldoBancario = 99999L;
    
    ```
    
    O número deve terminar com a letra **L**.
    
    Valor máximo: aproximadamente 9 trilhões.
    

---

### Diferenças entre Dados Primitivos e não Primitivos

- A principal diferença: dados não primitivos podem receber métodos, enquanto primitivos não podem
- Exemplos de dados não primitivos: String, array, class e enum
- Dados primitivos (como int, float, char) não podem ter métodos aplicados
