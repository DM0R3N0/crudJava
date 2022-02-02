package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

//MVC
/*
 * Model
 * View
 * Controller
 */

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Simone Moreno");
		contato.setIdade(37);
		contato.setDataCadastro(new Date());
		
		//Chamada do metodo salvar (CREATE)
		//contatoDao.save(contato);
		
		//Atualizar registro (UPDATE)
		Contato c1 = new Contato();
		c1.setNome("Anne Elise Moreno");
		c1.setIdade(1);
		c1.setDataCadastro(new Date());
		c1.setId(1); //PK registrada no BD
		
		//Chamada do metodo atualizar
		//contatoDao.update(c1);
		
		//Chamada do metodo deletarById (DELETE)
		contatoDao.deleteById(4);
		
		//Visualização dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}