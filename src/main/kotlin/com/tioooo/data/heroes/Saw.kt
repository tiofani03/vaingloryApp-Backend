package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val saw = Hero(
    id = 36,
    name = "Saw",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/saw.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/SawActive.png",
    desc = "SAW has arguably the highest damage potential in the game ... but at the huge expense of mobility. Excellent at sieging important locations, SAW zones, slows and damages with Suppressing Fire.",
    power = listOf(
        PowerStatus("Health", 1453.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 64.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 87.4, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Spin Up(Perk)",
            skillDesc = "Each basic attack increases SAW's attack speed by 25% and armor & shield by 1, but it also decreases his move speed by 0.12 (up to 12 stacks).",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Saw-P-spin-up.png",
        ), SkillStatus(
            skillName = "Roadie Run",
            skillDesc = "SAW sprints & switches to a melee combat knife. If SAW attacks someone, he will deal bonus damage based on the target's missing health & roll backwards. Activating this ability clears all stacks of Spin Up. Crystal will boost the speed, up to a maximum of +2.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Saw-A-roadie-run.png",
        ), SkillStatus(
            skillName = "Suppressing Fire",
            skillDesc = "SAW fires a hurricane of bullets in a set direction for 2.5 seconds, damaging and slowing enemies in its path. Activating this ability grants all stacks of Spin Up. Deal 1/3 damage to turrets.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Saw-B-suppressing-fire.png",
        ), SkillStatus(
            skillName = "Mad Cannon",
            skillDesc = "SAW loads explosive shells into his gun which deal additional damage based on the target's missing health. The shells also deal splash damage based on the amount of crystal power SAW has. This explosive ammo fires 36% slower and grants 2 stacks of Spin Up.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Saw-C-mad-cannon.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/1/10/SAW.jpg/revision/latest/scale-to-width-down/1000?cb=20161222200418"
        ),
        SkinStatus(
            skinName = "Sawborg (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/0/0c/SAWborgR.jpg/revision/latest/scale-to-width-down/1000?cb=20161222200406",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Sawborg (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/d/d8/SAWborgE.jpg/revision/latest/scale-to-width-down/1000?cb=20161222200351",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Sawborg (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/c/c2/SAWborgL.jpg/revision/latest/scale-to-width-down/1000?cb=20161222200400",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Summer Party Saw (SE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/2/2d/SPSAWSE.jpg/revision/latest/scale-to-width-down/1000?cb=20161222200413",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    )
)