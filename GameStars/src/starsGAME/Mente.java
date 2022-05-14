package starsGAME;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Mente {
	private int x, y, dx, dy, altura, largura;
	private Image Imagem;
	private List<Tiro> tiros;
	private boolean isVisivel;
	
	public Mente() {
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		
		tiros = new ArrayList<Tiro>();
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon(Mente.class.getResource("/imagens/Nave.png"));
		Imagem = referencia.getImage();
		altura = Imagem.getHeight(null);
		largura = Imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}

	public void tiroSimples() {
		this.tiros.add(new Tiro(x+largura, y+(altura/2)));
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,largura,altura);
	}
	
	public void keyPressed(KeyEvent Key) {
		int codeKEY = Key.getKeyCode();
		
		if(codeKEY == KeyEvent.VK_SPACE) {
			tiroSimples();
		}
		if(codeKEY == KeyEvent.VK_UP) {
			dy = -3;
		}
		if(codeKEY == KeyEvent.VK_DOWN) {
			dy = 3;
		}
		if(codeKEY == KeyEvent.VK_LEFT) {
			dx = -3;
		}
		if(codeKEY == KeyEvent.VK_RIGHT) {
			dx = 3;
		}	
	}
	
	
	public void keyRelease(KeyEvent Key) {
		int codeKEY = Key.getKeyCode();
		
		if(codeKEY == KeyEvent.VK_UP) {
			dy = 0;
		}
		if(codeKEY == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		if(codeKEY == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if(codeKEY == KeyEvent.VK_RIGHT) {
			dx = 0;
		}	
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return Imagem;
	}

	public List<Tiro> getTiros() {
		return tiros;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}


	
	
	
	
	
}














