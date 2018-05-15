package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.Races;

@Getter
public class Elf implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Elf(String professionName) {
        this.professionName = professionName;
        this.raceName = Races.ELF.getRaceName();
        this.charisma = Races.ELF.getCharisma();
        this.stamina = Races.ELF.getStamina();
        this.intellect = Races.ELF.getIntellect();
        this.agility = Races.ELF.getAgility();
        this.concentration = Races.ELF.getConcentration();
    }
}
