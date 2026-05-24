/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapratica.q1;

/**
 *
 * @author nicol
 */
public class AviaoPremium extends Aviao {
    
    protected int max;
    private int assentosPremium;
    
    public AviaoPremium(int numero, Data data, int max, int assentosPremium) {
        super(numero, data);
        this.max = max;
        this.assentosPremium = assentosPremium;
        this.assentos = new boolean[max];
        for (int i=0; i < assentos.length; i++){
            assentos[i] = false;
        }
    }
    
    public int maxVagas () {
        return max;
    }
    
    public int cadeirasPremium () {
        return assentosPremium;
    }
    
    public char tipo (int num) {
        if (num < assentosPremium){
            return 'P';
        }
        
        return 'C';
    }
    
    @Override
    public int proximoLivre () {
         for (int i = assentosPremium; i < max; i++){
             if (!verifica(i)){
                return i;
            }
         }
         
         return -1;
    }
    
    public int proximoPremiumLivre () {
    
        for (int i = 0; i < assentosPremium; i++){
             if (!verifica(i)){
                return i;
            }
         }
         
         return -1;
    }
}
    
