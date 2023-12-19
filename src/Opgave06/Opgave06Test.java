package Opgave06;

import Opgave06.Models.Spell;
import Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static SpellsStorage storage = new SpellsStorage();
    public static ArrayList<Spell> spells = storage.getSpells();
    public static void main(String[] args) {
        System.out.println(spellSearch("Silencio").toString());

    }

    public static Spell spellSearch (String name) {
        for (Spell spell : spells) {
            if (name.equals(spell.getName()))
                return spell;
        }
        return null;

    }
}
