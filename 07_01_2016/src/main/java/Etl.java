import java.util.*;


public class Etl {

    Map<String, Integer> resultado = new LinkedHashMap<>();

    public Map<String,Integer> trasformar(Map<Integer,List<String>> dadoSistemaLegado){
        Iterator<Integer> iterator = dadoSistemaLegado.keySet().iterator();
       // for(String )
        while(iterator.hasNext()){
            Integer chave = iterator.next();
            dadoSistemaLegado.get(chave);
        }
        return resultado;
    }

    public Map<String, Integer> converterLista(List<String> letras, Integer pontuacao){
        Map<String, Integer> mapa = new HashMap<String,Integer>();
        for(String letra : letras)
            mapa.put(letra,pontuacao);

        return  mapa;
    }
}
