public class IcrementoVariaveis {
    public static void main(String[] args) {
        int numero =5;
         // Icrementando o valor na variáveis 

         numero ++;

         System.out.println(numero);

         // Quando é chamado a icremento no print a sua saida será a do valor atribuido a variável porque o seu valor foi guardado na memoría para que a sua saida possa printar o icremento tem quer mostra duas vez o print porque on primeiro ele guardar e o segundo ele mostra o valor que foi guardado conformi o exemplo abaixo.
         numero = 7;
         System.out.println(numero ++);// Guarda na memoría
         System.out.println(numero);// saida do valor Icrementado. 

         // porém existe uma forma para realizar a saida do Ivremento antes conforme o exemplo abaixo.
         numero = 9;
         System.out.println(++ numero);// recebendo primeiro o icremnto e depois mostrando a saida o valor.
    }
}
