package ui;

import javax.swing.*;
import java.awt.*;

public class FaculdadeFrame extends JFrame {
    public void defaultConfigurations() {

        // Faz com que a janela seja iniciado no centro da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        // Visível ao usuário
        this.setVisible(true);
    }
}
