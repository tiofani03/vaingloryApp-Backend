package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val phinn = Hero(
    id = 30,
    name = "Phinn",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/phinn.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/PhinnActive-1.png",
    desc = "Phinn is an unstoppable tank who brings the fight to him. He pairs incredibly well with other heroes who don't back down from battle. Phinn is strongest with defense and utility items, and he's able to absorb immense amounts of punishment, protecting teammates while they dish out damage.",
    power = listOf(
        PowerStatus("Health", 1904.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 154.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 28.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Unstoppable (Perk)",
            skillDesc = "Phinn cannot be stopped. All stuns and movement-impairing effects are instead reduced to moderate slows. He even shrugs off most damage through passively gaining additional armor, shield and max health from items and effects.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_Perk.jpg",
        ), SkillStatus(
            skillName = "Quibble",
            skillDesc = "Phinn slams his anchor down on a neighboring location, heavily slowing enemies. Overdrive: This upgrades the slow into a stun!",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_A1.jpg",
        ), SkillStatus(
            skillName = "Polite Company",
            skillDesc = "Phinn stomps the earth, dealing crystal damage to all enemies in a wide area and launching them toward him. The effect reverberates around allies, granting them a barrier along with bonus armor and shield for the next few seconds. Overdrive: Makes enemies travel farther toward Phinn upon stomp.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_B.jpg",
        ), SkillStatus(
            skillName = "Forced Accord",
            skillDesc = "Phinn throws his anchor in a direction. After the anchor reaches its destination he yanks it back, damaging all enemies in its path and pulling them back to him. If Phinn doesn't pull any enemies, a percentage of the cooldown is refunded.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/1000phinn_splash2.jpg"
        ),
        SkinStatus(
            skinName = "Bhonecruncher Phinn (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_T1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Bhonecruncher Phinn (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_T2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Bhonecruncher Phinn (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_t3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Bakuto Phinn (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_Bakuto-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "Summer Party Phinn (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Phinn_summer-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffc8c060,
        darkVibrant = 0xFF1E1E1E,
        onDarkVibrant = 0xFFFFFFFF,
    )
)