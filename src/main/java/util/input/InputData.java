package util.input;

import model.hero.StatUtil;
import model.profession.MapKeys;
import model.profession.ProfessionMap;
import util.ScannerUtil;

public class InputData {

    public static String getRaceName() {
        System.out.println("Choice one of this race\n1 - Elf, 2 - Dwarf, 3 - Human.");
        while (true) {
            String race = ScannerUtil.getString();
            if (ProfessionMap.getProfession().containsKey(race.toLowerCase())) {
                return race;
            }
            System.out.println("Race chosen incorrectly. Try again");
        }
    }

    public static String getProfessionName(String raceName) {
        System.out.println("Choice one of this profession\n" + "1 - " +
                ProfessionMap.getProfession().get(raceName).get(MapKeys.ONE.getKey()).getProfessionName() + ", 2 - " +
                ProfessionMap.getProfession().get(raceName).get(MapKeys.TWO.getKey()).getProfessionName() + ".");
        while (true) {
            String profession = ScannerUtil.getString();
            if (ProfessionMap.getProfession().get(raceName).containsKey(profession.toLowerCase())) {
                return profession;
            }
            System.out.println("Choice wrong profession. Try again");
        }
    }

    public static String getHeroName() {
        System.out.println("Enter hero name");
        return ScannerUtil.getString();
    }

    public static String choiceStat() {
        System.out.println("Enter characteristic which you want to increase:");
        while (true) {
            String selectedStat = ScannerUtil.getString();
            if (StatUtil.statKeyList().contains(selectedStat)) {
                return selectedStat;
            }
            System.out.println("You choice wrong characteristic. Try again.");
        }
    }

    public static int numberOfPoint(int statPoint) {
        System.out.println("Enter number of points for distribution:");
        while (true) {
            int distributedPoint = ScannerUtil.getInt();
            if (statPoint >= distributedPoint && distributedPoint > 0) {
                return distributedPoint;
            }
            System.out.println("You input wrong number of point to distribute. Try again.");
        }
    }
}
