package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa joel = new Pessoa("Joel", LocalDateTime.of(1997, 4, 9, 0, 0));
        Assertions.assertEquals(25, joel.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa joel = new Pessoa("Joel", LocalDateTime.of(1997, 4, 9, 0, 0));
        Assertions.assertTrue(joel.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.of(2007, 7, 17, 0, 0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
