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
        g.drawOval(1000, 860, 20, 20); // Mogi das Cruzes     
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
        g.drawString("Mogi das Cruzes", 1020, 880); // Adicionei 20 a x e y
        g.drawString("Suzano", 770, 885); // Adicionei 20 a x e y

        for (int i = 0; i <= listaCidadesCaminho.size(); i++) {

            if (listaCidadesCaminho.get(i).equals("caragua") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
            g.drawLine(1290, 990, 1115, 860);
            }
                if (listaCidadesCaminho.get(i).equals("caragua") && listaCidadesCaminho.get(i + 1).equals("ubatuba")) {
            g.drawLine(1290, 990, 1520, 970);
            }
            if (listaCidadesCaminho.get(i).equals("mogiDasCruzes") && listaCidadesCaminho.get(i + 1).equals("suzano")) {
            g.drawLine(1070, 850, 740, 855);
            }
            if (listaCidadesCaminho.get(i).equals("mogiDasCruzes") && listaCidadesCaminho.get(i + 1).equals("salesopolis")) {
            g.drawLine(1070, 850, 1170, 960);
            }
            if (listaCidadesCaminho.get(i).equals("saoLuiz") && listaCidadesCaminho.get(i + 1).equals("ubatuba")) {
            g.drawLine(1470, 740, 1520, 970);
            }
            if (listaCidadesCaminho.get(i).equals("saoLuiz") && listaCidadesCaminho.get(i + 1).equals("carapeva")) {
            g.drawLine(1470, 740, 1280, 640);
            }
            if (listaCidadesCaminho.get(i).equals("carapeva") && listaCidadesCaminho.get(i + 1).equals("saoLuiz")) {
            g.drawLine(1280, 640, 1470, 740);
            }
            if (listaCidadesCaminho.get(i).equals("carapeva") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
            g.drawLine(1280, 640, 1174, 530);
            }
            if (listaCidadesCaminho.get(i).equals("saoJose") && listaCidadesCaminho.get(i + 1).equals("cacapava")) {
            g.drawLine(890, 280, 1010, 310);
            }
            if (listaCidadesCaminho.get(i).equals("saoJose") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
            g.drawLine(890, 280, 590, 610);
            }
            if (listaCidadesCaminho.get(i).equals("paraibuna") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
            g.drawLine(1090, 770, 820, 660);
            }
            if (listaCidadesCaminho.get(i).equals("paraibuna") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
            g.drawLine(1090, 770, 1115, 860);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("saoJose")) {
            g.drawLine(590, 610, 890, 280);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
            g.drawLine(590, 610, 820, 660);
            }
            if (listaCidadesCaminho.get(i).equals("paratei") && listaCidadesCaminho.get(i + 1).equals("suzano")) {
            g.drawLine(590, 610, 740, 855);
            }
            if (listaCidadesCaminho.get(i).equals("suzano") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
            g.drawLine(740, 855, 590, 610);
            }
            if (listaCidadesCaminho.get(i).equals("suzano") && listaCidadesCaminho.get(i + 1).equals("mogiDasCruzes")) {
            g.drawLine(740, 855, 1070, 850);
            }
            if (listaCidadesCaminho.get(i).equals("cacapavaVelha") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
            g.drawLine(1030, 480, 1174, 530);
            }
            if (listaCidadesCaminho.get(i).equals("cacapavaVelha") && listaCidadesCaminho.get(i + 1).equals("jardimSaoJudas")) {
            g.drawLine(1030, 480, 820, 660);
            }
            if (listaCidadesCaminho.get(i).equals("salesopolis") && listaCidadesCaminho.get(i + 1).equals("mogiDasCruzes")) {
            g.drawLine(1170, 960, 1070, 850);
            }
            if (listaCidadesCaminho.get(i).equals("salesopolis") && listaCidadesCaminho.get(i + 1).equals("barraDaVargina")) {
            g.drawLine(1170, 960, 1115, 860);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("carapeva")) {
            g.drawLine(1174, 530, 1280, 640);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("cacapava")) {
            g.drawLine(1174, 530, 1010, 310);
            }
            if (listaCidadesCaminho.get(i).equals("taubate") && listaCidadesCaminho.get(i + 1).equals("cacapavaVelha")) {
            g.drawLine(1174, 530, 1030, 480);
            }
            if (listaCidadesCaminho.get(i).equals("cacapava") && listaCidadesCaminho.get(i + 1).equals("taubate")) {
            g.drawLine(1010, 310, 1174, 530);
            }
            if (listaCidadesCaminho.get(i).equals("cacapava") && listaCidadesCaminho.get(i + 1).equals("saoJose")) {
            g.drawLine(1010, 310, 890, 280);
            }
            if (listaCidadesCaminho.get(i).equals("ubatuba") && listaCidadesCaminho.get(i + 1).equals("saoLuiz")) {
            g.drawLine(1520, 970, 1470, 740);
            }
            if (listaCidadesCaminho.get(i).equals("ubatuba") && listaCidadesCaminho.get(i + 1).equals("caragua")) {
            g.drawLine(1520, 970, 1290, 990);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("paraibuna")) {
            g.drawLine(1115, 860, 1090, 770);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("salesopolis")) {
            g.drawLine(1115, 860, 1170, 960);
            }
            if (listaCidadesCaminho.get(i).equals("barraDaVargina") && listaCidadesCaminho.get(i + 1).equals("caragua")) {
            g.drawLine(1115, 860, 1290, 990);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("paratei")) {
            g.drawLine(820, 660, 590, 610);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("cacapavaVelha")) {
            g.drawLine(820, 660, 1030, 480);
            }
            if (listaCidadesCaminho.get(i).equals("jardimSaoJudas") && listaCidadesCaminho.get(i + 1).equals("paraibuna")) {
            g.drawLine(820, 660, 1090, 770);
            }

        }

    }

}
