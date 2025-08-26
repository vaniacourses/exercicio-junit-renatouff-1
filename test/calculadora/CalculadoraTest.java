package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {

	private Calculadora calc;

	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}

	@DisplayName("Testa a soma de dois numeros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);
		Assertions.assertEquals(9, soma);
	}

	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}

	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		} catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class, () -> calc.divisao(8, 0));
	}

	// Novos testes para Calculadora

	@DisplayName("Testa Subtracao de dois numeros")
	@Test
	public void testSubtracaoDoisNumeros() {
		int subtracao = calc.subtracao(10, 3);
		assertEquals(7, subtracao);
	}

	@DisplayName("Testa Multiplicacao de dois numeros")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(5, 15);
		assertEquals(75, multiplicacao);
	}

	@DisplayName("Testa Somatoria de valores positivos")
	@Test
	public void testSomatoriaValoresPositivos() {
		int somatoria = calc.somatoria(7); // 7+6+5+4+3+2+1+0 = 28
		assertEquals(28, somatoria);
	}

	@DisplayName("Testa se numero e positivo")
	@Test
	public void testEhPositivo() {
		assertTrue(calc.ehPositivo(20));
	}

	@DisplayName("Testa compara se A = B")
	@Test
	public void testComparaNumerosIguais() {
		int compara = calc.compara(50, 50);
		assertEquals(0, compara);
	}

	@DisplayName("Testa compara se A > B")
	@Test
	public void testComparaSeAMaiorQueB() {
		int compara = calc.compara(5, 3);
		assertEquals(1, compara);
	}

	@DisplayName("Testa compara se A < B")
	@Test
	void testComparaSeAMenorQueB() {
		int compara = calc.compara(1, 2);
		assertEquals(-1, compara);
	}

}
