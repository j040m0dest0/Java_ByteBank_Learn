
public class TestaGetSet {
	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1337, 22568);
		
		conta.setNumero(1337);
		
		System.out.println( conta.getNumero());
		
		Cliente joao = new Cliente();
		 		 
		 joao.setNome("joão modesto");
		 
		 conta.setTitular(joao);
		 
		 System.out.println(conta.getTitular().getNome());
		 
		 conta.getTitular().setProfissao("Programador");
		 
		 System.out.println(conta.getTitular().getProfissao());
		 
		
	}

}
