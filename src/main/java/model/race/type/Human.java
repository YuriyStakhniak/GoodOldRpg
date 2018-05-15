package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.Races;

@Getter
public class Human implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Human(String professionName) {
        this.professionName = professionName;
        this.raceName = Races.HUMAN.getRaceName();
        this.charisma = Races.HUMAN.getCharisma();
        this.stamina = Races.HUMAN.getStamina();
        this.intellect = Races.HUMAN.getIntellect();
        this.agility = Races.HUMAN.getAgility();
        this.concentration = Races.HUMAN.getConcentration();
    }
}