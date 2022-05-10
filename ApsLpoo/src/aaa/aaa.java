package aaa;

import javax.swing.JOptionPane;

public class aaa {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Tente advinha em qual letra estou pensando (OBS: Letra minúscula)",
				"Contador", JOptionPane.WARNING_MESSAGE);

		Boolean verificador = true;
		String letra = "a";
		int erros = 0;
		String tent = JOptionPane.showInputDialog("Digite uma letra: ");

		while (verificador) {

			if (tent.equals(letra)) {

				verificador = false;
			} else {

				JOptionPane.showMessageDialog(null, "Erroouuu '" + tent + "' não era a letra em que estava pensando");

				String tent1 = JOptionPane.showInputDialog("Tente novamente: (OBS: Letra minúscula)");
				erros = erros + 1;
				tent = tent1;

			}
		}
		JOptionPane.showMessageDialog(null, "Parabéns voçe acertou - seu número de tentativas foi " + erros
				+ "\n\nObrigado por utilizar\nFeito por Lincoln Ronny");

	}

}
