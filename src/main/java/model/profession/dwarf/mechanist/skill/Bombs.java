package model.profession.dwarf.mechanist.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.dwarf.mechanist.MechanistAbilitiesStat;

@Getter
public class Bombs implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    Bombs() {
        this.name = MechanistAbilitiesStat.BOMBS.getAbilityName();
        this.cooldown = MechanistAbilitiesStat.BOMBS.getCoolDown();
        this.consumption = MechanistAbilitiesStat.BOMBS.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
