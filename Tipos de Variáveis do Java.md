# 🧮 Tipos de Variáveis em Java

Este guia resume os **tipos de dados primitivos e não primitivos** disponíveis na linguagem **Java**, com exemplos, tamanhos de memória e descrições.  
É um ótimo material de consulta rápida para estudantes, desenvolvedores e documentação de projetos.

---

## 🔹 Tipos Primitivos

Os tipos primitivos são os mais básicos da linguagem. Eles armazenam valores diretamente na memória **stack**, não são objetos e não possuem métodos.

| Tipo de Dado | Categoria | Tamanho em Memória | Intervalo de Valores | Exemplo de Declaração |
|---------------|------------|--------------------|----------------------|------------------------|
| **byte** | Inteiro | 1 byte (8 bits) | -128 a 127 | `byte idade = 25;` |
| **short** | Inteiro | 2 bytes (16 bits) | -32.768 a 32.767 | `short ano = 2025;` |
| **int** | Inteiro | 4 bytes (32 bits) | -2.147.483.648 a 2.147.483.647 | `int populacao = 1000000;` |
| **long** | Inteiro | 8 bytes (64 bits) | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | `long distancia = 9876543210L;` |
| **float** | Ponto flutuante | 4 bytes (32 bits) | ±3.40282347E+38F (6-7 dígitos de precisão) | `float preco = 19.99f;` |
| **double** | Ponto flutuante | 8 bytes (64 bits) | ±1.79769313486231570E+308 (15 dígitos de precisão) | `double pi = 3.14159265358979;` |
| **char** | Caractere | 2 bytes (16 bits, Unicode) | '\u0000' (0) até '\uffff' (65.535) | `char letra = 'A';` |
| **boolean** | Lógico | 1 bit (ou 1 byte, depende da JVM) | `true` ou `false` | `boolean ativo = true;` |

### 🧠 Dicas
- Tipos primitivos **não podem ser nulos**.
- Para trabalhar como **objetos**, utilize as *Wrapper Classes*: `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`.
- Exemplo: `Integer idade = 25;` é um objeto, enquanto `int idade = 25;` é um valor primitivo.

---

## 🔸 Tipos Não Primitivos

Os tipos não primitivos são baseados em **referências a objetos** armazenados na **heap memory**.  
Eles podem conter múltiplos valores e métodos, além de poderem ser definidos pelo programador.

| Tipo de Dado | Categoria | Armazenamento / Tamanho | Descrição | Exemplo de Declaração |
|---------------|------------|--------------------------|------------|------------------------|
| **String** | Classe (Objeto) | Depende do tamanho do texto | Representa uma sequência de caracteres (imutável) | `String nome = "Jackson";` |
| **Array** | Estrutura de Dados | Depende do tipo e tamanho | Armazena múltiplos valores do mesmo tipo em uma estrutura indexada | `int[] numeros = {1, 2, 3, 4};` |
| **Class** | Tipo definido pelo usuário | Depende dos atributos | Estrutura que define objetos com atributos e métodos | `class Pessoa { String nome; int idade; }` |
| **Object** | Classe base de todas as classes | Depende da instância | Superclasse raiz; qualquer tipo de dado pode ser referenciado por um `Object` | `Object obj = "Texto";` |
| **Interface** | Contrato de comportamento | Não ocupa memória até ser implementada | Define métodos que devem ser implementados por uma classe | `interface Animal { void emitirSom(); }` |
| **Enum** | Tipo Enumerado | Pequeno conjunto fixo de constantes | Representa valores constantes nomeados | `enum Dia { SEG, TER, QUA, QUI, SEX, SAB, DOM }` |
| **Record** *(Java 14+)* | Classe imutável compacta | Depende dos campos | Facilita a criação de classes de dados (campos + construtor + getters) | `record Ponto(int x, int y) {}` |
| **Wrapper Classes** | Objeto que envolve tipos primitivos | Depende do tipo primitivo | Permite tratar tipos primitivos como objetos | `Integer idade = 30; Double salario = 2500.75;` |
| **Collections (List, Set, Map)** | Estruturas de dados dinâmicas | Variável | Armazenam múltiplos objetos com regras específicas (listas, conjuntos, mapas) | `List<String> nomes = List.of("Ana", "João");` |

---

## 💡 Observações Importantes

- Tipos **não primitivos podem ser nulos** (`null`), ao contrário dos primitivos.
- **Strings são imutáveis**: uma vez criadas, não podem ser alteradas.  
  Para modificar textos dinamicamente, use `StringBuilder` ou `StringBuffer`.
- **Enums** são úteis para representar constantes nomeadas (ex: dias da semana, status de pedidos).
- **Records** simplificam classes de dados em APIs modernas e DTOs.
- **Collections** são parte fundamental da API Java para listas, conjuntos e mapas dinâmicos.
