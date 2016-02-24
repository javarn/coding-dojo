### Line Counter Java

Description:

Desenvolva um utilitário que conte o número de linhas de código efetivo em um arquivo-fonte em Java. Considere uma linha se ela não contiver apenas caracteres em branco ou texto dentro de comentários. Alguns exemplos:

```
- // This file contains 3 lines of code
1 public interface Dave {
- /**
- * count the number of lines in a file
- */
2 int countLines(File inFile); // not the real signature!
3 }
```

```
- /*****
- * This is a test program with 5 lines of code
- * \/* no nesting allowed!
- //*****//***/// Slightly pathological comment ending...
-
1 public class Hello {
2 public static final void main(String [] args) { // gotta love Java
- // Say hello
3 System./*wait*/out./*for*/println/*it*/("Hello/*");
4 }
-
5 }

```

Lembre-se que comentários em Java podem ser ou "//" até o final de uma linha, ou "/*" até encontrar "*/". Podem existir múltiplos "/*...*/" comentário em uma linha. Caracteres em branco incluem tabulações, espações e quebras de linha. Comentários dentro de string Java devem ser ignorados.



-----


### Pontos Positivos
- O desafio foi interessante.
- Participação de todos
- Teve Cream Cracker

### Pontos Negativos
- Regex é um pouco confuso para utilizar
- Não conseguimos resolver o cenário mais complexo
- Não houve pontualidade para finalizar
- Não usamos Java 8

### Pontos de Melhoria
- Buscar desafios com tecnologias diferentes (Testes com Mock etc)
- Garantir uma máquina fixa para os dojos
- Trazer o Eclipse + Plugins e Jdk8 zipados para uso


### Participantes

- Bráulio
- Giu
- Higor
- Lucas
- Raul
- Wilson

### Outras Soluções
Lucas [Codigo](https://github.com/luksrn/my-exercism.io/blob/master/java/javaCountLines/src/main/java/dojo/LineCounter.java) - [Teste](https://github.com/luksrn/my-exercism.io/blob/master/java/javaCountLines/src/test/java/dojo/LineCounterTest.java)
Higor Lucas [Codigo](https://github.com/higorae/coding-dojo/blob/master/18_02_2016/src/main/java/dojo/LineCounter.java) - [Teste](https://github.com/higorae/coding-dojo/blob/master/18_02_2016/src/test/java/dojo/LineCounterTest.java)

### Links
https://github.com/flyway/flyway/blob/master/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/SqlStatementBuilder.java#L26
