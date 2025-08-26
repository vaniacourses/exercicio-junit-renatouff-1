package carrinho;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe de teste para Carrinho")
public class CarrinhoTest {

	private Carrinho carrinho;
	private Produto p1;
	private Produto p2;

	@BeforeEach
	void setUp() throws Exception {
		carrinho = new Carrinho();
		p1 = new Produto("Livro", 70);
		p2 = new Produto("eBook", 50);
	}

	@DisplayName("Testa Carrinho vazio")
	@Test
	public void testCarrinhoVazio() {
		assertEquals(0, carrinho.getQtdeItems());
		assertEquals(0.0, carrinho.getValorTotal());
	}

	@DisplayName("Testa adicionar um item ao Carrinho")
	@Test
	public void testAdicionarItem() {
		carrinho.addItem(p1);
		assertEquals(1, carrinho.getQtdeItems());
		assertEquals(70, carrinho.getValorTotal());
	}

	@DisplayName("Testa adicionar varios itens ao Carrinho")
	@Test
	public void testAdicionarVariosItens() {
		carrinho.addItem(p1);
		carrinho.addItem(p2);
		assertEquals(2, carrinho.getQtdeItems());
		assertEquals(120, carrinho.getValorTotal());
	}

	@DisplayName("Testa remover item do Carrinho")
	@Test
	public void testRemoverItem() throws ProdutoNaoEncontradoException {
		carrinho.addItem(p1);
		carrinho.removeItem(p1);
		assertEquals(0, carrinho.getQtdeItems());
	}

	@DisplayName("Testa remover item inexistente")
	@Test
	public void testRemoverItemInexistente() {
		assertThrows(ProdutoNaoEncontradoException.class, () -> {
			carrinho.removeItem(p1);
		});
	}

	@DisplayName("Testa esvaziar Carrinho")
	@Test
	public void testEsvaziarCarrinho() {
		carrinho.addItem(p1);
		carrinho.addItem(p2);
		carrinho.esvazia();
		assertEquals(0, carrinho.getQtdeItems());
		assertEquals(0.0, carrinho.getValorTotal());
	}

}
