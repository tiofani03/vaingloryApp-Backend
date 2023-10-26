package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val koshka = Hero(
    id = 22,
    name = "Koshka",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/koshka.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/KoshkaActive.png",
    desc = "Koshka is an in-your-face assassin adept at getting the kill and then getting out. She should focus on assassinating weak targets and locking down the most lethal enemy.",
    power = listOf(
        PowerStatus("Health", 1498.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 164.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Bloodrush (Perk)",
            skillDesc = "Koshka gains 0.5 move speed for each enemy she hits with her abilities. Lasts 5 seconds. Max 4 stacks.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Koshka-P-bloodrush.png",
        ),
        SkillStatus(
            skillName = "Pouncy Fun",
            skillDesc = "Koshka dashes to the target enemy and deals damage. Pounce cooldown is reduced by 2 seconds each time she executes a basic attack.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Koshka-A-Pouncy-Fun.png",
        ),
        SkillStatus(
            skillName = "Twirly Death",
            skillDesc = "Koshka twirls, damaging all enemies around her. She gains a boosted basic attack for each enemy hit by the twirl (up to 12). Twirl cooldown is reduced by 2 seconds each time she executes a basic attack.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Koshka-B-twirly-death.png",
        ),
        SkillStatus(
            skillName = "Yummy Catnip Frenzy",
            skillDesc = "Koshka leaps at her target then launches into a flurry of slashes, stunning the target for the entire 2.2 second duration. Cooldown is reduced by 1 second each time she executes a basic attack.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Koshka-C-yummy-catnip-frenzy.png",
        ),

        ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/b/ba/Koshka.jpg/revision/latest?cb=20161218150237"
        ),
        SkinStatus(
            skinName = "Kandi Twirl Koshka (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/KoshkaT1Flat.jpg",
            skinType = SKIN.RARE
        ),
        SkinStatus(
            skinName = "Kandi Twirl Koshka (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/KoshkaT2Flat.jpg",
            skinType = SKIN.EPIC
        ),
        SkinStatus(
            skinName = "Kandi Twirl Koshka (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/KoshkaT3Flat.jpg",
            skinType = SKIN.LEGENDARY
        ),
        SkinStatus(
            skinName = "Red Lantern Koshka (LE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/b/bb/RLKoshkaLE.jpg/revision/latest?cb=20161218150305",
            skinType = SKIN.LIMITED_EDITION,
        ),
    )
)