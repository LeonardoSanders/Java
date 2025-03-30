package NivelIntermediario.ENUMS;

public enum RankMissoes {
    E ("Fácil", 1),
    D ("Normal", 2),
    C ("Moderada", 3),
    B ("Dificil", 4),
    A ("Muito Dificil", 5),
    S ("Especial", 10);

    private String Dificuldade;
    private int Nivel;

    RankMissoes(String dificuldade, int nivel) {
        Dificuldade = dificuldade;
        Nivel = nivel;
    }

    public String getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        Dificuldade = dificuldade;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }
}
