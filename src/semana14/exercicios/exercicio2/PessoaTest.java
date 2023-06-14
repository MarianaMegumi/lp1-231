package semana14.exercicios.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void pessoaTeste(){
    Pessoa pessoa = new Pessoa(1.63, 58.3);

    pessoa.setAltura(1.75);
    pessoa.setPeso(70);

    
    assertEquals(1.75, pessoa.getAltura());
    assertEquals(70, pessoa.getPeso());
    assertEquals(24.22, pessoa.getImc());
    assertEquals("Peso normal", pessoa.getFaixa());
    }
}
