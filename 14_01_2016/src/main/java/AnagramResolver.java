import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramResolver {
    private String palavra;
    private String palavraOrdenada;

    public AnagramResolver(String palavra){
        this.palavra = palavra;
        this.palavraOrdenada = ordenarPalavra(this.palavra);
    }

    public List<String> findAnagrams(List<String> palavras){
        return palavras.stream()
                .filter(p -> p.length() == palavra.length())
                .filter(p -> ordenarPalavra(p).equals(palavraOrdenada) )
                .collect(Collectors.toList());
    }

    private String ordenarPalavra(String palavraTest){
        char[] palavraDaVezOrdenada = palavraTest.toLowerCase().toCharArray();
        Arrays.sort(palavraDaVezOrdenada);
        return new String(palavraDaVezOrdenada);
    }

    /*

    1 Solução

    @Deprecated
    public List<String> find(List<String> palavras){
        List<String> resultado = new ArrayList<>();

        for (String palavraDaVez : palavras) {
            int count = 0;

            palavraDaVez = palavraDaVez.toLowerCase();
            String palavraTmp = palavra.toLowerCase();

            if (palavraDaVez.length() == palavra.length()) {
                int palavraSize = palavra.length();
                for (int i = 0; i < palavraSize; i++) {
                    Character letra = palavraDaVez.charAt(i);
                    if (palavraTmp.contains(letra.toString()))
                        count++;
                    palavraTmp = palavraTmp.replaceFirst(letra.toString(), "");
                }

                if (count == palavraDaVez.length())
                    resultado.add(palavraDaVez);
            }

        }

        return resultado;
    }

    2 Solução - Refatorada após aprovação dos testes gerados.
    @Deprecated
    public List<String> findAnagrams(List<String> palavras){
        List<String> resultado = new ArrayList<>();
        char[] palavraOrdenada = palavra.toLowerCase().toCharArray();
        Arrays.sort(palavraOrdenada);

        for (String palavraDaVez : palavras) {

            if(palavra.length() != palavraDaVez.length())
                continue;

            char[] palavraDaVezOrdenada = palavraDaVez.toLowerCase().toCharArray();
            Arrays.sort(palavraDaVezOrdenada);

            if(new String(palavraDaVezOrdenada).equals(new String(palavraOrdenada)))
                resultado.add(palavraDaVez);
        }
        return resultado;
    }

    // Refatoração da solução 2 (Java6)
    @Deprecated
    public List<String> findAnagrams(List<String> palavras){
        List<String> resultado = new ArrayList<>();

        for (String palavraDaVez : palavras) {

            if(palavra.length() != palavraDaVez.length())
                continue;

            String palavraDaVezOrdenada = ordenarPalavra(palavraDaVez);

            if(palavraDaVezOrdenada.equals(palavraOrdenada))
                resultado.add(palavraDaVez);
        }
        return resultado;
    }

    */
}
