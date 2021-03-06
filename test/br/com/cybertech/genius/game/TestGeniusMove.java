package br.com.cybertech.genius.game;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TESTE DA CLASSE "GENIUS MOVE"
 *
 * @since  29.09.2014
 * @author Felipe Rodrigues Gil      <felipe.rodrigues01@hotmail.com> R.A.248543
 * @author Leandro Melão Medeiros    <leandro.medeiros.br@gmail.com>  R.A.250544
 * @author Lidiane Aparecida Pimenta <lidiane_apda@hotmail.com>       R.A.250822
 * @author Thiago de Godoy Sanches   <thiago_g.sanches@hotmail.com>   R.A.250821
 */
public class TestGeniusMove {
    @Test
    public void TestGeniusMoveNew() {
        GeniusMove move;

        /* Ao tentar gerar um movimento com tipo inválido o construtor deve gerar
        um tipo válido (1-4). */
        move = new GeniusMove(0);
        assertTrue(move.getId() > 0);
        assertTrue(move.getId() <= 4);

        move = new GeniusMove(5);
        assertTrue(move.getId() > 0);
        assertTrue(move.getId() <= 4);

        /* Ao tentar gerar um movimento com tipo VÁLIDO o construtor deve gerar
        respeitá-lo. */
        move = new GeniusMove(1);
        assertTrue(1 == move.getId());
    }

     @Test
     public void TestGeniusGetImage() {
        GeniusMove move;

        /* Um ícone que represente a cor acessa e outro apagada devem ser
          retornados de acordo com o tipo de movimento escolhido */

        /* Verde */
        move = new GeniusMove(GeniusMove.TYPE_GREEN);
        assertNotNull(move.getOnImage());
        assertNotNull(move.getOffImage());

        /* Vermelho */
        move = new GeniusMove(GeniusMove.TYPE_RED);
        assertNotNull(move.getOnImage());
        assertNotNull(move.getOffImage());

        /* Amarelo */
        move = new GeniusMove(GeniusMove.TYPE_YELLOW);
        assertNotNull(move.getOnImage());
        assertNotNull(move.getOffImage());

        /* Azul */
        move = new GeniusMove(GeniusMove.TYPE_BLUE);
        assertNotNull(move.getOnImage());
        assertNotNull(move.getOffImage());
     }
}
