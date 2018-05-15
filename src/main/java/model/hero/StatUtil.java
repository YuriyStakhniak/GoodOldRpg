package model.hero;

import model.profession.MapKeys;
import util.GameConst;
import util.input.InputData;
import util.output.OutPutData;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class StatUtil implements GameConst {

    public static double calculateHealth(HeroStat heroStat) {
        return START_HEALTH + heroStat.getStamina() * HEALTH_DISTRIBUTION_COEFFICIENT;
    }

    public static double calculateMana(HeroStat heroStat) {
        return START_MANA_POINT + heroStat.getIntellect() * MANA_DISTRIBUTION_COEFFICIENT;
    }

    public static double calculateRage(HeroStat heroStat) {
        return START_RAGE_POINT + heroStat.getAgility() * RAGE_DISTRIBUTION_COEFFICIENT;
    }

    public static void addHeroStat(Hero hero) {
        int statPoint = STAT_POINT;
        OutPutData.printStatDistributeInfo(statPoint);
        while (statPoint > 0) {
            String selectedStat = InputData.choiceStat();
            int distributedPoint = InputData.numberOfPoint(statPoint);
            choiceStat(hero, selectedStat, distributedPoint);
            statPoint -= distributedPoint;
            if (statPoint > 0) {
                System.out.println("You have " + statPoint + " " +
                        "characteristics that can be distributed");
            }
        }
    }

    private static void choiceStat(Hero hero, String selectedStat, int point) {
        Map<String, Void> statMap = new HashMap<>();
        statMap.put(MapKeys.ONE.getKey(), hero.getHeroStat().setStamina(point));
        statMap.put(MapKeys.TWO.getKey(), hero.getHeroStat().setAgility(point));
        statMap.put(MapKeys.THREE.getKey(), hero.getHeroStat().setCharisma(point));
        statMap.put(MapKeys.FOUR.getKey(), hero.getHeroStat().setIntellect(point));
        statMap.put(MapKeys.FIVE.getKey(), hero.getHeroStat().setConcentration(point));
        if (statMap.containsKey(selectedStat)) {
            statMap.get(selectedStat);
        }
    }

    public static List<String> statKeyList() {
        List<String> statKeyList = new LinkedList<>();
        statKeyList.add(MapKeys.ONE.getKey());
        statKeyList.add(MapKeys.TWO.getKey());
        statKeyList.add(MapKeys.THREE.getKey());
        statKeyList.add(MapKeys.FOUR.getKey());
        statKeyList.add(MapKeys.FIVE.getKey());
        return statKeyList;
    }
}
