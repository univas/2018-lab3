import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList; //Foi necessário IMPORTAR o arrayLIST

import org.junit.jupiter.api.Test;

public class PedidoTest {

	@Test
	public void testAdicionaRetiraDoProduto() {

		Produto p1 = new Produto("p1", 5, 3);
		assertEquals(5, p1.getQuantidade()); //Professor pede "0", mas é 5!

		p1.aumentarQuantidade(3);
		assertEquals(8, p1.getQuantidade()); //Professor pede "3", mas é 8!

		p1.aumentarQuantidade(4);
		assertEquals(12, p1.getQuantidade()); //Professor pede "7", mas é 12!

		p1.aumentarQuantidade(5);
		assertEquals(17, p1.getQuantidade()); //Professor pede "12", mas é 17!

		// retirar
		boolean result = p1.reduzirQuantidade(2);// sucesso
		assertTrue(result);
		assertEquals(15, p1.getQuantidade()); //Professor pede "10", mas é 15!

		result = p1.reduzirQuantidade(7);// sucesso
		assertTrue(result);
		assertEquals(8, p1.getQuantidade()); //Professor pede "3", mas é 8!

		result = p1.reduzirQuantidade(5);
		assertTrue(result); //Professor pede "False", mas é True!
		assertEquals(3, p1.getQuantidade());

		result = p1.reduzirQuantidade(3);// sucesso
		assertTrue(result);
		assertEquals(0, p1.getQuantidade());

		result = p1.reduzirQuantidade(2);// fracasso
		assertFalse(result);
		assertEquals(0, p1.getQuantidade());
	}

	@Test
	public void testAdicionaRetiraDoEstoque() {
		Estoque est = new Estoque();
		assertNull(est.consulta("p1")); // ainda não existe p1

		// testa com p1
		est.incluir("p1", 2, 3);
		Produto p1 = est.consulta("p1");
		assertNotNull(p1);
		assertEquals("p1", p1.getNome()); //Professor ("p1", p1) ERRADO!
		assertEquals(2, p1.getQuantidade());

		// testa com p2
		est.incluir("p2", 4, 4);
		Produto p2 = est.consulta("p2");
		assertNotNull(p2);
		assertEquals("p2", p2.getNome()); //Professor ("p2", p2) ERRADO!
		assertEquals(4, p2.getQuantidade());

		// verifica se a adição do p2 não atrapalhou o p1
		p1 = est.consulta("p1");
		assertNotNull(p1);
		assertEquals("p1", p1.getNome()); //Professor ("p1", p1) ERRADO!
		assertEquals(2, p1.getQuantidade());

		assertNull(est.consulta("p3"));// não existe o p3

		// teste para remover
		assertEquals(3, est.retirar("p1", 1));// qtd 1 * preco 3;

		p1 = est.consulta("p1");
		assertNotNull(p1);
		assertEquals("p1", p1.getNome()); //Professor ("p1", p1) ERRADO!
		assertEquals(1, p1.getQuantidade());// sobra 1 peça do p1

		est.retirar("p2", 1);

		p2 = est.consulta("p2");
		assertNotNull(p2);
		assertEquals("p2", p2.getNome()); //Professor ("p2", p2) ERRADO!
		assertEquals(3, p2.getQuantidade());// sobra 3 peças do p2

		assertEquals(-1, est.retirar("p1", 5));// estoque insuficiente
		assertEquals(3, est.retirar("p1", 1));// zera o estoque
		assertEquals(-1, est.retirar("p1", 1));// estoque insuficiente
	}

	@Test
	public void testAdicionarItem() {
		Cartao card = new Cartao(100);
		Estoque est = new Estoque();
		Pedido ped = new Pedido(card, est);

		// adiciona no estoque
		est.incluir("p1", 10, 3);
		est.incluir("p2", 20, 5);

		// adiciona no pedido
		boolean result = ped.adicionarItem("p1", 6);
		assertTrue(result);

		assertEquals(4, est.consulta("p1").getQuantidade());// ficou 4 unidades de p1
		assertEquals(1, ped.getItens().size());

		// estas 3 linhas fazem a mesma coisa que a linha anterior
		ArrayList<Item> lista = ped.getItens();
		int qtd = lista.size();
		assertEquals(1, qtd);

		result = ped.adicionarItem("p2", 20);
		assertTrue(result);

		assertEquals(2, ped.getItens().size());

		// produto sem estoque
		result = ped.adicionarItem("p3", 9);
		assertFalse(result);

		assertEquals(2, ped.getItens().size());// o pedido deve continuar com 2 itens
	
	}

	@Test
	public void testCalcularPrecoTotalDoItem() {
		Item i1 = new Item("p1", 5, 10);

		assertEquals(50, i1.calcularPrecoTotal(), 0.01);
	}

	@Test
	public void testCalcularValorDoPedido() {

		Cartao card = new Cartao(100);
		Estoque est = new Estoque();
		Pedido ped = new Pedido(card, est);

		assertEquals(0, ped.calcularValorDoPedido(), 0.01);

		// adiciona no estoque
		est.incluir("p1", 10, 3);
		est.incluir("p2", 20, 5);

		// adiciona no pedido
		ped.adicionarItem("p1", 5);
		assertEquals(15, ped.calcularValorDoPedido(), 0.01);

		ped.adicionarItem("p2", 6);
		assertEquals(45, ped.calcularValorDoPedido(), 0.01);
	}

	@Test
	public void testCartao() {
		Cartao card = new Cartao(100);
		Estoque est = new Estoque();
		Pedido ped = new Pedido(card, est);

		assertEquals(100, card.getSaldo());
		card.pagar(20);
		assertEquals(80, card.getSaldo());

		// adiciona no estoque
		est.incluir("p1", 10, 3);

		// adiciona no pedido
		ped.adicionarItem("p1", 5);
		// faz o pagamento
		assertTrue(ped.finalizarCompra());// pagou 15 reais
		assertEquals(65, card.getSaldo());

		est.incluir("p2", 10, 20);
		ped.adicionarItem("p2", 4);// 80 reais

		assertFalse(ped.finalizarCompra());
		assertEquals(65, card.getSaldo());// não fez o saque, pois não tem saldo suficiente

		assertFalse(card.pagar(100));// não tem saldo suficiente

	}

	@Test
	public void testStatusOk() {
		Cartao card = new Cartao(100);
		Estoque est = new Estoque();
		Pedido ped = new Pedido(card, est);

		// O valor do status muda quando a operação ocorre com sucesso.
		// 1 - novo (quando cria um pedido)
		// 2 - montando (quando adiciona algum item)
		// 3 - finalizado (quando finaliza/paga)
		// 4 - entregue (quando entrega)

		assertEquals(1, ped.getStatus());
		// adiciona no estoque
		est.incluir("p1", 10, 3);
		est.incluir("p1", 10, 2);

		// adiciona no pedido
		ped.adicionarItem("p1", 5);
		assertEquals(2, ped.getStatus());
		ped.adicionarItem("p1", 5);
		assertEquals(2, ped.getStatus());

		ped.finalizarCompra();
		assertEquals(3, ped.getStatus());

		ped.entregar();
		assertEquals(4, ped.getStatus());
	}

	@Test
	public void testStatusErro() {
		Cartao card = new Cartao(100);
		Estoque est = new Estoque();
		Pedido ped = new Pedido(card, est);

		// O valor do status muda quando a operação ocorre com sucesso.
		// 1 - novo (quando cria um pedido)
		// 2 - montando (quando adiciona algum item)
		// 3 - finalizado (quando finaliza/paga)
		// 4 - entregue (quando entrega)

		assertEquals(1, ped.getStatus());
		// adiciona no estoque
		est.incluir("p1", 10, 300);

		// adiciona no pedido
		ped.adicionarItem("p1", 5);
		assertEquals(2, ped.getStatus());
		
		ped.finalizarCompra();//não tem saldo suficiente
		assertEquals(2, ped.getStatus());//o status continua 2

		assertFalse(ped.entregar());//não pode entregar um pedido que não foi finalizado
		assertEquals(2, ped.getStatus());//o status continua 2
	}
}
