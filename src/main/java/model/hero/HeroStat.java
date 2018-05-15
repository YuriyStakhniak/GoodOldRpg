package model.hero;

import lombok.Getter;
import model.profession.MapKeys;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

@Getter
public class HeroStat{

    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    HeroStat(Race race) {
        this.charisma = race.getCharisma();
        this.stamina = race.getStamina();
        this.intellect = race.getIntellect();
        this.agility = race.getAgility();
        this.concentration = race.getConcentration();
    }

    public Void setCharisma(int charisma) {
        this.charisma = this.charisma + charisma;
        return null;
    }


    public Void setStamina(int stamina) {
        this.stamina = this.stamina + stamina;
        return null;
    }


    public Void setIntellect(int intellect) {
        this.intellect = this.intellect + intellect;
        return null;
    }

    public Void setAgility(int agility) {
        this.agility = this.agility + agility;
        return null;
    }

    public Void setConcentration(int concentration) {
        this.concentration = this.concentration + concentration;
        return null;
    }
}
