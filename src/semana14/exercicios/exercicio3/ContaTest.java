package semana14.exercicios.exercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void contaTeste(){
    Conta conta1 = new Conta(1 , "Mariana Megumi");
    Conta conta2 = new Conta(2, "Scaramouche");

    conta1.depositar(300);
    conta1.sacar(100);
    conta1.transferir(conta2, 100);

    assertEquals(1, conta1.getCodigo());
    assertEquals("Mariana Megumi", conta1.getCodigo());
    assertEquals(200, conta1.getSaldo());
    assertEquals(100, conta2.getSaldo());
    }
}

