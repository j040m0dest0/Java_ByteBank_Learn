public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	
	public Conta(int agencia, int numero) {
		
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Uma conta foi criada com o numero : " + numero + " e agência : " + agencia);
		System.out.println("Total de contas criadas é " + total);
	}
	
	
	public void deposita(double valor) {
		
		
		System.out.println("estamos realizando o deposito de " + valor + " na conta do senhor(a) " + titular);
		
		this.saldo += valor;
		
	}
	
	public boolean saca (double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			System.out.println("Foi realizado o saque de " + valor);
			return true;
			
		}else {
			System.out.println("não foi possivel realizar o saque por falta de saldo na conta");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino){
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			
			System.out.println("Estamos realizando um deposito da conta do " + this.titular + " para a conta do (a) " + destino.titular);
						
			destino.deposita(valor);
			
			return true;	
				
		}else {
			System.out.println("não foi possivel realizar o deposito por falta de saldo na conta");
			return false;
		}
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		
		if(numero <= 0 ) {
			
			System.out.println("não esta autorizado a criação de numeros negativos");
			return;
		}
	
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia <= 0 ) {
		
			System.out.println("não esta autorizado a criação de agencias negativas");
			return;
		}
		
		this.agencia = agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}