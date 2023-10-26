package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val ozo = Hero(
    id = 28,
    name = "Ozo",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/ozo.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/OzoActive.png",
    desc = "Quick and nimble, Ozo leaps from hero to hero as he bounces around the battlefield. He is at home in the center of a chaotic fight where he can deal large amounts of area-of-effect damage. Remember to build defensive items to maximize the amount of time he can stay in combat.",
    power = listOf(
        PowerStatus("Health", 1825.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 157.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Carnie Luck (Perk)",
            skillDesc = "Ozo receives 10%-30% additional healing, barrier and fortified health from all sources. (This does not affect health regeneration.)",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/02/Perk.png",
        ), SkillStatus(
            skillName = "Three Ring Circus",
            skillDesc = "Ozo performs a three-hit combo with his ring. Each part of the combo is a separate tap within a 5-second window.\n" +
                    "\n" +
                    "First hit: Ozo thrusts his ring forward, damaging the target and other enemies in front of him.\n" +
                    "Second hit: Ozo dashes through his target and deals damage.\n" +
                    "Final hit: Ozo spins, damaging all nearby enemies.\n" +
                    "Each hit deals weapon damage and triggers basic-attack effects. Ozo heals for each enemy damaged by any of these hits, with hero damage granting a greater heal.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/02/abilityA.jpg",
        ), SkillStatus(
            skillName = "Acrobounce",
            skillDesc = "Ozo hops onto the head of a nearby target (enemy, ally or creature), slowing it by 60% and damaging it. While Ozo is airborne, quickly tap a nearby target to bounce off one head to the other. Three hops maximum. The final hop deals increased damage. If Ozo hops at least twice, he’ll get a burst of move speed. Reduced crystal scaling vs. minions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/02/abilityB.jpg",
        ), SkillStatus(
            skillName = "Bangarang",
            skillDesc = "Ozo charges up before tumbling to a targeted enemy hero. If he reaches the target within 1 second, he deals damage, stuns for 0.5 seconds and flips the target over his ring to behind him. While tumbling, Ozo will knock aside and deal reduced damage to all other enemies in his path.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/02/abilityC.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/Dp7MIjNuZXc/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "'Wuxia' Ozo (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/02/Ozo_Wuxia-web.png",
            skinType = SKIN.RARE,
        ),
    )
)