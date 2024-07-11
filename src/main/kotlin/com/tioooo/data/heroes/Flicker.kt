package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val flicker = Hero(
    id = 11,
    name = "Flicker",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/flicker.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/FlickerActive.png",
    desc = "Flicker is a sneaky trickster able to disrupt foes with his debilitating abilities. Utilizing his stealth, Flicker can plunge deep into enemy lines causing mayhem or grant his team stealth to initiate on unsuspecting prey.",
    power = listOf(
        PowerStatus("Health", 1654.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 85.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 155.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 35.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Willow Whisper (Perk)",
            skillDesc = "Flicker gains stealth and a move speed bonus when in brush for a short duration. Flicker can then leave the brush and remain stealthed for a time. Taking damage or using abilities removes stealth.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/Flicker_Heroic_Perk_Sqaure-e1477518268370.jpg",
        ), SkillStatus(
            skillName = "Binding Light",
            skillDesc = "Flicker commands his fairies to swarm a target location, dealing damage to enemies standing within it. When the effect expires, fairy light roots any enemy heroes still within the area.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/Flicker_A-e1477517521100.jpg",
        ), SkillStatus(
            skillName = "Fairy Dust",
            skillDesc = "Flicker swirls fairy dust around him, slowing and dealing damage to anyone inside the dusted area. After a short duration, the dust ignites, dealing a burst of damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/Flicker_B-e1477517555978.jpg",
        ), SkillStatus(
            skillName = "Mooncloak",
            skillDesc = "Flicker and his allies temporarily gain stealth and a move speed bonus. The stealth will break when a hero uses an ability, attacks or takes damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/Flicker_C-e1477517587284.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/2/2b/Flicker_Splash.jpg/revision/latest?cb=20180602164744"
        ),
        SkinStatus(
            skinName = "'Red Lantern' Flicker (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/11/Flicker_redpanda-web.png",
            skinType = SKIN.EPIC,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff0d810,
        darkVibrant = 0xff301038,
        onDarkVibrant = 0x78ffffff,
    )
)