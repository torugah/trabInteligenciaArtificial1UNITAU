package grapichs;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JFrame;

public class Desenhar extends JFrame {

    public List<String> listaCidadesCaminho;

    public Desenhar(List<String> listaCidadesCaminho) {
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        this.listaCidadesCaminho = listaCidadesCaminho;
    }

    public void paint(Graphics g) {

        g.drawOval(1530, 980, 20, 20); // Ubatuba
        g.drawOval(1480, 750, 20, 20); // SaoLuiz
        g.drawOval(1290, 650, 20, 20); // Carapeva
        g.drawOval(1184, 540, 20, 20); // Taubate
        g.drawOval(1120, 320, 20, 20); // Caçapava
        g.drawOval(1090, 290, 20, 20); // São José
        g.drawOval(1180, 490, 20, 20); // Caçapava Velha
        g.drawOval(1030, 670, 20, 20); // Jardim São Judas
        g.drawOval(800, 620, 20, 20); // Paratei
        g.drawOval(1300, 1000, 20, 20); // Caraguá
        g.drawOval(1125, 870, 20, 20); // Barra da Vargina
        g.drawOval(1100, 780, 20, 20); // Paraibuna
        g.drawOval(1180, 970, 20, 20); // Salesópolis
        g.drawOval(1080, 860, 20, 20); // Mogi das Cruzes     
        g.drawOval(750, 865, 20, 20); // Suzano

        g.drawString("Ubatuba", 1550, 995); // Adicionei 20 a x e y
        g.drawString("São Luiz", 1500, 765); // Adicionei 20 a x e y
        g.drawString("Carapeva", 1310, 665); // Adicionei 20 a x e y
        g.drawString("Taubaté", 1204, 555); // Adicionei 20 a x e y
        g.drawString("Caçapava", 1140, 335); // Adicionei 20 a x e y
        g.drawString("São José", 1110, 305); // Adicionei 20 a x e y
        g.drawString("Caçapava Velha", 1200, 510); // Adicionei 20 a x e y
        g.drawString("Jardim São Judas", 1050, 690); // Adicionei 20 a x e y
        g.drawString("Paratei", 820, 640); // Adicionei 20 a x e y
        g.drawString("Caraguá", 1320, 1020); // Adicionei 20 a x e y
        g.drawString("Barra da Vargina", 1145, 890); // Adicionei 20 a x e y
        g.drawString("Paraibuna", 1120, 800); // Adicionei 20 a x e y
        g.drawString("Salesópolis", 1200, 990); // Adicionei 20 a x e y
        g.drawString("Mogi das Cruzes", 1100, 880); // Adicionei 20 a x e y
        g.drawString("Suzano", 770, 885); // Adicionei 20 a x e y

        for (int i = 0; i <= listaCidadesCaminho.size(); i++) {

            if (listaCidadesCaminho.get(i).equals("caragua") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
                g.drawLine(1310, 1010, 1135, 880);
            }
            if (listaCidadesCaminho.get(i).equals("caragua") && listaCidadesCaminho.get(i + 1).equals("ubatuba")) {
                g.drawLine(1310, 1010, 1540, 990);
            }
            if (listaCidadesCaminho.get(i).equals("mogiDasCruzes") && listaCidadesCaminho.get(i + 1).equals("suzano")) {
                g.drawLine(1090, 870, 760, 875);
            }
            if (listaCidadesCaminho.get(i).equals("mogiDasCruzes") && listaCidadesCaminho.get(i + 1).equals("salesopolis")) {
                g.drawLine(1090, 870, 1190, 980);
            }
            if (listaCidadesCaminho.get(i).equals("saoLuiz") && listaCidadesCaminho.get(i + 1).equals("ubatuba")) {
                g.drawLine(1490, 760, 1540, 990);
            }
            if (listaCidadesCaminho.get(i).equals("saoLuiz") && listaCidadesCaminho.get(i + 1).equals("carapeva")) {
                g.drawLine(1490, 760, 1300, 660);
            }
            if (listaCidadesCaminho.get(i).equals("carapeva") && listaCidadesCaminho.get(i + 1).equals("saoLuiz")) {
                g.drawLine(1300, 660, 1490, 760);
            }
            if (listaCidadesCaminho.get(i).equals("carapeva") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
                g.drawLine(1300, 660, 1194, 550);
            }
            if (listaCidadesCaminho.get(i).equals("saoJose") && listaCidadesCaminho.get(i + 1).equals("cacapava")) {
                g.drawLine(1100, 300, 1130, 330);
            }
            if (listaCidadesCaminho.get(i).equals("saoJose") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
                g.drawLine(1100, 300, 810, 630);
            }
            if (listaCidadesCaminho.get(i).equals("paraibuna") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
                g.drawLine(1110, 790, 1040, 680);
            }
            if (listaCidadesCaminho.get(i).equals("paraibuna") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
                g.drawLine(1110, 790, 1135, 880);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("saoJose")) {
                g.drawLine(810, 630, 1100, 300);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
                g.drawLine(810, 630, 1040, 680);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("suzano")) {
                g.drawLine(810, 630, 760, 875);
            }
            if (listaCidadesCaminho.get(i).equals("suzano") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
                g.drawLine(760, 875, 810, 630);
            }
            if (listaCidadesCaminho.get(i).equals("suzano") && listaCidadesCaminho.get(i + 1).equals("mogiDasCruzes")) {
                g.drawLine(760, 875, 1090, 870);
            }
            if (listaCidadesCaminho.get(i).equals("cacapavaVelha") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
                g.drawLine(1190, 500, 1194, 550);
            }
            if (listaCidadesCaminho.get(i).equals("cacapavaVelha") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
                g.drawLine(1190, 500, 1040, 680);
            }
            if (listaCidadesCaminho.get(i).equals("salesopolis") && listaCidadesCaminho.get(i + 1).equals("mogiDasCruzes")) {
                g.drawLine(1190, 980, 1090, 870);
            }
            if (listaCidadesCaminho.get(i).equals("salesopolis") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
                g.drawLine(1190, 980, 1135, 880);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("carapeva")) {
                g.drawLine(1194, 550, 1300, 660);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("cacapava")) {
                g.drawLine(1194, 550, 1130, 330);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("cacapavaVelha")) {
                g.drawLine(1194, 550, 1190, 500);
            }
            if (listaCidadesCaminho.get(i).equals("cacapava") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
                g.drawLine(1130, 330, 1194, 550);
            }
            if (listaCidadesCaminho.get(i).equals("cacapava") && listaCidadesCaminho.get(i + 1).equals("saoJose")) {
                g.drawLine(1130, 330, 1100, 300);
            }
            if (listaCidadesCaminho.get(i).equals("ubatuba") && listaCidadesCaminho.get(i + 1).equals("saoLuiz")) {
                g.drawLine(1540, 990, 1490, 760);
            }
            if (listaCidadesCaminho.get(i).equals("ubatuba") && listaCidadesCaminho.get(i + 1).equals("caragua")) {
                g.drawLine(1540, 990, 1310, 1010);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("paraibuna")) {
                g.drawLine(1135, 880, 1110, 790);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("salesopolis")) {
                g.drawLine(1135, 880, 1190, 980);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("caragua")) {
                g.drawLine(1135, 880, 1310, 1010);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
                g.drawLine(1040, 680, 810, 630);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("cacapavaVelha")) {
                g.drawLine(1040, 680, 1190, 500);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("paraibuna")) {
                g.drawLine(1040, 680, 1110, 790);
            }

        }

    }

}
