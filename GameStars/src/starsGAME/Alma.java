package starsGAME;

import javax.swing.JFrame;

public class Alma extends JFrame {
	
	public Alma() {
		
		add(new Musculo());
		setTitle("S.T.A.R.S");								//T�tulo do FRAME
		setSize(1000,700);									//Size FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//HABILITA dead FRAME
		setLocationRelativeTo(null);						//FRAME centralizado
		this.setResizable(false);							//N�o ampliar TELA FRAME
		setVisible(true);
	}
	
	public static void main(String []args) {
		new Alma();
	}
}
