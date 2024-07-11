package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val krul = Hero(
    id = 23,
    name = "Krul",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/krul.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/KrulActive.png",
    desc = "Krul is a jungle nightmare who dominates in 1v1 duels. Able to absorb massive amounts of damage and recover large portions of health, Krul can bring the pain and survive a beating.",
    power = listOf(
        PowerStatus("Health", 1501.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 75.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 153.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Shadows Empower Me(Perk)",
            skillDesc = "Krul is empowered by the shadows after standing still in brush for 1.5 seconds. Once empowered, Krul briefly gains 2 move speed and his next basic attack will slow the target by 40% for 3 seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Krul-P-shadows-empower-me.png",
        ), SkillStatus(
            skillName = "Dead Man's Rush",
            skillDesc = "Krul dashes to the target, deals damage and applies basic-attack effects. Activating Dead Man's Rush grants Krul a health barrier for 2.5 seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Krul-A-dead-mans-rush.png",
        ), SkillStatus(
            skillName = "Spectral Smite",
            skillDesc = "Passive: Basic attacks & abilities apply Weakness for 4 seconds (up to 8 stacks). Each stack reduces the target's attack speed and crystal power by 10% and increases Krul's lifesteal against the weakened target.\n" +
                    "Activate: Detonate the stacks to deal damage and regain health based on the number of stacks consumed.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Krul-B-spectral-smite.png",
        ), SkillStatus(
            skillName = "From Hell's Hearth",
            skillDesc = "Krul pulls Hellrazor from his chest and hurls it in the targeted direction. If the sword hits an enemy hero (on the way out or the way back), it stuns and slows the target and deals damage. Stun duration is longer based on the distance the sword has traveled.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Krul-C-from-hells-heart.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/c/ca/Krul.jpg/revision/latest/scale-to-width-down/1000?cb=20161230220049"
        ),
        SkinStatus(
            skinName = "Death Metal Krul (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/c/c9/DMKrulR.jpg/revision/latest/scale-to-width-down/1000?cb=20161230220019",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Death Metal Krul (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/b/b4/DMKrulE.jpg/revision/latest/scale-to-width-down/1000?cb=20161230220102",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Death Metal Krul (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/0/03/DMKrulL.jpg/revision/latest/scale-to-width-down/1000?cb=20161230220107",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Summer Party Krul (SE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/6/60/SPKrulSE.jpg/revision/latest/scale-to-width-down/1000?cb=20161230220055",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xff20f0f0,
        darkVibrant = 0xff286860,
        onDarkVibrant = 0xc3ffffff,
    )
)