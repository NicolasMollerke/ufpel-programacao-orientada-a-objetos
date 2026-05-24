/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapratica.q1;

/**
 *
 * @author felipe
 */
public class ProvaPraticaQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao aviao;
        aviao = new Aviao(4188, new Data(26,2,2018));
        
        System.out.println("Numero do Aviao: " + aviao.getNumero());
        System.out.println("Data: " + aviao.getData());
        
        System.out.println("Proximo assento livre: " + aviao.proximoLivre());
        System.out.println("Assento ocupado: " + aviao.verifica(1));
        System.out.println(aviao.vagas() + "assentos disponiveis");
        
        aviao.ocupa(0);
        
        System.out.println("Proximo assento livre: " + aviao.proximoLivre());
        System.out.println("Assento ocupado: " + aviao.verifica(0));
        System.out.println(aviao.vagas() + "assentos disponiveis");
        
        AviaoPremium aviaoPremium;
        aviaoPremium = new AviaoPremium(4188, new Data(26,2,2018), 100, 20);
        
        System.out.println("Maximo de assentos: " + aviaoPremium.maxVagas());
        System.out.println("Assentos premium: " + aviaoPremium.cadeirasPremium());
        System.out.println("Assento: " + aviaoPremium.tipo(19));
        System.out.println("Proximo assento comum livre: " + aviaoPremium.proximoLivre());
        aviaoPremium.ocupa(20);
        System.out.println("Proximo assento comum livre: " + aviaoPremium.proximoLivre());



        
        
        
        
        
        // -- Verifica situação inicial ----------------------------------------
//        if (Verifica.situacao01(aviao))
//            System.out.println("A instância do Aviao foi criada de forma apropriada.");
//        else
//            System.out.println("Erro: a instância não foi inicializada de forma correta.");
//        
//        // -- Verifica situação intermediaria ----------------------------------
//        if (Verifica.situacao02(aviao)) {
//            System.out.println("--------------------------------------------------");
//            System.out.println("Número do Vôo: " + aviao.getNumeroDoVoo());
//            System.out.println("Data do Vôo: " + aviao.getData());
//            System.out.println("Número de Assentos Livres: " + aviao.vagas());
//            System.out.println("--------------------------------------------------");
//            System.out.println("Parabéns, as operações funcionaram como esperado!");
//        } else
//            System.out.println("Erro: existem problemas na implementação das operações.");
    }
    
}
