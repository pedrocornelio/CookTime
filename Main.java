package application;

import java.util.Scanner;
import entities.Usuario;
import entities.Ingredientes;
import entities.LivroDeReceitas;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Usuario user = new Usuario();
		Ingredientes ingrediente = new Ingredientes();
		LivroDeReceitas livro = new LivroDeReceitas();
		
		
		
		// SOMENTE PARA TESTES:
		System.out.print("Nome de usuário: ");
		String name = sc.nextLine();
		user.setName(name);
		System.out.print("Digite sua Senha: ");
		String senha = sc.nextLine();
		user.setSenha(senha);
		System.out.print("Digite seu Email: ");
		String email = sc.nextLine();
		user.setEmail(email);

		System.out.println();
		System.out.println("Nome:	" + user.getName());
		System.out.println("Email:	" + user.getEmail());
		System.out.println("Senha:	" + user.getSenha());

		sc.close();

	}

}
