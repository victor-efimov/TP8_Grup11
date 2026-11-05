package ar.edu.unju.escmi.tp8.service.imp;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unju.escmi.tp8.collections.CollectionEmpresa;
import ar.edu.unju.escmi.tp8.model.Empresa;
import ar.edu.unju.escmi.tp8.service.IEmpresaService;

@Service
public class EmpresaServiceImp implements IEmpresaService {

    @Override
    public void guardarEmpresa(Empresa empresa) {
        CollectionEmpresa.empresas.add(empresa);
    }

    @Override
    public void eliminarEmpresa(int id) {
        CollectionEmpresa.empresas.removeIf(empresa -> empresa.getId() == id);
    }

    @Override
    public void modificarEmpresa(Empresa empresa) {
        for (int i = 0; i < CollectionEmpresa.empresas.size(); i++) {
            if (CollectionEmpresa.empresas.get(i).getId() == empresa.getId()) {
                CollectionEmpresa.empresas.set(i, empresa);
                return;
            }
        }
    }

    @Override
    public List<Empresa> obtenerEmpresas() {
        return CollectionEmpresa.empresas;
    }

    @Override
    public Empresa buscarEmpresaId(int id) {
        return CollectionEmpresa.empresas.stream()
                .filter(empresa -> empresa.getId() == id)
                .findFirst()
                .orElse(null);
    }
}