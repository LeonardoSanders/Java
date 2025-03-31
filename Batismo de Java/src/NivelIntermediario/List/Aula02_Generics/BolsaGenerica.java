package NivelIntermediario.List.Aula02_Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

//    Colocar equipamentos genericos
    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void mostrarConteudo() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
