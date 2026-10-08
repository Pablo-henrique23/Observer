package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeitoSecretarioTest {

    @Test
    void deveOcuparLeito(){
        Secretario jorge = new Secretario("Jorge");
        Leito leito1 = new Leito("1", false);
        jorge.observarLeito(leito1);
        leito1.ocupar();
        assertEquals("Jorge, o leito 1 agora esta ocupado", jorge.getUltimaNotificacao());
    }


    @Test
    void deveDesocuparLeito(){
        Secretario carlos = new Secretario("Carlos");
        Leito leito2 = new Leito("2", true);
        carlos.observarLeito(leito2);
        leito2.desocupar();
        assertEquals("Carlos, o leito 2 agora esta desocupado", carlos.getUltimaNotificacao());
    }
}
