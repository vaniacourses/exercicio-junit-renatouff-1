package jokenpo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Prompt: 
 * Você é um testador experiente de testes unitários. 
 * Gere casos de testes para a classe Java abaixo em um único 
 * arquivo Java com imports usando JUnit 5 e Java 8.
 */

// ***** FEITO PELO CHAT GPT *****

public class GPTJokenpoTest {

	private Jokenpo jokenpo;

	@BeforeEach
	void setUp() {
		jokenpo = new Jokenpo();
	}

	// ----------------- Casos de Empate -----------------
	@Test
	void testEmpatePapelVsPapel() {
		assertEquals(0, jokenpo.jogar(1, 1));
	}

	@Test
	void testEmpatePedraVsPedra() {
		assertEquals(0, jokenpo.jogar(2, 2));
	}

	@Test
	void testEmpateTesouraVsTesoura() {
		assertEquals(0, jokenpo.jogar(3, 3));
	}

	// ----------------- Vitórias do Jogador 1 -----------------
	@Test
	void testJogador1VenceComPapelContraPedra() {
		assertEquals(1, jokenpo.jogar(1, 2));
	}

	@Test
	void testJogador1VenceComPedraContraTesoura() {
		assertEquals(1, jokenpo.jogar(2, 3));
	}

	@Test
	void testJogador1VenceComTesouraContraPapel() {
		assertEquals(1, jokenpo.jogar(3, 1));
	}

	// ----------------- Vitórias do Jogador 2 -----------------
	@Test
	void testJogador2VenceComPapelContraPedra() {
		assertEquals(2, jokenpo.jogar(2, 1));
	}

	@Test
	void testJogador2VenceComPedraContraTesoura() {
		assertEquals(2, jokenpo.jogar(3, 2));
	}

	@Test
	void testJogador2VenceComTesouraContraPapel() {
		assertEquals(2, jokenpo.jogar(1, 3));
	}

	// ----------------- Casos Inválidos -----------------
	@Test
	void testJogador1InvalidoZero() {
		assertEquals(-1, jokenpo.jogar(0, 2));
	}

	@Test
	void testJogador2InvalidoZero() {
		assertEquals(-1, jokenpo.jogar(1, 0));
	}

	@Test
	void testJogador1InvalidoMaiorQueTres() {
		assertEquals(-1, jokenpo.jogar(4, 2));
	}

	@Test
	void testJogador2InvalidoMaiorQueTres() {
		assertEquals(-1, jokenpo.jogar(2, 5));
	}

	@Test
	void testAmbosInvalidos() {
		assertEquals(-1, jokenpo.jogar(0, 7));
	}
}
