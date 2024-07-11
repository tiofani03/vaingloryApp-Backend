package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val catherine = Hero(
    id = 8,
    name = "Catherine",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/catherine.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/CatherineActive-1.png",
    desc = "Catherine brings the most reliable stun and disruption skills to teamfights and ganks. Hard to kill and great at chasing, she can secure kills and turn around fights that would otherwise be lost.",
    power = listOf(
        PowerStatus("Health", 1509.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 80.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 141.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Captain Of The Guard (Perk)",
            skillDesc = "Catherine gains 1 armor & shield every time she stuns or silences an enemy hero with her abilities.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Catherine-P-captain-of-the-guard.png",
        ), SkillStatus(
            skillName = "Merciless Pursuit",
            skillDesc = "Catherine gains a burst of move speed. Her next basic attack is replaced by a powerful stun attack. Resets basic attack cooldown on activation.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Catherine-A-merciless-pursuit.png",
        ), SkillStatus(
            skillName = "Stormguard",
            skillDesc = "Activates a pulsating bubble that burns nearby enemies and deflects damage above 77 (+7 per level) to nearby enemies. Each deflection reduces the shield duration by 0.5 seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Catherine-B-stormguard.png",
        ), SkillStatus(
            skillName = "Blast Tremor",
            skillDesc = "Catherine slams the ground, damaging & silencing enemies in a large cone in front of her.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Catherine-C-blast-tremor.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/i2cphmHljZM/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "Paragon Catherine (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/CatherineT1Flat.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Paragon Catherine (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/CatherineT2Flat.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Paragon Catherine (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/CatherineT3Flat.jpg",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Gladiator Catherine(E)",
            skinImage = "https://en.vainglorygame.com/wp-content/uploads/2017/01/GladiatorCatherine_revised_1000px.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Championship Catherine (SE)",
            skinImage = "https://esports.id/img/cloudinary/article/wno04fbjlexek9raseko.jpg",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "War Winter Catherine (LE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/9/93/WWCatherineLE.jpg/revision/latest/scale-to-width-down/1000?cb=20161218173206",
            skinType = SKIN.LIMITED_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffd84028,
        darkVibrant = 0xff601008,
        onDarkVibrant = 0x86ffffff,
    )
)