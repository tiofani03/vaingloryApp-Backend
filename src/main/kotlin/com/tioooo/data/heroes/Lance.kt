package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val lance = Hero(
    id = 24,
    name = "Lance",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/lance.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/LanceActive.png",
    desc = "Lance depends on both his courage and his wits to protect his allies. With his unique polearm-and-shield combat style, he breaks enemy lines and creates opportunities for his friends. Lance can build crystal or utility items to excel in his role as a protector, or he can build weapon items to deal more damage during battle.",
    power = listOf(
        PowerStatus("Health", 2185.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 100.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 179.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Paristan's Technique (Perk)",
            skillDesc = "Lance’s basic attacks damage every target along their path. However, his attacks are slow to land and attack speed is less effective on him. Instead of energy, Lance uses stamina to activate his abilities. Purchasing items with energy and energy regeneration increases his stamina and stamina regeneration.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/lance_partisans-technique_perk.png",
        ), SkillStatus(
            skillName = "Impale",
            skillDesc = "Lance strikes through his opponents, dealing weapon damage and rooting them in place. If this attack hits at least one enemy, Lance will immediately recover from the ability. Overdrive: If this hits an enemy, it also resets the cooldown of Combat Roll.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/lance_impale_A.png",
        ), SkillStatus(
            skillName = "Gythian Wall",
            skillDesc = "Passive: Lance strafes around the enemy he has most recently attacked. While strafing, he reduces damage from the target’s direction by up to 50%.\n" +
                    "\n" +
                    "Active: Lance sweeps opponents away with his polearm, dealing weapon damage and also stunning them if they collide with a wall or structure. Afterward, he holds his shield steadfast, greatly reducing incoming damage from the target direction by up to 90%. Overdrive: While active, Lance ignores all debuffs (from any direction).",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/lance_gythian-wall_B.png",
        ), SkillStatus(
            skillName = "Combat Roll",
            skillDesc = "Lance rolls in the target direction. His next basic attack within 2 seconds will strike quickly, dealing bonus crystal damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/lance_combat-roll_C.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/e/e3/Lance.jpg/revision/latest?cb=20160524191920"
        ),
        SkinStatus(
            skinName = "'Nether Knight' Lance (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lance_NetherKnightT2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Nether Knight' Lance (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lance_NetherknightT3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "'Gladiator' Lance (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lance_gladiator-web.png",
            skinType = SKIN.EPIC,
        ),
    )
)