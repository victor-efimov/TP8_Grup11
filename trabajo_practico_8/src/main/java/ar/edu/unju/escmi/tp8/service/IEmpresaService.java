package ar.edu.unju.escmi.tp8.service;

import java.util.List;
import ar.edu.unju.escmi.tp8.model.Empresa;

public interface IEmpresaService {
	void guardarEmpresa(Empresa empresa);
	List<Empresa> obtenerEmpresas();
	void modificarEmpresa(Empresa empresa);
	void eliminarEmpresa(int id);
	Empresa buscarEmpresaId(int id);
}