package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val reim = Hero(
    id = 31,
    name = "Reim",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/reim.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/ReimActive.png",
    desc = "Reim is a grumpy old winter mage who freezes everyone who crosses him. Though he moves slowly, he deals heavy damage to opponents while being surprisingly resilient himself. He holds his own in the lane, but he’s particularly effective in the jungle where he can go toe-to-toe against most opponents that he can catch.",
    power = listOf(
        PowerStatus("Health", 1894.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 47.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 154.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Frostguard (Perk)",
            skillDesc = "Reim’s basic attacks deal 20-54 (+125% crystal power) bonus crystal damage over 2 seconds and grant 50% of the damage dealt with this effect as fortified health (reduced against non-heroes).\n" +
                    "\n" +
                    "Reim’s attacks and abilities also chill opponents. Basic attacks against targets that are already chilled apply a 60% slow that decays over 0.6 seconds.\n" +
                    "\n" +
                    "(Fortified health absorbs 50% of incoming damage until it is depleted.)",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_Frostguard_Perk.jpg",
        ), SkillStatus(
            skillName = "Winter Spire",
            skillDesc = "Reim summons a spire of ice at a nearby location, dealing crystal damage to surrounding enemies. After a short delay, the spire shatters, dealing heavy crystal damage. 35% of the damage dealt with this ability is gained as fortified health. Damage dealt and fortified health gained is reduced against non-heroes.\n" +
                    "\n" +
                    "This ability deals 25% increased damage to chilled targets.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_Glacial_Shard_Ability_A.jpg",
        ), SkillStatus(
            skillName = "Chill Winds",
            skillDesc = "Reim deals a burst of crystal damage to all surrounding enemies (25% damage to minions).\n" +
                    "\n" +
                    "This ability roots enemies who are chilled, temporarily preventing them from moving. A rooted enemy can still attack.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_Chill_Winds_Ability_B.jpg",
        ), SkillStatus(
            skillName = "Valkyrie",
            skillDesc = "Reim summons an ancient valkyrie, devastating enemies at the target location. All enemies are slowed, while enemies closer to the center are stunned and take increased damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_Winter_Valkyrie_Ultimate.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/4/46/Reim.jpeg/revision/latest?cb=20160906205411"
        ),
        SkinStatus(
            skinName = "North Wind Reim (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_NorthWindT1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "North Wind Reim (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_NorthWindT2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "North Wind Reim (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_NorthWindT3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Deathless Reim (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/01/Reim_Deathless-web.png",
            skinType = SKIN.RARE,
        ),
    )
)