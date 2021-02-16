package SeleniumAuto;

import javax.swing.JOptionPane;

/*
 * @Author Diego Lins 15/02/2021
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite qual navegador vc quer\n1- Internet Explorer\n2- Google Chrome\n99- Sair"));

		try {
			while (a != 99) {
				Eventos browser = new Eventos();
				if (a == 1) {
					browser.AbrirNavegador("www.google.com.br", "IE"); // chamadas das paginas
					a = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Digite qual navegador vc quer\n1- Internet Explorer\n2- Google Chrome\n99- Sair"));
				} else if (a == 2) {
					browser.AbrirNavegador("https://www.google.com.br", "chrome"); // chrome é obrigado usar https para funcionar//
					a = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Digite qual navegador vc quer\n1- Internet Explorer\n2- Google Chrome\n99- Sair"));
				}
			}
		} catch (Exception e) {
			System.out.println("Erro não esperado: " + e);
		}
	}

}
