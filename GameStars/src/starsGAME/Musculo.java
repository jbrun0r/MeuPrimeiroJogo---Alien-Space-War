package starsGAME;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Musculo extends JPanel implements ActionListener {
	private Image ImagemFundo;
	private Mente mente;
	private Timer timer;
	private List<Inimigo> inimigo;
	private List<Stars> stars;
	private boolean emJogo;

	public Musculo() {
		setFocusable(true);
		setDoubleBuffered(true);

		ImageIcon Referencia = new ImageIcon(Musculo.class.getResource("/imagens/ImagemFundo.png"));
		ImagemFundo = Referencia.getImage();

		mente = new Mente();
		mente.load();

		addKeyListener(new TecladoAdapter());

		timer = new Timer(5, this);
		timer.start();
		
		inicializaInimigos();
		inicializaStars();
		emJogo = true;
	}
	
	public void inicializaInimigos() {
		int cordernadas[] =  new int[100];
		inimigo = new ArrayList<Inimigo>();
		
		for(int i = 0; i < cordernadas.length; i++) {
			int x = (int)(Math.random() * 8000 + 1000);
			int y = (int)(Math.random() * 650 + 30);
			inimigo.add(new Inimigo(x, y));
		}
	}
	
	public void inicializaStars() {
		int cordernadas[] =  new int[500];
		stars = new ArrayList<Stars>();
		for(int i = 0; i < cordernadas.length; i++) {
			int x = (int)(Math.random() * 1000 + 0);
			int y = (int)(Math.random() * 700 + 0);
			stars.add(new Stars(x, y));
		}
	}
	public void paint(Graphics Graficos) {
		Graphics2D graficos = (Graphics2D) Graficos;
		if(emJogo==true) {
			graficos.drawImage(ImagemFundo, 0, 0, null);
			
			for (int c = 0; c < stars.size(); c++) {
				Stars q = stars.get(c);
				q.load();
				graficos.drawImage(q.getImagem(), q.getX(), q.getY(), this);
			}
			
			graficos.drawImage(mente.getImagem(), mente.getX(), mente.getY(), this);

			List<Tiro> tiros = mente.getTiros();
			for (int i = 0; i < tiros.size(); i++) {
				Tiro m = tiros.get(i);
				m.load();
				graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
			}
			
			for(int j=0; j < inimigo.size(); j++) {
				Inimigo in = inimigo.get(j);
				in.load();
				graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
			}

		}else {
			ImageIcon fimJogo = new ImageIcon(Musculo.class.getResource("/imagens/gameover.png"));
			graficos.drawImage(fimJogo.getImage(), 0, 0, null);
			
			;
		}
		
		Graficos.dispose();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mente.update();
		
		for (int c = 0; c < stars.size(); c++) {
			Stars on = stars.get(c);
			if(on.isVisivel()) {
				on.update();
			}else {
				stars.remove(c);
			}
		}

		List<Tiro> tiros = mente.getTiros();
		for (int i = 0; i < tiros.size(); i++) {
			Tiro m = tiros.get(i);
			if (m.isVisivel()) {
				m.update();
			} else {
				tiros.remove(i);
			}
		}
		
		for(int j=0; j < inimigo.size(); j++) {
			Inimigo in = inimigo.get(j);
			if(in.isVisivel()) {
				in.update();
			}else {
				inimigo.remove(j);
			}
		}
		 
		checarColisoes();
		repaint();
	}
	
	public void checarColisoes() {
		Rectangle formaNave = mente.getBounds();
		Rectangle formaInimigo;
		Rectangle formaTiro;
		
		
		
		
		for(int k = 0; k < inimigo.size(); k++) {
			Inimigo tempInimigo = inimigo.get(k);
			formaInimigo = tempInimigo.getBounds();
			if(formaNave.intersects(formaInimigo)) {
				mente.setVisivel(false);
				tempInimigo.setVisivel(false);
				emJogo = false;
			}
		}
		
		List<Tiro> tiros = mente.getTiros();
		for(int l = 0; l < tiros.size(); l++) {
			Tiro tempTiro = tiros.get(l);
			
			
			formaTiro = tempTiro.getBounds();
			
			for(int b = 0; b<inimigo.size();b++) {
				Inimigo tempInimigo = inimigo.get(b);
				formaInimigo = tempInimigo.getBounds();
				if(formaTiro.intersects(formaInimigo)) {
					tempInimigo.setVisivel(false);
					tempTiro.setVisivel(false);
				}
			}
		}
	}
	

	private class TecladoAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent KEY) {
			mente.keyPressed(KEY);
		}

		@Override
		public void keyReleased(KeyEvent KEY) {
			mente.keyRelease(KEY);
		}
	}

}
