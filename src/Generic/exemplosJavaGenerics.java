package Generic;


import Generic.Fruta.Banana;
import Generic.Fruta.Frutas;
import Generic.Fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class exemplosJavaGenerics {
    
    public static void main(String[] args) {
        List<String>lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimir1(listaLong);

        List<Frutas> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);
    }

    public static void imprimirFrutas(List<? extends Frutas> lista) {
        for (Frutas fruta : lista) {
            System.out.println(fruta);

        }
    }

    public static void imprimir (List<String> lista) {
        for (String st : lista) {
            System.out.println(st);
        }
    }

    public static void imprimir1 (List<Long> lista) {
        for (Long st : lista) {
            System.out.println(st);
        }
    }

}
