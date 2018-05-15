package model.profession.elf;

import model.profession.MapKeys;
import model.profession.elf.gunslinger.ElfGunslinger;
import model.profession.elf.mage.ElfMage;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ElfProfessionMap {

    public Map<String, Race> getElfProfession() {
        Map<String, Race> elfProfession = new HashMap<>();

        elfProfession.put(MapKeys.ONE.getKey(), new ElfMage());
        elfProfession.put(MapKeys.TWO.getKey(), new ElfGunslinger());

        return elfProfession;
    }
}
