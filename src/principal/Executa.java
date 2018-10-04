package principal;
import fachada.SIG;;

public class Executa {
	
	public static void main(String[] args) throws Exception{
		
		//criando objeto SIG
		SIG sis = new SIG();
		
		
		//criando reunioes
		sis.criarReuniao("25/09/2018", "10:00", "Matheus", "Antonio");
		sis.criarReuniao("25/09/2018", "13:00", "Juliana", "Jonas");
		
		//criando entrevistas
		sis.criarEntrevista("26/09/2018", "09:00", "Matheus", "Juliana");
		sis.criarEntrevista("27/09/2018", "14:00", "João",  "Maria");
		
		
		//imprimindo agenda de reunioes e entrevistas
		System.out.println("AGENDA DE EVENTOS: ");
		System.out.println(sis.mostrarReunioes());
		System.out.println(sis.mostrarEntrevistas());
		
		
		//criando balanços de contas e inserindo contas
		sis.criarBalanco("Agosto");
		sis.inserirConta("Agosto", "Internet", "150,00");
		sis.inserirConta("Agosto", "Gás", "531,98");
		
		sis.criarBalanco("Setembro");
		sis.inserirConta("Setembro", "Energia", "2.485,78");
		sis.inserirConta("Setembro", "Água", "856,14");
		
		//imprimindo os balanços de contas criados
		System.out.println(sis.mostrarBalanco("Agosto"));
		System.out.println(sis.mostrarBalanco("Setembro"));
		
		
		//criando folha de pagamento e inserindo funcionarios e seus respectivos salários
		sis.criarFolhaPagamento("Setembro");
		sis.inserirFuncionarioSalario("Setembro", "João", "2.500,00");
		sis.inserirFuncionarioSalario("Setembro", "Juliana", "5.780,00");
		
		//imprimindo folha de pagamento criada
		System.out.println(sis.mostrarFolhaPagamento("Setembro"));
		
		
		//criando professor e inserindo disciplinas
		sis.criarProfessor("Edson", 10);
		sis.addDisciplinaProfessor("Edson", "Banco de Dados");
		sis.addDisciplinaProfessor("Edson", "Algoritmos");
		sis.addDisciplinaProfessor("Edson", "ATAL");
		
		//imprimindo informações do professor
		System.out.println("Informações do Professor:\nNOME - TEMPO DE CASA");
		System.out.println(sis.infoProfessor("Edson"));
		
		
		//criando aluno e inserindo disciplinas do aluno
		sis.criarAluno("Jean", 1500);
		sis.addDisciplinaAluno("Jean", "Banco de Dados");
		sis.addDisciplinaAluno("Jean", "Algoritmos");
		
		//imprimindo informações do aluno criado
		System.out.println("Informações do Aluno:\nNOME - MENSALIDADE");
		System.out.println(sis.mostrarAluno("Jean"));
		
		
		//inserindo e imprimindo itens do estoque
		sis.adicionarAoEstoque("Lápis Grafite", "250");
		sis.adicionarAoEstoque("Folhas A4", "2000");
		sis.adicionarAoEstoque("Cadeiras", "50");
		
		System.out.println(sis.mostrarEstoque());
		
		
		//criando e imprimindo pedidos de compras 
		sis.criarPedido("10 - Lampadas LED", "250");
		sis.criarPedido("80 - Apagadores de Quadro", "300");
		
		System.out.println(sis.mostrarPedidos());
		
		
		//alocando e imprimindo salas
		sis.adicionarSala("CIAC - 201");
		sis.adicionarSala("CIAC - 202");
		sis.adicionarSala("CIAC - LAB IV");
		
		System.out.println(sis.mostrarSalas());
	}
}
