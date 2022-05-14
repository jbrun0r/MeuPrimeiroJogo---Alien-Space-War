package starsGAME;

import javax.swing.JFrame;

public class Alma extends JFrame {
	
	public Alma() {
		
		add(new Musculo());
		setTitle("S.T.A.R.S");								//TÍtulo do FRAME
		setSize(1000,700);									//Size FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//HABILITA dead FRAME
		setLocationRelativeTo(null);						//FRAME centralizado
		this.setResizable(false);							//Não ampliar TELA FRAME
		setVisible(true);
	}
	
	public static void main(String []args) {
		new Alma();
	}
}
