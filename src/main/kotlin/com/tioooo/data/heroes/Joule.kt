package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val joule = Hero(
    id = 18,
    name = "Joule",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/joule.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/JouleActive.png",
    desc = "Joule is a hardened front-line fighter with built-in defensive plating. All of Joule's abilities require proper aim to hit the intended target, but they have a devastating effect if you can aim properly. Pick Joule if you can predict enemy movements.",
    power = listOf(
        PowerStatus("Health", 1705.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 75.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 148.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Heavy Plating(Perk)",
            skillDesc = "Joule takes reduced damage from basic attacks that hit her from the front and sides. Damage is reduced by 15 – 33% (level 1 – 12).",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/JouleHeroicPerk1.png",
        ), SkillStatus(
            skillName = "Rocket Leap",
            skillDesc = "Joule leaps to a target location. Enemies caught underneath Joule take full damage and are stunned, while enemies near the impact are knocked away, slowed and take 1/3 the damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/JouleA.jpg",
        ), SkillStatus(
            skillName = "Thunder Streak",
            skillDesc = "Joule thrusts her sword forward, arcing a bolt of energy out through the blade. This strike deals both weapon and crystal damage in a line in front of her. When this successfully strikes an enemy, the next Thunder Strike within 7 seconds will deal bonus damage and cost extra energy. This buff can stack up to 5 times and is lost when stunned. When maxed, this ability can crit weapon damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/JouleB.jpg",
        ), SkillStatus(
            skillName = "Big Red Button",
            skillDesc = "Joule fires a massive beam of energy in a target direction that continually deals damage to all targets along its path. The force of this beam pushes Joule backward during channeling.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/JouleC.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/7/71/Joule.jpg/revision/latest/scale-to-width-down/1000?cb=20161210222950"
        ),
        SkinStatus(
            skinName = "Killa-Joule 9000 (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Joule-T1.jpeg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Killa-Joule 9000 (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Joule-T2.jpeg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Killa-Joule 9000 (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/KillaJouleTIII.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Snow Monster Joule (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Joule_SnowMonster-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffe8c850,
        darkVibrant = 0xff186058,
        onDarkVibrant = 0xb3ffffff,
    )
)