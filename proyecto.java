import javax.swing.*;

public class BurbujaPasoAPaso {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};

        JOptionPane.showMessageDialog(null, "Arreglo original: " + arrayToString(numeros));

        burbujaPasoAPaso(numeros);
