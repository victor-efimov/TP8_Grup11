package ar.edu.unju.escmi.tp8.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import ar.edu.unju.escmi.tp8.model.Empresa;
import ar.edu.unju.escmi.tp8.service.IEmpresaService;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final IEmpresaService empresaService;

    public EmpresaController(IEmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    // Obtener todas las empresas (GET /api/empresas)
    @GetMapping
    public List<Empresa> getAllEmpresas() {
        return empresaService.obtenerEmpresas();
    }

    // Obtener una empresa según ID (GET /api/empresas/{id})
    @GetMapping("/{id}")
    public Empresa getEmpresaById(@PathVariable int id) {
        return empresaService.buscarEmpresaId(id);
    }

    // Alta de una nueva empresa (POST /api/empresas)
    @PostMapping
    public Empresa crearEmpresa(@RequestBody Empresa nuevaEmpresa) {
        empresaService.guardarEmpresa(nuevaEmpresa);
        return nuevaEmpresa;
    }

    // Modificación completa de una empresa (PUT /api/empresas)
    @PutMapping
    public Empresa actualizarEmpresa(@RequestBody Empresa empresaModificada) {
        empresaService.modificarEmpresa(empresaModificada);
        return empresaModificada;
    }

    // Modificación parcial de una empresa (PATCH /api/empresas/{id})
    @PatchMapping("/{id}")
    public Empresa actualizarParcialEmpresa(@PathVariable int id, @RequestBody Empresa datosParciales) {
        Empresa existente = empresaService.buscarEmpresaId(id);
        if (existente != null) {
            if (datosParciales.getNombre() != null) existente.setNombre(datosParciales.getNombre());
            if (datosParciales.getCantidadEmpleados() > 0) existente.setCantidadEmpleados(datosParciales.getCantidadEmpleados());
            if (datosParciales.getTelefono() != null) existente.setTelefono(datosParciales.getTelefono());
            if (datosParciales.getDireccion() != null) existente.setDireccion(datosParciales.getDireccion());
            empresaService.modificarEmpresa(existente);
        }
        return existente;
    }

    // Baja de una empresa por ID (DELETE /api/empresas/{id})
    @DeleteMapping("/{id}")
    public void eliminarEmpresa(@PathVariable int id) {
        empresaService.eliminarEmpresa(id);
    }
}