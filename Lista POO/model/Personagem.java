package model;

public class Personagem {
    protected String nome;
    protected String classe;
    protected int nivel;
    protected double vida;

    public Personagem(String nome, String classe, int nivel, double vida) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = 100.0;
    }

    public void atacar(double dano) {
        // vida -= dano;
        this.vida = vida - dano;

        if (vida < 0) {
            this.vida = 0;
            System.out.println("Voce morreu");
        } else {
            System.out.println("Você recebeu" + dano + "de dano, Sua vida atual é: " + vida);
        }
    }

    public void descansar(int horas) {
        this.vida = vida + (horas * 5);

        if (vida >= 100) {
            this.vida = 100;
            System.out.println("Sua vida está cheia");
        } else {
            System.out.println("Você aumentou sua vida em: " + horas * 5 + ". Sua vida agora é: " + vida);
        }
    }

    public void usarHabilidade() {
        System.out.println("O personagem está usando uma habilidade: ");
    }
}