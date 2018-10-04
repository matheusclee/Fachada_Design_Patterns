package fachada;

import administrativos.Administrativa;
import almoxarifado.Almoxarifado;
import estrutura.Sala;
import financeiro.Financeira;

import java.util.ArrayList;
import java.util.List;

import academico.*;

public class SIG {
	
	private Administrativa adm;
	private Financeira fin;
	private List<Professor> professores;
	private List<Aluno> alunos;
	private Almoxarifado almox;
	private List<Sala> salas;
	
	private static final int ZERO = 0;
	
	public SIG(){
		adm = new Administrativa();
		fin = new Financeira();
		professores = new ArrayList<Professor>();
		alunos = new ArrayList<Aluno>();
		almox = new Almoxarifado();
		salas = new ArrayList<Sala>();
	}
	
	public void criarReuniao(String data, String hora, String participante1, String participante2) throws Exception{
		adm.setReuniao(data, hora, participante1, participante2);
	}
	
	public String mostrarReunioes(){
		return adm.relatorioEventoEspecifico("reuniao");
	}
	
	public void criarEntrevista(String data, String hora, String participante1, String participante2) throws Exception{
		adm.setEntrevista(data, hora, participante1, participante2);
	}
	
	public String mostrarEntrevistas(){
		return adm.relatorioEventoEspecifico("entrevista");
	}
	
	public void criarBalanco(String mes){
		fin.addBalanco(mes);
	}
	
	public void inserirConta(String mes, String conta, String valor){
		fin.inserirConta(mes, conta, valor);
	}
	
	public String mostrarBalanco(String mes){
		return fin.emitirBalanco(mes);
	}
	
	public void criarFolhaPagamento(String mes){
		fin.addFolha(mes);
	}
	
	public void inserirFuncionarioSalario(String mes, String nome, String salario){
		fin.inserirFuncionario(mes, nome, salario);
	}
	
	public String mostrarFolhaPagamento(String mes){
		return fin.emitirFolha(mes);
	}
	
	public void criarProfessor(String nome, int tempoCasa){
		professores.add(new Professor(nome, tempoCasa));
	}
	
	public void addDisciplinaProfessor(String nome, String disciplina) throws Exception{
		for(int i = 0; i < professores.size(); i++){
			if(professores.get(i).getNome() == nome){
				professores.get(i).addDisciplina(disciplina);;
			}else{
				throw new Exception ("Professor informado não está cadastrado.");
			}
		}
			
		
	}
	
	public String infoProfessor(String nome){
		for(int i = 0; i < professores.size(); i++){
			if(professores.get(i).getNome() == nome){
				return professores.get(i).toString();
			}
		}
			
		return "Professor informado não está cadastrado.";
	}
	
	public void criarAluno(String nome, double mensalidade){
		alunos.add(new Aluno(nome, mensalidade));
	}
	
	public void addDisciplinaAluno(String nome, String disciplina) throws Exception{
		for(int i = 0; i < alunos.size(); i++){
			if(alunos.get(i).getNome() == nome){
				alunos.get(i).addDisciplina(disciplina);;
			}else{
				throw new Exception ("Aluno informado não está cadastrado.");
			}
		}
			

	}
	
	public String mostrarAluno(String nome){
		for(int i = 0; i < alunos.size(); i++){
			if(alunos.get(i).getNome() == nome){
				return alunos.get(i).toString();
			}
		}
			
		return "Professor informado não está cadastrado.";
	}
	
	public void adicionarAoEstoque(String produto, String quantidade){
		almox.inserirNoEstoque(produto, quantidade);
	}
	
	public String mostrarEstoque(){
		return "ESTOQUE:\nProdutos - Quantidade\n" + almox.emitirEstoque();
	}
	
	public void criarPedido(String produto, String valor){
		almox.inserirPedido(produto, valor);
	}
	
	public String mostrarPedidos(){
		return "PEDIDOS:\nPedidos - Valor em R$\n" + almox.emitirPedidos();
	}
	
	public void adicionarSala(String local){
		salas.add(new Sala(local));
	}
	
	public String mostrarSalas(){
		StringBuilder info = new StringBuilder();
		info.append("Salas alocadas:\n");
		if(salas.size() == ZERO){
			info.append("Não há salas alocadas.");
		}else{
			for (int i = 0; i < salas.size(); i++) {
				info.append(salas.get(i).getLocalizacao() + "\n");
			}
		}
		return info.toString();
	}
}
