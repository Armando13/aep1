package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		Fisica pessoa1 = new Fisica("Lucas", "23432090675", "259372650");
		
		System.out.println ("id: " + pessoa1.getId() + ", nome: " + pessoa1.getNome() + ", RG: " +
		pessoa1.getRg() + ", CPF: " + pessoa1.getCpf());
		
		Juridica pessoaJur1 = new Juridica("Bruce Wayne", "4645434365746", 500);
		Juridica pessoaJur2 = new Juridica("Albert Hoffman", "64654344704", 250);
		
		Fisica pessoa2 = new Fisica("Dominnic Deccoco", "324465452", "876543245");
		Fisica pessoa3 = new Fisica("Antonio Margarithi", "654376543333", "212256543569");

		pessoaJur1.adicionarSocio(pessoa1, 50);
		
		pessoaJur1.adicionarSocio(pessoa2, 20);
		
		pessoaJur1.adicionarSocio(pessoaJur2, 21);

		pessoaJur1.adicionarSocio(pessoaJur1, 90);
		
		pessoaJur1.removerSocio(pessoa3);
		
		
		
		
		
		
		
		
		
	}

}
