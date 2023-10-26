package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val churnWalker = Hero(
    id = 10,
    name = "Churnwalker",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/churnwalker.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/10/ChurnwalkerActive.png",
    desc = "Churnwalker is a disruptor who throws multiple skillshot hooks, chaining victims to him.",
    power = listOf(
        PowerStatus("Health", 2678.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 70.05, Constants.MAX_ARMOR),
        PowerStatus("Attack", 165.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Futility of Life (Perk)",
            skillDesc = "- Whenever chained victims take damage from any source, Churnwalker regenerates a percentage of that damage as health.\n" +
                    "- Whenever any chained victim takes damage, a percentage of that damage is conferred on all other chained victims.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/churnwalker_talents_perk.jpg",
        ), SkillStatus(
            skillName = "Hook & Chain",
            skillDesc = "Churnwalker throws a skillshot hook that chains victims to him and damages heroes over time. Hitting a hook resets this ability’s cooldown.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/ChurnWalker_ability_a.jpg",
        ), SkillStatus(
            skillName = "Torment",
            skillDesc = "Torment yanks all chained victims toward Churnwalker a fixed distance, damaging them.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/ChurnWalker_ability_b.jpg",
        ), SkillStatus(
            skillName = "Trespass",
            skillDesc = "Churnwalker channels churn power for a short time, then travels to the target location, stunning all chained victims and breaking all chains. Churnwalker can only target a location near a chained victim. Leveling this ability increases its stun duration and lowers its cooldown.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/ChurnWalker_ability_c-e1507585501815.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/Article-CW.jpg"
        ),
        SkinStatus(
            skinName = "Clown Walker (R)",
            skinImage = "https://dmu9n6at1rzsj.cloudfront.net/original/2X/e/e83f8afac1298535cc9f1bef80ad9acbf7536557.jpeg",
            skinType = SKIN.RARE,
        ),
    )
)