package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp8.model.Empresa;

public class CollectionEmpresa {
    public static List<Empresa> empresas = new ArrayList<>();

    public static void precargarEmpresas() {
        if (empresas.isEmpty()) {
            empresas.add(new Empresa(0, "Empresa ejemplo", 000, "388-99999", "Av. Bolivia"));
            empresas.add(new Empresa(1, "Minera Sur", 120, "388-4112233", "Av. Bolivia 100"));
            empresas.add(new Empresa(2, "Tecno Jujuy", 45, "388-4223344", "Belgrano 250"));
        }
    }
}