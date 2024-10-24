package Poli;

// Classe base Pessoa
class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome; // Atribui o nome da pessoa
    }

    public String enviarEmail(String mensagem) {
        // Envia um email padrão
        return "" + this.nome + "!\n\n" + mensagem; // Saudação básica
    }
}

// Subclasse Professor
class Piloto extends Pessoa {
    public Piloto(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    @Override
    public String enviarEmail(String mensagem) {
        // Personaliza a saudação para professores
        return "Fala " + this.nome + "!\n\n" + mensagem; // Inclui "Prof." na saudação
    }
}

// Subclasse Aluno
class Mhpessoa extends Pessoa {
    public Mhpessoa(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    @Override
    public String enviarEmail(String mensagem) {
        // Personaliza a saudação para alunos
        return "Sabe que vai perder " + this.nome + "!\n\n" + mensagem; // Inclui "Aluno" na saudação
    }
}

// Exemplo de uso
public class Polimorfismo {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("Ayrton Senna");
        Mhpessoa Mhpessoa = new Mhpessoa("Murillo");

        // Corrigindo as mensagens para usar os nomes
        String mensagemPiloto = piloto.enviarEmail("Opa " + Mhpessoa.nome + ", vamos dar uma acelerada hoje, meu pato"); // Mensagem pro professor
        String mensagemMhpessoa = Mhpessoa.enviarEmail("Voce já perdeu " + piloto.nome + ", se eu ganhar você paga a coca-cola, pao duro"); // Mensagem pro aluno

        // Mostra as mensagens
        System.out.println(mensagemPiloto);
        System.out.println(mensagemMhpessoa);
    }
}