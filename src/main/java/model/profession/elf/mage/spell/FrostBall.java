package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.mage.MageAbilitiesStats;

@Getter
public class FrostBall implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    FrostBall() {
        this.name = MageAbilitiesStats.FROSTBALL.getAbilityName();
        this.cooldown = MageAbilitiesStats.FROSTBALL.getCooldown();
        this.consumption = MageAbilitiesStats.FROSTBALL.getConsumption();
    }


    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
