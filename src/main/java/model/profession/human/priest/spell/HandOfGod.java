package model.profession.human.priest.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.human.priest.PriestAbilitiesStats;

@Getter
public class HandOfGod implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    HandOfGod() {
        this.name = PriestAbilitiesStats.HANDOFGOD.getAbilityName();
        this.cooldown = PriestAbilitiesStats.HANDOFGOD.getCooldown();
        this.consumption = PriestAbilitiesStats.HANDOFGOD.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
