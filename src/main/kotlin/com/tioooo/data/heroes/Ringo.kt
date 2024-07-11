package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val ringo = Hero(
    id = 33,
    name = "Ringo",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/ringo.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/RingoActive.png",
    desc = "Ringo is often played as the primary damage dealer for his team. He can shoot at blinding speeds and finish off fleeing enemies with an epic fireball that follows foes across the battlefield.",
    power = listOf(
        PowerStatus("Health", 1405.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 130.9, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Double Down (Perk)",
            skillDesc = "Ringo's next basic attack after killing anything will be a critical strike.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Ringo-P-double-down.png",
        ), SkillStatus(
            skillName = "Achilles Shot",
            skillDesc = "Ringo fires a trick shot at his target's heel (or whatever lower extremity exists), slowing the target & dealing damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Ringo-A-achilles-shot.png",
        ), SkillStatus(
            skillName = "Twirling Silver",
            skillDesc = "Ringo slings bullets at his target in a mad flurry, dramatically increasing his attack speed & move speed for 7 seconds. Resets basic attack cooldown on activation.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Ringo-B-twirling-silver.png",
        ), SkillStatus(
            skillName = "Hellfire Brew",
            skillDesc = "Ringo takes a long swig from his gourd and breathes out a scorching fireball at his target. The explosion pierces all shield, deals splash damage on impact and sets the target on fire, burning it & nearby enemies for 7 seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Ringo-C-hellfire-brew.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/QKA4GSSrRRU/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "Shogun Ringo (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/RingoT1Flat.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Shogun Ringo (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/RingoT2Flat.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Shogun Ringo (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/RingoT3Flat.jpg",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Vaquero Ringo(R)",
            skinImage = "https://id.vainglorygame.com/wp-content/uploads/2017/08/painting_ringo_Black_Edit.jpg",
            skinType = SKIN.RARE,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0x1e1e1e,
        darkVibrant = 0xff482020,
        onDarkVibrant = 0x7effffff,
    )
)