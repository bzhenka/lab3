package lab3;

import lab3.abstracts.Thing;
import lab3.characters.Medynica;
import lab3.characters.Neznayka;
import lab3.characters.Siniglazka;
import lab3.characters.Snezhinka;
import lab3.things.*;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Siniglazka siniglazka = new Siniglazka();
        Neznayka neznayka = new Neznayka();
        Snezhinka snezhinka = new Snezhinka();
        Medynica medynica = new Medynica();

        Plaster plaster = new Plaster("телесный");
        Robe robe = new Robe("белый");
        Colpac colpac = new Colpac();
        Veshalka veshalka = new Veshalka("коричневая");
        Glasses glasses = new Glasses();
        Palochka palochka = new Palochka("деревянная");



        snezhinka.unstick(plaster);
        snezhinka.inspect(siniglazka);
        snezhinka.cameOut();
        siniglazka.cameOut();
        robe.hang(veshalka);
        colpac.hang(veshalka);
        Thing[] things = {robe, colpac};
        neznayka.see(things);

        neznayka.putOn(robe);
        neznayka.putOn(colpac);
        colpac.onTheHead();
        medynica.leave(glasses);
        neznayka.putOn(glasses);
        glasses.onTheNose();
        neznayka.take(palochka);

        System.out.println();

        neznayka.cameOut();
        snezhinka.look(neznayka);
        snezhinka.udivlenie(neznayka);
        neznayka.boldness("смелость");
        snezhinka.boldness("смелость");
        neznayka.resource("находчивость");

    }
}
