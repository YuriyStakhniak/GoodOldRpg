package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.mage.MageAbilitiesStats;

@Getter
public class StoneGaze implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    StoneGaze() {
        this.name = MageAbilitiesStats.STONEGAZE.getAbilityName();
        this.cooldown = MageAbilitiesStats.STONEGAZE.getCooldown();
        this.consumption = MageAbilitiesStats.STONEGAZE.getConsumption();
    }


    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
