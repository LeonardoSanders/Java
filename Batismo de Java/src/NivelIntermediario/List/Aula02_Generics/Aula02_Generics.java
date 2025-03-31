package NivelIntermediario.List.Aula02_Generics;

public class Aula02_Generics {
    public static void main(String[] args) {

        EquipamentoNinja kunai = new EquipamentoNinja("Kunai afiada");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken estrelada");
        EquipamentoNinja pergaminhoInvocacao =  new EquipamentoNinja("Pergaminho de Invocação");

        BolsaGenerica<EquipamentoNinja> bolsaEquipamentos = new BolsaGenerica<>();
        bolsaEquipamentos.adicionarEquipamentos(kunai);
        bolsaEquipamentos.adicionarEquipamentos(shuriken);
        bolsaEquipamentos.adicionarEquipamentos(pergaminhoInvocacao);
        bolsaEquipamentos.adicionarEquipamentos(new EquipamentoNinja("Kunai explosiva"));

        System.out.println(bolsaEquipamentos);
        bolsaEquipamentos.mostrarConteudo();
    }
}
