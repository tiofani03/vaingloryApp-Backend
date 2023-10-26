package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val skye = Hero(
    id = 39,
    name = "Skye",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/skye.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/SkyeActive.png",
    desc = "Skye is a swift sniper able to dance at the edge of fights or dive deep into the enemy backline to kill key targets. Skye’s unique strafing attacks change the complexion of fights, and her ability to chase down and catch opponents is unparalleled.",
    power = listOf(
        PowerStatus("Health", 1563.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 128.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Target Lock (Perk)",
            skillDesc = "Skye locks onto and reveals the target she most recently basic attacked. Basic attacks and Forward Barrage on that locked target grant her bonus move speed. This speed bonus is dramatically reduced while moving backward. Target Lock is lost if the target moves too far away from Skye or if she doesn’t attack her target for too long.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Skye_P.jpg",
        ), SkillStatus(
            skillName = "Forward Barrage",
            skillDesc = "Skye fires her guns while strafing. (She can move freely but cannot change her facing direction.) Reactivating this ability will cancel it. Forward Barrage deals damage to her locked target (but less damage to non-heroes). The duration increases with Skye’s crystal power up to a max.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Skye_A2.jpg",
        ), SkillStatus(
            skillName = "Suri Strike",
            skillDesc = "Passive: Each ability point in Suri Strike increases the amount of time Skye can keep her target locked without attacking it.\n" +
                    "\n" +
                    "Active: Skye dashes to a chosen location near her locked target. While dashing, she fires a volley of missiles that lead her target. This ability can only be activated when Skye has a locked target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Skye_B1.jpg",
        ), SkillStatus(
            skillName = "Death Form Above",
            skillDesc = "Passive: Each ability point in Death from Above increases Skye’s target-lock range.\n" +
                    "\n" +
                    "Active: Skye fires a salvo of missiles at a chosen location near her locked target. After a brief delay, the missiles rain down on that location, stunning enemies. Enemies still in the area afterward are slowed and take crystal damage. Aiming directly on your locked target rains down the missiles in a cluster. Aiming away from your locked target rains them down in a line across the target’s path. This ability can only be activated when Skye has a locked target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Skye_C1.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Skye_Splash1000.jpg"
        ),
        SkinStatus(
            skinName = "Supersonic Skye (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Skye_T1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Supersonic Skye (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Skye_T2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Supersonic Skye (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Skye_T3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Ride or Die Sky (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/09/Skye_RideorDie-web.png",
            skinType = SKIN.LEGENDARY,
        ),
    )
)