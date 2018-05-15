package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.mage.MageAbilitiesStats;

@Getter
public class SpellShield implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    SpellShield() {
        this.name = MageAbilitiesStats.SPELLSHIELD.getAbilityName();
        this.cooldown = MageAbilitiesStats.SPELLSHIELD.getCooldown();
        this.consumption = MageAbilitiesStats.SPELLSHIELD.getConsumption();
    }


    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
