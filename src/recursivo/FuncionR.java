/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivo;

/**
 *
 * @author solo1
 */
public class FuncionR {
    private int num;

    public FuncionR(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

    public static int invertir(int num, int inversion) {

        if (num == 0) {
            return inversion;
        }

        int ultimoDigito = num % 10;
        int noultimo = num / 10;
        inversion = (inversion * 10) + ultimoDigito;
        return invertir(noultimo, inversion);
    }

}
