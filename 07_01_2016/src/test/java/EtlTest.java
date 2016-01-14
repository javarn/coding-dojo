import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class EtlTest {

    private Etl etl = new Etl();

    /**
     * 1 point: "A", "E", "I", "O", "U", "L", "N", "R", "S", "T",
     2 points: "D", "G",
     3 points: "B", "C", "M", "P",
     4 points: "F", "H", "V", "W", "Y",
     5 points: "K",
     8 points: "J", "X",
     10 points: "Q", "Z",
     */
    @Test
    public void testTransformacaoInicial(){

        Map<Integer, List<String>> dadoSistemaLegado = new LinkedHashMap<>();
        dadoSistemaLegado.put(1, Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"));

        Map<String, Integer> dadosMigrados = etl.trasformar(dadoSistemaLegado);

        Assert.assertEquals(dadosMigrados.get("A"), new Integer(1));
    }

    @Test
    public void testConverterLista(){
        List<String> letras = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
        Integer pontuacao = 1;
        Map<String,Integer> mapa = etl.converterLista(letras, pontuacao);
        Assert.assertEquals(mapa.get("A"), new Integer(1));
    }
}
