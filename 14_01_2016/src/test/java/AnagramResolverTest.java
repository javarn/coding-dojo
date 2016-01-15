import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AnagramResolverTest {

    AnagramResolver instance;

    @Test
    public void testaListaComUmaOcorrencia(){

        instance = new AnagramResolver("listen");

        List<String> anagrams = instance.findAnagrams(Arrays.asList("enlists", "google", "inlets", "banana"));

        assertTrue(anagrams.size() == 1);
        assertTrue(anagrams.get(0).equals("inlets"));
    }

    @Test
    public void testaComTresOcorrencias(){
        instance = new AnagramResolver("vots");
        List<String> anagrams = instance.findAnagrams(Arrays.asList("vots", "tovs", "vots", "vooots"));
        assertTrue(anagrams.size() == 3);

    }

    @Test
    public void testaAnagramaCaseInsensitive(){
        instance = new AnagramResolver("VOTS");
        List<String> anagrams = instance.findAnagrams(Arrays.asList("vots", "tovs", "vots", "vooots"));
        assertTrue(anagrams.size() == 3);

    }

    @Test
    public void testaListaComPalavrasMenores(){
        instance = new AnagramResolver("ANAGRAMA");
        List<String> anagrams = instance.findAnagrams(Arrays.asList("vots"));
        assertTrue(anagrams.size() == 0);
    }

    @Test
    public void testaListaComPalavrasMaiores(){
        instance = new AnagramResolver("teste");
        List<String> anagrams = instance.findAnagrams(Arrays.asList("ahahahaha"));
        assertTrue(anagrams.size() == 0);
    }


}
