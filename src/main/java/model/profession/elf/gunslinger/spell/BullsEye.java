package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.gunslinger.GunslingerAbilitiesStats;

@Getter
public class BullsEye implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    BullsEye() {
        this.name = GunslingerAbilitiesStats.BULLSEYE.getAbilityName();
        this.cooldown = GunslingerAbilitiesStats.BULLSEYE.getCooldown();
        this.consumption = GunslingerAbilitiesStats.BULLSEYE.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
