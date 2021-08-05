package VerificarCPF;

import javax.swing.JOptionPane;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msgIni = "Entre com o número do CPF ";
		msgIni += "\n(Sem caracteres especiais: pontos e traços): ";
		String inCpf = JOptionPane.showInputDialog(null, msgIni, "CPF:", JOptionPane.PLAIN_MESSAGE);

		if (!(inCpf==null)) {

			PessoaFisica p1 = new PessoaFisica();
			p1.setNome("Marcelino Carioquinha");
			p1.setCpf(inCpf); 
			// CPF: 034.543.987-54
			//------------------------------------------------------
			// fazer o teste com algum número de CPF válido
			String txtFinal = "";
			txtFinal += "\nNome: " + p1.getNome();
			txtFinal += "\nCPF: " + p1.getCpf();
			System.out.println(txtFinal);
		}
		System.out.println("Programa finalizado");
	}
}