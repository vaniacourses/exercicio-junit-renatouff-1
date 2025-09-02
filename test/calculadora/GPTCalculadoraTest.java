package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Prompt:
 * Você é um engenheiro de QA especialista de testes. 
 * Sua tarefa é gerar casos de testes unitários para a classe Calculadora.java.
 * - Use JUnit 5 e Java 8 
 * - O código deve ser um único arquivo Java, completo e com todos os imports. 
 * - Usar modelo ChatGPT-4 ou ChatGPT4o-mini
 * 
 */

// ***** FEITO PELO CHAT GPT *****

public class GPTCalculadoraTest {

	private Calculadora calculadora;

	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
	}

	// ----------------- Testes de Soma -----------------
	@Test
	void testSomaPositivos() {
		assertEquals(9, calculadora.soma(4, 5));
	}

	@Test
	void testSomaComZero() {
		assertEquals(7, calculadora.soma(7, 0));
	}

	@Test
	void testSomaNegativos() {
		assertEquals(-12, calculadora.soma(-10, -2));
	}

	@Test
	void testSomaPositivoENegativo() {
		assertEquals(3, calculadora.soma(5, -2));
	}

	// ----------------- Testes de Subtração -----------------
	@Test
	void testSubtracaoPositivos() {
		assertEquals(2, calculadora.subtracao(7, 5));
	}

	@Test
	void testSubtracaoComZero() {
		assertEquals(10, calculadora.subtracao(10, 0));
	}

	@Test
	void testSubtracaoNegativos() {
		assertEquals(-3, calculadora.subtracao(-5, -2));
	}

	@Test
	void testSubtracaoPositivoENegativo() {
		assertEquals(12, calculadora.subtracao(10, -2));
	}

	// ----------------- Testes de Multiplicação -----------------
	@Test
	void testMultiplicacaoPositivos() {
		assertEquals(20, calculadora.multiplicacao(4, 5));
	}

	@Test
	void testMultiplicacaoComZero() {
		assertEquals(0, calculadora.multiplicacao(10, 0));
	}

	@Test
	void testMultiplicacaoNegativos() {
		assertEquals(-15, calculadora.multiplicacao(-3, 5));
	}

	@Test
	void testMultiplicacaoDoisNegativos() {
		assertEquals(12, calculadora.multiplicacao(-3, -4));
	}

	// ----------------- Testes de Divisão -----------------
	@Test
	void testDivisaoPositivos() {
		assertEquals(3, calculadora.divisao(15, 5));
	}

	@Test
	void testDivisaoNegativos() {
		assertEquals(-4, calculadora.divisao(-8, 2));
	}

	@Test
	void testDivisaoDoisNegativos() {
		assertEquals(5, calculadora.divisao(-10, -2));
	}

	@Test
	void testDivisaoPorUm() {
		assertEquals(7, calculadora.divisao(7, 1));
	}

	@Test
	void testDivisaoPorZeroDeveLancarExcecao() {
		assertThrows(ArithmeticException.class, () -> calculadora.divisao(5, 0));
	}

	// ----------------- Testes de Somatória -----------------
	@Test
	void testSomatoriaPositivo() {
		assertEquals(10, calculadora.somatoria(4)); // 0+1+2+3+4 = 10
	}

	@Test
	void testSomatoriaZero() {
		assertEquals(0, calculadora.somatoria(0));
	}

	@Test
	void testSomatoriaNegativo() {
		assertEquals(0, calculadora.somatoria(-5));
	}

	// ----------------- Testes de EhPositivo -----------------
	@Test
	void testEhPositivoComPositivo() {
		assertTrue(calculadora.ehPositivo(7));
	}

	@Test
	void testEhPositivoComZero() {
		assertTrue(calculadora.ehPositivo(0));
	}

	@Test
	void testEhPositivoComNegativo() {
		assertFalse(calculadora.ehPositivo(-3));
	}

	// ----------------- Testes de Compara -----------------
	@Test
	void testComparaIguais() {
		assertEquals(0, calculadora.compara(5, 5));
	}

	@Test
	void testComparaMaior() {
		assertEquals(1, calculadora.compara(10, 7));
	}

	@Test
	void testComparaMenor() {
		assertEquals(-1, calculadora.compara(4, 9));
	}
}
