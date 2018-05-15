package model.profession.dwarf.warrior.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.dwarf.warrior.WarriorAbilitiesStat;

@Getter
public class WhirlingAxe implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    WhirlingAxe() {
        this.name = WarriorAbilitiesStat.WHIRLINGAXE.getAbilityName();
        this.cooldown = WarriorAbilitiesStat.WHIRLINGAXE.getCooldown();
        this.consumption = WarriorAbilitiesStat.WHIRLINGAXE.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
