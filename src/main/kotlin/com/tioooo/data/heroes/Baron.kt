package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val baron = Hero(
    id = 6,
    name = "Baron",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/baron.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2016/09/19_Baron-e1474058250671.png",
    desc = "Baron rains destruction on his opponents. When building crystal items, he becomes mobile artillery, laying siege to enemy teams. His weapon path enables aggressive in-your-face tactics. No matter how he builds, he brings incredible range and powerful burst damage to any team.",
    power = listOf(
        PowerStatus("Health", 1672.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 108.4, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 26.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Rocket Launcher (Perk)",
            skillDesc = "Baron’s basic attacks deal 130% weapon damage to the target and surrounding enemies. These explosions deal reduced damage to lane minions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/0_perk_rocket-launcher.png",
        ), SkillStatus(
            skillName = "Porcupine Mortar",
            skillDesc = "Baron launches artillery toward the target location, damaging enemies on impact. Enemies caught by the explosion are also slowed for a short period of time. Weapon power strengthens the slow while crystal power increases the range of the ability.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/1_A_porcupine-mortar.png",
        ), SkillStatus(
            skillName = "Jump Jets",
            skillDesc = "After a short delay, Baron launches to the target location, then gains bonus move speed for a short period of time. After landing, his next basic attack fires quickly and reloads instantly. Crystal power can extend the range of the jump while weapon power can shorten the delay of the jump.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/2_B_jump-jets.png",
        ), SkillStatus(
            skillName = "Ion Cannon",
            skillDesc = "Baron targets a location for an orbital strike. After a brief delay, the location is obliterated, dealing massive damage to all enemies in the area. This deals full damage to enemies near the center and deals less near the edges. This ability also passively increases Baron’s basic attack range every level.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/3_C_ion-cannon.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/qTHw50-xTbc/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "'Elite Force' Baron (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/EliteForceBaron-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "'Fly or Die' Baron (L)",
            skinImage = "https://kr.vainglorygame.com/wp-content/uploads/2017/10/Fy_or_die_baron_1000px.jpg",
            skinType = SKIN.LEGENDARY,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff0d810,
        darkVibrant = 0xff986810,
        onDarkVibrant = 0xf1ffffff,
    )
)