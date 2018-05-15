package model.race;

import lombok.Getter;

@Getter
public enum Races {

    HUMAN("Human", 10, 30, 20, 15, 15), ELF("Elf", 15, 10, 25, 22, 18), DWARF("Dwarf", 5, 45, 15, 20, 5);

    private String raceName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;


    Races(String raceName, int charisma, int stamina, int intellect, int agility,
          int concentration) {
        this.raceName = raceName;
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
    }
}
