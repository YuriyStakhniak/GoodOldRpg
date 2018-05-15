package model.enemy;

import lombok.Getter;
import lombok.Setter;
import util.GameConst;

@Getter
public class AbstractMonster implements GameConst {

    @Setter
    private boolean spellImmune = false;

    private String kind; // kind of monster (e.g. UNDEAD, ORKOID, CREATURE)
    private String name; // name of monster in certain kind
    private int health;
    private int initiative;
    private int cost;

    public AbstractMonster(Monsters m) {
        this.kind = m.name();
        this.name = m.name;
        this.health = m.health;
        this.initiative = m.initiative;
        this.cost = m.cost;
    }

    /**
     * health should not be less 0
     *
     * @param health new health
     */
    public void setHealth(int health) {
        this.health = health < MIN_HEALTH ? MIN_HEALTH : health;
    }

    public  int attack(){
        return 0;//will fix in battle steps
    }
}
