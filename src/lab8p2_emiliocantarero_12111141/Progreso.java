package lab8p2_emiliocantarero_12111141;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;


public class Progreso extends Thread{
    private JLabel Estrella;
    private JLabel jugador;
    private JLabel distanciaR;
    private JLabel distanciaT;
    private JProgressBar barra;
    
    private boolean empezar;
    private boolean vive;
    private boolean flag;
    private DefaultTableModel m;
    
    public Progreso(JLabel Estrella, JLabel jugador, DefaultTableModel m,JLabel distanciaR, JLabel distanciaT, JProgressBar barra) {
        this.Estrella=Estrella;
        this.jugador=jugador;
        this.m=m;
        this.distanciaR=distanciaR;
        this.distanciaT=distanciaT;
        this.barra=barra;
        empezar=true;
        vive=true;
        flag=false;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    
    public Progreso(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isEmpezar() {
        return empezar;
    }

    public void setEmpezar(boolean empezar) {
        this.empezar = empezar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    
    
    @Override
    public void run() {
        int cont=0;
        while(vive){
            
            if (empezar){
                m.setValueAt("Jugando", cont, 4);
                distanciaT.setText(String.valueOf(m.getValueAt(cont, 3)));
                int distanciaTo=Integer.valueOf(distanciaT.getText());
                barra.setMaximum(distanciaTo);
                int distancia=Integer.parseInt(distanciaR.getText());
                if (barra.getValue()>0){
                    distancia=barra.getValue();
                }
                barra.setValue((int) (distancia+Double.parseDouble(m.getValueAt(cont, 1).toString())));
                distanciaR.setText(String.valueOf(barra.getValue()));
                if (barra.getValue()>=barra.getMaximum()){
                    jugador.setText("");
                    Estrella.setText("");
                    distanciaT.setText("");
                    m.setValueAt("Finalizado", cont, 4);
                    distanciaR.setText("0");
                    barra.setValue(0);
                    cont++;
                    if (cont>=m.getRowCount()){
                        vive=false;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    
    
}
