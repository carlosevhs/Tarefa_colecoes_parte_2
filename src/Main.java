import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoasFem = new ArrayList<>();
        List<Pessoa> pessoasMasc = new ArrayList<>();

        System.out.println("Adicione pessoas à lista (digite 'fim' para parar):");
        while (true) {
            System.out.print("Nome da pessoa: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Sexo da pessoa (Digite M para masculino ou F para feminino): ");
            char sexo = scanner.nextLine().charAt(0);
            while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f' ) {
                System.out.print("Caracter incorreto! Digite M para masculino ou F para feminino: ");
                sexo = scanner.nextLine().charAt(0);

            }
            if (sexo == 'M' || sexo == 'm'){
                pessoasMasc.add((new Pessoa(nome,sexo)));
            } else {
                pessoasFem.add(new Pessoa(nome, sexo));
            }
            System.out.println("Adicione pessoas à lista (digite 'fim' para parar):");

        }
        System.out.println("\nPessoas Masculinas:");
        for (Pessoa pessoa : pessoasMasc) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("\nPessoas Femininas:");
        for (Pessoa pessoa : pessoasFem) {
            System.out.println(pessoa.getNome());
        }

    }
}