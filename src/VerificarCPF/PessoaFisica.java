package VerificarCPF;

public class PessoaFisica {
	private String cpf = "Ainda não Informado";
	private String nome = null;
	
	private boolean cpfValido(String txtCpf) {
		boolean status = false;
		
		// Logica de validacao
		
		int sm = 0;
		for(int i = 0, j = 10; i < 9 && j >= 2; i++, j--) {
			String numero = String.valueOf(txtCpf.charAt(i));
			int numCPF = Integer.parseInt(numero) * j;
			sm += numCPF;
		}
		
		int digitoVerificador1 = 11 - (sm % 11);
		if (digitoVerificador1 > 9) {
			digitoVerificador1 = 0;
		}
		
		sm = 0;
		for(int i = 0, j = 11; i < 10 && j >= 2; i++, j--) {
			String numero = String.valueOf(txtCpf.charAt(i));
			int numCPF = Integer.parseInt(numero) * j;
			sm += numCPF;
		}
		
		int digitoVerificador2 = 11 - (sm % 11);
		if (digitoVerificador2 > 9) {
			digitoVerificador2 = 0;
		}
		
		String cpfCalculado = "";
		
		for(int i = 0; i < 9; i++) {
			cpfCalculado += String.valueOf(txtCpf.charAt(i));
		}
		
		cpfCalculado += String.valueOf(digitoVerificador1) + String.valueOf(digitoVerificador2);
		
		if (cpfCalculado.equals(txtCpf)) {
			status = true;
		}
	
		return status;
	}
	
	// Getters e Setters
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}
	//Validar
	public void setCpf(String cpf) {
		if (this.cpfValido(cpf)) {
			System.out.println("[CPF Válido!]");
			this.cpf = cpf;
		} else {
			System.out.println("[CPF Inválido - Digite o CPF novamente!]");
		}
	}
}