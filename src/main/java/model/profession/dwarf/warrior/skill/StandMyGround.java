package model.profession.dwarf.warrior.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.dwarf.warrior.WarriorAbilitiesStat;

@Getter
public class StandMyGround implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    StandMyGround() {
        this.name = WarriorAbilitiesStat.STANDMYGROUND.getAbilityName();
        this.cooldown = WarriorAbilitiesStat.STANDMYGROUND.getCooldown();
        this.consumption = WarriorAbilitiesStat.STANDMYGROUND.getConsumption();
    }

    @Override
    public void getAbility() {
        // Do nothing because now this operation is not supported.
    }
}
