package model.profession.human.paladin;

import model.profession.ProfessionName;
import model.race.type.Human;

public class HumanPaladin extends Human {

    public HumanPaladin() {
        super(ProfessionName.PALADIN.getProfessionName());
    }
}
