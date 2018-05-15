# OldRPG
This is a console game in genre RPG. 
In this game you create team, which contain from 3 hero. One of this hero is a leader.

Your hero have  race(Human, Elf, Dwarf) and  depending on race 
you hero have  profession. 
* Human - priest, paladin.
* Elf - mage, gunslinger. 
* Dwarf - mechanist, warrior.

Each profession have some different abilities.

Priest abilities:
-	Hand of God(25 mp), cd 2 turns, heals 20 hits (can be cast on itself or other unit, if casts on UNDEAD deal damage 
instead of heal)
-	Battle trance(65 mp), cd 4 turns, gain immunity for next turn

Paladin abilities:

-	Splash (20 rp) – attack 2 additional targets, cd 2 turns
-	Rush(20 rp) – dashes to nearest enemy to deal additional 2d6 damage

Mage abilities:

-	Fireball (45 mp) 3d10, cd (coolDown) 3 turns (not moving turns, but battle phase turns)
-	Spell Shield (15 mp), block 60 dmg till destruction, cd 2 turns
-	Frost Bolt (20 mp), 2d6, cd 1 turn
-	Dispel (20 mp), dispels any spell, cd 3 turns 
-	 Stone Gaze (20 mp), transform enemy into stone for 2 turns, cd 4 turns

Gunslinger abilities:
-	Multi shot (30 mp) – attack 1 additional target, cd 2 turns
-	RapidFire(30 mp) – attack single target with 1 additional attack, cd 3 turns
-	BullsEye(40 mp) – archer takes aim and deal crit damage to single target 3d10, cd 3 turns

Mechanist abilities:

-	Bombs! (25rp) – throw a bomb that hits 2 enemies and deal 2d6 dmg to each, cd 2 turns
-	Droid to arms(25 rp) – crate droid that attack random enemy with 2d6 every turn, lasts 3 turns, cd 5 turns, has 
50 HP


Warrior abilities:

-	Whirling Axe(30 rp) – throw axe into nearest enemy, deal additional 2d6 damage, cd 2 turns, apply regular attack 
to this unit
-	Stand my ground(20 rp), cd 4 turns, gain 50 HP shield for 2 turns

# If you want play this game you need to do next steps:
1. Install Maven.
2. git this project.
3. build maven project ```mvn package```.
4. Enter in terminal this command:
```
 java -cp target/alexgame-1.0-SNAPSHOT.jar App
```
