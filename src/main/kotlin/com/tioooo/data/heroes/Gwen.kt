package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val gwen = Hero(
    id = 16,
    name = "Gwen",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/gwen.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/GwenActive-2.png",
    desc = "Gwen moves swiftly across the map, picking off enemies from a distance. She can shake off negative effects inflicted by her enemies, turning the tables in her favor. Gwen is best played in the lane where she can earn gold and gear up for big fights.",
    power = listOf(
        PowerStatus("Health", 1375.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 126.6, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 30.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Boomstick (Perk)",
            skillDesc = "After not attacking for a brief time, Gwen’s next basic attack deals additional weapon damage. Attack speed reduces the time before this empowered attack becomes available.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/0_perk_boomstick.png",
        ), SkillStatus(
            skillName = "Buckshot Bonanza",
            skillDesc = "Gwen blasts enemies in the target direction, damaging all targets in a cone. Enemies hit by this ability are slowed and revealed for a short time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/1_A_buckshot-bonanza.png",
        ), SkillStatus(
            skillName = "Skedaddle",
            skillDesc = "When activated, Gwen instantly removes negative effects from herself and blocks further effects for a short time. Additionally, she gains a temporary burst of bonus move speed.\n" +
                    "\n" +
                    "Passive: Gwen gains bonus move speed. This effect is disabled for a few seconds upon taking damage from an enemy hero, but it is otherwise permanent.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/2_B_skedaddle.png",
        ), SkillStatus(
            skillName = "Aces High",
            skillDesc = "Gwen pulls an ace from up her sleeve and flings it in the target direction. The card deals damage to everything it passes through. The ace impacts and stuns the first enemy hero in its path.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/10/3_C_aces-high.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/d/d3/Gwen_splash.jpg/revision/latest?cb=20190119123928"
        ),
        SkinStatus(
            skinName = "'Gangster' Gwen (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/0/06/Gwen_skingangster%28R%29.jpg/revision/latest?cb=20190117143759",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "'Red Lantern' Gwen (SE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/1/1b/Gwen_skinredlantern%28R%29.jpg/revision/latest?cb=20190117143814",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "'Snow Bunny' Gwen (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/a/a2/Gwen_skinsnowbunny%28E%29.jpg/revision/latest?cb=20190119163951",
            skinType = SKIN.EPIC,
        ),
    )
)