package tarefaMod17;

import tarefaMod17.Carros.*;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Carros> carros = new ArrayList<>();
        carros.add(new Bugatti());
        carros.add(new Ferrari());
        carros.add(new Pagani());
        carros.add(new Lamborghini());
        carros.add(new RollsRoyce());
        imprimirCarros(carros);
    }

    public static void imprimirCarros(List<? extends Carros> lista) {
        for (Carros carros : lista) {
            System.out.println(carros);
        }
    }
}
