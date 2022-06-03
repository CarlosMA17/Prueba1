import java.util.ArrayList;

public class Impresora {
    public boolean esatdo;
    public ArrayList colaImpresion = new ArrayList();

    public Impresora(boolean esatdo) {
        this.esatdo = esatdo;
    }

    public Impresora(boolean esatdo, ArrayList colaImpresion) {
        this.esatdo = esatdo;
        this.colaImpresion = colaImpresion;
    }

    public boolean isEsatdo() {
        return esatdo;
    }

    public void setEsatdo(boolean esatdo) {
        this.esatdo = esatdo;
    }

    public ArrayList getColaImpresion() {
        return colaImpresion;
    }

    public void setColaImpresion(ArrayList colaImpresion) {
        this.colaImpresion = colaImpresion;
    }

    public void encender() {
        esatdo = true;
    }

    public void apagar() {
        esatdo = false;
    }

    public void añadirTrabajo(Documento doc) {
        if (esatdo==true) {
            colaImpresion.add(doc);
        }
        else if (esatdo==false) {
            System.out.println("la maquina esta apagada");
        }
    }

    public void eliminarTrabajo(Documento doc) {
        if (esatdo==true) {
            colaImpresion.remove(doc);
        }
        else {
            System.out.println("la maquina esta apagada");
        }
    }

    public void eliminarLista() {
        if (esatdo==true) {
            for (int i = 0; i <colaImpresion.size() ; i++) {
                colaImpresion.removeAll(colaImpresion);
            }
        }
    }

    @Override
    public String toString() {
        if (esatdo==true) {
            return "Impresora :" +
                    "esatdo = encendido" +
                    ", Trabajos =" + colaImpresion;
        }
        else {
            return "la impresora esta apagada";
        }
    }
}
