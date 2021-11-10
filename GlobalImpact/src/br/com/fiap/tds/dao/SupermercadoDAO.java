package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.exception.IdNotFoundException;
import br.com.fiap.tds.to.SupermercadoTO;

public interface SupermercadoDAO {
	
	void cadastrar(SupermercadoTO supermercado) throws SQLException;
	
	void atualizar(SupermercadoTO supermercado) throws IdNotFoundException, SQLException;
	
	void remover(int codigo) throws SQLException, IdNotFoundException;
	
	SupermercadoTO buscar(int codigo) throws IdNotFoundException, SQLException;
	
	List<SupermercadoTO> listar() throws SQLException;

	

}
