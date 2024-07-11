package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val idris = Hero(
    id = 17,
    name = "Idris",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/idris.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/IdirsActive.png",
    desc = "Idris shifts through battle, piercing his targets with his spear and chakrams. When building weapon items he excels at assassinating vulnerable targets at close range, while crystal items allow him to dance around the fight, keeping his distance. Whether building weapon, crystal, or a combination of the two, Idris brings extraordinary damage and agility to any fight.",
    power = listOf(
        PowerStatus("Health", 1600.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 161.7, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 32.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Divergent Path (Perk)",
            skillDesc = "dris unlocks unique powers for either his melee or ranged paths upon attaining a threshold of weapon or crystal power.\n" +
                    "\n" +
                    "Melee (Weapon): Idris's Shroudstep becomes an instantaneous blink. Passively, his melee attacks restore stamina and reduce the cooldowns of his Shroudstep and Shimmer Strike abilities.\n" +
                    "\n" +
                    "Ranged (Crystal): Idris can throw basic attacks to targets beyond his melee attack range, dealing crystal damage and weapon damage and applying on-hit effects.\n" +
                    "\n" +
                    "Instead of energy, Idris uses stamina to activate his abilities. Purchasing items with energy and energy regeneration increases his stamina and stamina regeneration.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/11/Idris_Perk.png",
        ), SkillStatus(
            skillName = "Shroudstep",
            skillDesc = "Idris dashes in the target direction, dealing amplified damage to the next target he attacks within a few seconds.\n" +
                    "\n" +
                    "If Idris has not taken damage within the last few seconds, Shroudstep grants a barrier. The availability of the barrier is displayed beneath his stamina meter.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/11/Idris_A.png",
        ), SkillStatus(
            skillName = "Chakram",
            skillDesc = "Idris throws a chakram that returns to him, damaging enemies each time it passes over them. Hitting enemy heroes, miners, or kraken recovers stamina.\n" +
                    "\n" +
                    "Idris can use his Shroudstep and Shimmer Strike abilities to temporarily prevent his chakrams from returning to him.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/11/Idris_B.png",
        ), SkillStatus(
            skillName = "Shimmer Strike",
            skillDesc = "Idris becomes invulnerable and untargetable as he latches onto the target hero for the next [Leap Off Enemy Time Window] seconds (enemy) or [Leap Off Ally Time Window] seconds (ally). While attached, Idris will jump out to his attack range in the first direction he taps, striking all surrounding enemies with weapon damage as he jumps off.nnIf no direction is chosen, Idris will jump towards his original position.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/11/Idris_C.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/7/79/IMG_2853.JPG/revision/latest?cb=20170406200425"
        ),
        SkinStatus(
            skinName = "'Elite Force' Idris (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/03/Idris_Elite_splash_1000px.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "'Horus' Idris (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/12/Horus_Idris-web.png",
            skinType = SKIN.EPIC,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff8f808,
        darkVibrant = 0xff181028,
        onDarkVibrant = 0x74ffffff,
    )
)