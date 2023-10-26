package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val kestrel = Hero(
    id = 20,
    name = "Kestrel",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/kestrel.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/KestrelActive.png",
    desc = "Kestrel is an elite Stormguard archer who takes down targets from a distance. When building weapon, she deals rapid, sustained damage and uses stealth to find better footing when enemies get too close. Kestrel’s crystal path affords longer stealth times, which sets up aggressive tactical plays. She’s best in the lane where she can use the protection of her turret to safely collect gold.",
    power = listOf(
        PowerStatus("Health", 1407.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 98.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Adrenaline (Perk)",
            skillDesc = "Whenever Kestrel lands a basic attack, she gains attack speed and reduces the cost of her abilities. This stacks up to 5 times and and wears off after a short time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Adrenaline.png",
        ), SkillStatus(
            skillName = "Glimmershot",
            skillDesc = "Kestrel fires an arrow, landing an armor-piercing basic attack on the first target in its path. The arrow then pierces through, dealing crystal damage to the target and other enemies behind it. Kestrel can keep several arrows in reserve. After a duration without using her bow, these arrows are automatically reloaded. Reload time is decreased based on attack speed.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestral_-A_02.jpg",
        ), SkillStatus(
            skillName = "Active Camo",
            skillDesc = "Kestrel instantly vanishes from sight and gains bonus move speed. Additionally, she leaves an invisible phosphor mist at her location, revealing enemies as they walk through it. If Kestrel deals damage to an enemy hero within the mist, the mist will detonate, damaging and stunning all enemies within its area.\n" +
                    "\n" +
                    "Kestrel’s basic attacks reduce the cooldown of Active Camo. However, Active Camo cannot be triggered while Kestrel is taking damage from an enemy hero, putting it on cooldown. The length of time Active Camo is disabled is reduced by bonus weapon power.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestral_-B.jpg",
        ), SkillStatus(
            skillName = "One Shot. One Kill",
            skillDesc = "After a delay, Kestrel fires a single arrow across the fold, impacting on the first enemy hero, large creature or structure in its path. When this hits an enemy hero, it reveals that hero and grants Kestrel full Adrenaline stacks. This deals reduced damage to non-heroes.\n" +
                    "\n" +
                    "The base damage dealt by this ability is weapon damage. Higher ranks of this ability gain armor piercing.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestral_C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestrel_splash_art.jpg"
        ),
        SkinStatus(
            skinName = "Sylvan Kestrel (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestrel_Sylvan_T1-web.png",
            skinType = SKIN.RARE,
        ),

        SkinStatus(
            skinName = "Winter War Kestrel (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestrel_WinterWar-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Spider Queen Kestrel (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestrel_SpiderQueen-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Summer Kestrel (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/12/Kestrel_Summer-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    )
)