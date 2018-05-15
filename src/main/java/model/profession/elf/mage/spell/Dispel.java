package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.mage.MageAbilitiesStats;

@Getter
public class Dispel implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    Dispel() {
        this.name = MageAbilitiesStats.DISPEL.getAbilityName();
        this.cooldown = MageAbilitiesStats.DISPEL.getCooldown();
        this.consumption = MageAbilitiesStats.DISPEL.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
