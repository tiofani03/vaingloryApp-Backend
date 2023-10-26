package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val glaive = Hero(
    id = 13,
    name = "Glaive",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/glaive.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/GlaiveActive.png",
    desc = "Glaive is a devastating powerhouse, instantly dashing into the action and knocking enemies into danger. His damage is devastating, but he is vulnerable to slippery opponents.",
    power = listOf(
        PowerStatus("Health", 2046.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 63.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 153.7, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Hunt The Weak (Perk)",
            skillDesc = "Glaive's critical strikes cleave in a cone in front of him.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Glaive-P-hunt-the-weak.png",
        ), SkillStatus(
            skillName = "Afterburn",
            skillDesc = "Glaive rockets in the target direction, damaging all enemies along the way. His next basic attack is replaced by a frightening blast that knocks his target back 5.5 meters.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Glaive-A-afterburn.png",
        ), SkillStatus(
            skillName = "Twisted Stroke",
            skillDesc = "Passive: Increase critical strike chance and AOE cleave damage of basic attacks.\n" +
                    "Activate: Instantly execute a critical strike. This deals weapon damage and is treated like a basic attack, but can deal bonus crystal damage if you have any crystal power.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Glaive-B-twisted-stroke.png",
        ), SkillStatus(
            skillName = "Bloodsong",
            skillDesc = "Passive: Glaive will generate Bloodsong stacks from basic attacking or from receiving basic attacks. Each stack grants him bonus lifesteal. Max 20 stacks.Activate: Swings Glaive's axe in a 5.8-meter circle, dealing massive area damage based on number of Bloodsong stacks used. This removes all stacks.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Glaive-C-bloodsong.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/8/87/Glaive.jpg/revision/latest/scale-to-width-down/1000?cb=20170209201824"
        ),
        SkinStatus(
            skinName = "Prehistoric Glaive (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/2/29/PGlaiveR.jpg/revision/latest/scale-to-width-down/1000?cb=20161217122750",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Prehistoric Glaive (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/e/ea/PGlaiveE.jpg/revision/latest/scale-to-width-down/1000?cb=20161217122812",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Prehistoric Glaive (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/2/22/PGlaiveL.jpg/revision/latest/scale-to-width-down/1000?cb=20161217122830",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Sorrowblade Glaive(E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/5/5d/SGlaiveE.jpg/revision/latest/scale-to-width-down/1000?cb=20161217122853",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "King Glaive(E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/08/King_Glaive_1000px.jpg",
            skinType = SKIN.EPIC,
        ),
    )
)