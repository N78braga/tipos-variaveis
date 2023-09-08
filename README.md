# dio-trilha-java-basico
Repositório para exemplos do curso de Java Básico pela DIO. 

## Aula de Tipos e Variáveis.

### Exemplo de Representar o Valor da Conversão Americana.

```
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double salarioMinimo = 2500; // forma para representa o em milhar deacordo com a convensão americana.
    }
}
```
## Operadores Unários.

### Exemplo de Trabalhar com Operadores Unários.

```
public class OperadorUnario {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
    }

}
```

## Icremento do Valor

### Icrementando o valor na variáveis

```
public class IcrementoVariaveis {
    public static void main(String[] args) {
        int numero =5;
         numero ++;
         System.out.println(numero);
     
    }
}

```

### Quando é chamado a icremento no print a sua saida será a do valor atribuido a variável porque o seu valor foi guardado na memoría para que a sua saida possa printar o icremento tem quer mostra duas vez o print porque on primeiro ele guardar e o segundo ele mostra o valor que foi guardado conformi o exemplo abaixo.</p>

```
public class IcrementoVariaveis {
    public static void main(String[] args) {
        int numero =7;
         System.out.println(numero ++);// Guarda na memoría
         System.out.println(numero);// saida do valor Icrementado.
         
    }
}

```

### porém existe uma forma para realizar a saida do Ivremento antes conforme o exemplo abaixo.
```
public class IcrementoVariaveis {
    public static void main(String[] args) {
        int numero =9;
      System.out.println(++ numero);// recebendo primeiro o icremnto e depois mostrando a saida o valor.
         
    }
}
```
  
         
