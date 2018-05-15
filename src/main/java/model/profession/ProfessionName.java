package model.profession;

import lombok.Getter;

@Getter
public enum ProfessionName {

    PRIEST("Priest"), PALADIN("Paladin"), WARRIOR("Warrior"), MECHANIST("Mechanist"), MAGE("Mage"),
    GUNSLINGER("Gunslinger");

    private String professionName;

    ProfessionName(String professionName) {
        this.professionName = professionName;
    }
}
