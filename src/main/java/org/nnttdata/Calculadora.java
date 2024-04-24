package org.nnttdata;

public class Calculadora {
    private int a;
    private int b;

    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sumar(){
        return a + b;
    }

    public int restar(){
        return a - b;
    }

    public float dividir() {
        float resultado = 0.0f;
        if (b == 0) {
            System.out.println("El divisor no puede ser 0");
        }else {
            resultado = a / b;
        }
        return resultado;
    }

    public int multiplicar(){
        return a * b;
    }

    public boolean verificar(int num){
        if (num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public int sumatoria(int inicio, int fin){
        int valor = inicio;
        for(int j = 1; j<=fin; j++){
            valor = valor + 1;
        }
        return valor;
    }

    public String parImpar (int valor){
        if(verificar(valor)){
            return "Es par";
        }else{
            return  "Es impar";
        }
    }
}
