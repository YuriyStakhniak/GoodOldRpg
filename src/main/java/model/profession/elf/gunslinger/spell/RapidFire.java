package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;
import model.profession.elf.gunslinger.GunslingerAbilitiesStats;

@Getter
public class RapidFire implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    RapidFire() {
        this.name = GunslingerAbilitiesStats.RAPIDFIRE.getAbilityName();
        this.cooldown = GunslingerAbilitiesStats.RAPIDFIRE.getCooldown();
        this.consumption = GunslingerAbilitiesStats.RAPIDFIRE.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
