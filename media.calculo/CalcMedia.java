import javax.swing.*;

public class CalcMedia {
    public static void main(String[] args) {
        int vetSoma [] , i, somar = 0;
        vetSoma = new int [3];
        int media = 0;
        for(i = 0 ; i <= 2 ; i++){
            vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            somar = somar + vetSoma[i];
            media += vetSoma[i];
        }
        float total = (float)media /  vetSoma.length ;
        System.out.println("A soma dos 3 valores é: " + somar + " e sua média é: " + total );
    }
}
