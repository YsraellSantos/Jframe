package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabele extends AbstractTableModel {

	private static String[] colunas = {

			"Id", "CPF/CNPJ", "Nome", "Endere\u00E7o", "Telefone", "E-mail"
};
	private ArrayList<Cliente> clientes;
	
	

	public ModeloTabele(ArrayList<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	@Override
	public int getRowCount() {
		return clientes.size();
	}

	@Override
	public int getColumnCount() {

		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Cliente cliente = clientes.get(rowIndex);

		if (columnIndex == 0) { // Id
			return cliente.getId();
		} else if (columnIndex == 1) {
			return cliente.getCpfCnpj();
		} else if (columnIndex == 2) {
			return cliente.getNome();
		} else if (columnIndex == 0) {
			return cliente.getEndereco();
		} else if (columnIndex == 0) {
			return cliente.getTelefone();
		} else if (columnIndex == 0) {
			return cliente.getEmail();
		} else {
			return null;
		}
	}

}
