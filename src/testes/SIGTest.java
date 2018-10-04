package testes;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import fachada.SIG;

public class SIGTest {
	
	SIG sis;
	
	@Before
	public void criaSIG() throws Exception{
		sis = new SIG();
		
	}
	
	@Test
	public void testaCriarMostrarReunioes() throws Exception{
		sis.criarReuniao("25/09/2018", "10:00", "Matheus", "Antonio");
		
		String esperado = "Reuniao marcada para 25/09/2018 às 10:00\nParticipantes: Matheus; Antonio; \n";
		Assert.assertEquals(esperado, sis.mostrarReunioes());
	}
	
	@Test
	public void testaCriarMostrarEntrevistas() throws Exception{
		sis.criarEntrevista("26/09/2018", "09:00", "Matheus", "Juliana");
		
		String esperado = "Entrevista marcada para 26/09/2018 às 09:00\nParticipantes: Matheus; Juliana; \n";
		Assert.assertEquals(esperado, sis.mostrarEntrevistas());
	}
	
	@Test
	public void testaCriarMostrarBalanco(){
		sis.criarBalanco("Setembro");
		sis.inserirConta("Setembro", "Energia", "2.485,78");
		sis.inserirConta("Setembro", "Água", "856,14");
		
		String esperado = "Balanço de contas de Setembro:\nCONTA - VALOR EM R$\nEnergia - 2.485,78\nÁgua - 856,14\n";
		Assert.assertEquals(esperado, sis.mostrarBalanco("Setembro"));
	}
	
	@Test
	public void testaCriarMostrarFolhaPagamento(){
		sis.criarFolhaPagamento("Setembro");
		sis.inserirFuncionarioSalario("Setembro", "João", "2.500,00");
		sis.inserirFuncionarioSalario("Setembro", "Juliana", "5.780,00");
		
		String esperado = "Folha de Pagamento - Setembro:\nJoão - 2.500,00\nJuliana - 5.780,00\n";
		Assert.assertEquals(esperado, sis.mostrarFolhaPagamento("Setembro"));
	}
	
	@Test
	public void testaCriarMostrarProfessor() throws Exception{
		sis.criarProfessor("Edson", 10);
		sis.addDisciplinaProfessor("Edson", "Banco de Dados");
		sis.addDisciplinaProfessor("Edson", "Algoritmos");
		sis.addDisciplinaProfessor("Edson", "ATAL");
		
		String esperado = "Edson - 10 anos de casa \nDisciplinas: Banco de Dados; Algoritmos; ATAL; \n";
		Assert.assertEquals(esperado, sis.infoProfessor("Edson"));
	}
	
	@Test
	public void testaCriarMostrarAluno() throws Exception{
		sis.criarAluno("Jean", 1500);
		sis.addDisciplinaAluno("Jean", "Banco de Dados");
		sis.addDisciplinaAluno("Jean", "Algoritmos");
		
		String esperado = "Jean - 1500.0\nHistórico: Banco de Dados; Algoritmos; \n";
		Assert.assertEquals(esperado, sis.mostrarAluno("Jean"));
	}
	
	@Test
	public void testaCriarMostrarEstoque(){
		sis.adicionarAoEstoque("Lápis Grafite", "250");
		sis.adicionarAoEstoque("Folhas A4", "2000");
		sis.adicionarAoEstoque("Cadeiras", "50");
		
		String esperado = "ESTOQUE:\nProdutos - Quantidade\nLápis Grafite - 250\nFolhas A4 - 2000\nCadeiras - 50\n";
		Assert.assertEquals(esperado, sis.mostrarEstoque());
	}
	
	@Test
	public void testaCriarMostrarPedidos(){
		sis.criarPedido("10 - Lampadas LED", "250");
		sis.criarPedido("80 - Apagadores de Quadro", "300");
		
		String esperado = "PEDIDOS:\nPedidos - Valor em R$\n10 - Lampadas LED - 250\n80 - Apagadores de Quadro - 300\n";
		Assert.assertEquals(esperado, sis.mostrarPedidos());
	}
	
	@Test
	public void testaCriarMostrarSalas(){
		sis.adicionarSala("CIAC - 201");
		sis.adicionarSala("CIAC - 202");
		sis.adicionarSala("CIAC - LAB IV");
		
		String esperado = "Salas alocadas:\nCIAC - 201\nCIAC - 202\nCIAC - LAB IV\n";
		Assert.assertEquals(esperado, sis.mostrarSalas());
	}

}
