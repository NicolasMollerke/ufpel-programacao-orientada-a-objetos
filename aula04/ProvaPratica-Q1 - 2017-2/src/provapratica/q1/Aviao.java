/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapratica.q1;

/**
 *
 * @author nicol
 */
public class Aviao {
    private int numeroAviao;
    private Data data;
    protected boolean[] assentos = new boolean[300];
            
    public Aviao (int numero, Data data) {
        this.numeroAviao = numero;
        this.data = data;
        for (int i=0; i < assentos.length; i++){
            assentos[i] = false;
        }
    }
    
    public int getNumero() {
        return numeroAviao;
    }
    
    public Data getData() {
        return data;
    }
    
    public int proximoLivre (){
        for (int i=0; i < assentos.length; i++){
            if (assentos[i] == false){
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean verifica (int num) {
        if (!assentos[num]){
            return false;
        }
        
        return true;
    }
    
    public boolean ocupa (int num) {
        if (!verifica(num)) {
            assentos[num] = true;
            return true;
        }
        return false;
    }
    
    public int vagas () {
        int cont = 0;
        
        for (int i=0; i < assentos.length; i++){
            if (!verifica(i)){
                cont++;
            }
        }
        return cont;
    }
}
