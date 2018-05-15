package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.Races;

@Getter
public class Dwarf implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Dwarf(String professionName) {
        this.professionName = professionName;
        this.raceName = Races.DWARF.getRaceName();
        this.charisma = Races.DWARF.getCharisma();
        this.stamina = Races.DWARF.getStamina();
        this.intellect = Races.DWARF.getIntellect();
        this.agility = Races.DWARF.getAgility();
        this.concentration = Races.DWARF.getConcentration();
    }
}
