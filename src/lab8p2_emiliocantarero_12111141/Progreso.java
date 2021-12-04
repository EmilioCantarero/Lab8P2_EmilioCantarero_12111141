package lab8p2_emiliocantarero_12111141;

import javax.swing.JProgressBar;


public class Progreso implements Runnable{

    private JProgressBar barra;
    private boolean empezar;
    private boolean vive;
    
    public Progreso(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
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
    
    
    @Override
    public void run() {
        while(vive){
            if (empezar){
                barra.setValue
            }
        }
    }
    
}
