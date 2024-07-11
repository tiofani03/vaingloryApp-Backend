package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val fortress = Hero(
    id = 12,
    name = "Fortress",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/fortress.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/FortressActive-1.png",
    desc = "This Halcyon Well guardian is a snarling, frightening sight in the jungle. He stalks prey, closes in with teammates, flanks targets and creates challenging, multi-front confrontations. Stay near your allies and bite and claw your way to kills.",
    power = listOf(
        PowerStatus("Health", 1560.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 157.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Packmates(Perk)",
            skillDesc = "When Fortress is near an allied hero, he will move faster after 1 second. He will maintain this move-speed bonus so long as he’s alongside any allied hero.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/FortressPpackmates.png",
        ), SkillStatus(
            skillName = "Truth Of The Tooth",
            skillDesc = "Fortress marks the target enemy as prey and his next basic attack becomes a short-range lunge. Fortress and allied heroes gain move speed when moving toward anything marked as prey.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/FortressAtruth-of-the-tooth.png",
        ), SkillStatus(
            skillName = "Law Of The Claw",
            skillDesc = "Fortress claws his target for crystal damage and causes it to bleed. Bleeding targets take 25 +15% of crystal power as damage every second. Attacks from Fortress and his allies have +10% lifesteal against bleeding targets and increase bleeding by one stack. Upon reaching 6 stacks, the target is dealt a burst of damage based on its max health, is slowed by 30% and receives mortal wound (-33% healing).",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/FortressBlaw-of-the-claw.png",
        ), SkillStatus(
            skillName = "Attack Of The Pack",
            skillDesc = "Fortress howls, gaining increased health and attack speed and calls to him a pack of wolves. Each pack wolf seeks out a different enemy hero. These wolves apply bleeding with their basic attacks.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/JouleC.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/DGEg_EsKwwY/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "Netherwolrd Fortress (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/fortress-tier1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Netherwolrd Fortress (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Fortress_T2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Netherwolrd Fortress (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Fortress-T3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Dire Fortress (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Fortress_Dire-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Gift Warped Fortress (LE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/WinterFortressSplash.png",
            skinType = SKIN.LIMITED_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffe8a840,
        darkVibrant = 0xff682018,
        onDarkVibrant = 0x8cffffff,
    )
)