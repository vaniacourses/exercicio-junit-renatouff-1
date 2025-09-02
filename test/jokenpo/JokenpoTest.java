package jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe de teste para jogo Jokenpo")
class JokenpoTest {

	private Jokenpo jokenpo;
	// 1 (papel), 2 (pedra), 3 (tesoura)

	@BeforeEach
	void setUp() throws Exception {
		jokenpo = new Jokenpo();
	}

	@DisplayName("Testa empate")
	@Test
	public void testEmpate() {
		assertEquals(0, jokenpo.jogar(1, 1));
		assertEquals(0, jokenpo.jogar(2, 2));
		assertEquals(0, jokenpo.jogar(3, 3));
	}

	@DisplayName("Testa vitoria do jogador 1")
	@Test
	public void testVitoriaJogador1() {
		assertEquals(1, jokenpo.jogar(1, 2)); // Papel vence Pedra
		assertEquals(1, jokenpo.jogar(2, 3)); // Pedra vence Tesoura
		assertEquals(1, jokenpo.jogar(3, 1)); // Tesoura vence Papel
	}

	@DisplayName("Testa vitoria do jogador 2")
	@Test
	public void testVitoriaJogador2() {
		assertEquals(2, jokenpo.jogar(2, 1)); // Papel vence Pedra
		assertEquals(2, jokenpo.jogar(3, 2)); // Pedra vence Tesoura
		assertEquals(2, jokenpo.jogar(1, 3)); // Tesoura vence Papel
	}
}
