package lab8p2_emiliocantarero_12111141;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminPartida {

    private ArrayList<Partida> partidas = new ArrayList();
    private File binario = null;

    public AdminPartida(String path) {
        binario = new File(path);
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public File getBinario() {
        return binario;
    }

    public void setBinario(File binario) {
        this.binario = binario;
    }

    public void cargarArchivo() throws FileNotFoundException, IOException {
        try {
            partidas = new ArrayList();
            Partida temp;
            if (binario.exists()) {
                FileInputStream fs = new FileInputStream(binario);
                ObjectInputStream os = new ObjectInputStream(fs);
                try {
                    while ((temp = (Partida) os.readObject()) != null) {
                        partidas.add(temp);
                    }
                } catch (EOFException e) {
                    
                }
                os.close();
                fs.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void escribirArchivo() {
        FileOutputStream fs = null;
        ObjectOutputStream os = null;
        try {
            fs = new FileOutputStream(binario);
            os = new ObjectOutputStream(fs);
            for (Partida p : partidas) {
                os.writeObject(p);
            }
            os.flush();
        } catch (Exception e) {
        } finally {
            try {
                os.close();
                fs.close();
            } catch (Exception e) {
            }
        }
    }

}
