package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.mage.MageAbilitiesStats;

@Getter
public class FireBall implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    FireBall() {
        this.name = MageAbilitiesStats.FIREBALL.getAbilityName();
        this.cooldown = MageAbilitiesStats.FIREBALL.getCooldown();
        this.consumption = MageAbilitiesStats.FIREBALL.getConsumption();
    }


    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
