package semana14.exercicios.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
public class AquarioTest {
   @Test
    public void medidasTest (){
        Aquario aquario = new Aquario(5,5,5);
        aquario.setComprimento(10);
        aquario.setAltura(10);
        aquario.setLargura(10);
        
        assertEquals(10, aquario.getAltura());
        assertEquals(10, aquario.getLargura());
    }
}