import javax.swing.*;
import java.awt.*;

public class LabelImagem extends JFrame {
    JLabel imagem;
    public LabelImagem(){
        super("Uso da classe JLabel com Imagem");
        Container Containertela = getContentPane();
        ImageIcon icone = new ImageIcon("src/sapo.jpeg");
        imagem = new JLabel(icone);
        tela.add(imagem);
        setSize(500,460);
        setVisible(true);
    }
    
    public static void main(String args[]){
        LabelImagem app = new LabelImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

