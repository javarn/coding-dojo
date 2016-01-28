### Pagination Helper (5)

Description:

For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.

The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.

The following are some examples of how this class is used:

PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
helper.pageCount(); //should == 2
helper.itemCount(); //should == 6
helper.pageItemCount( 0 ); //should == 4
helper.pageItemCount(1); // last page - should == 2
helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
helper.pageIndex(5); //should == 1 (zero based index)
helper.pageIndex(2); //should == 0
helper.pageIndex(20); //should == -1
helper.pageIndex(-10); //should == -1




-----


### Pontos Positivos
- Horário pontual (Leitura, execução e retrospectiva)
- Teve lanche
- Problema mais interessante
- Muitas pessoas


### Pontos Negativos
- Não houve tempo de explorar refatoração.
- Não houve baybe steps - Testes não foram realizados antes
- Falar mais do que está sendo feito pelo piloto
- Nem todos participaram :(
- Solução não utilizou explorou java8.
- Problema da Internet na SIG não possibilitou divulgar antes opções de problema

### Pontos de Melhoria
- Utilização da máquina da sala 401.


### Participantes

Bruno
Anelisa
Flavio
Jefferson
Patricia
Bráulio
Giu
Higor
João
Lucas
Raul