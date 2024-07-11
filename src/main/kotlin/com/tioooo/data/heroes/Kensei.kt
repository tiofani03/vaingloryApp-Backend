package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.ATTACK_TYPE.MELEE
import com.tioooo.utils.Constants
import com.tioooo.utils.POSITION
import com.tioooo.utils.ROLE
import com.tioooo.utils.SKIN

val kensei = Hero(
    id = 19,
    name = "Kensei",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/kensei.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/06/KenseiActive.png",
    desc = "Kensei is an agile swordmaster who excels at fighting durable heroes. Generate stacks with his Perk, Immovable Mind, to deal bonus damage and gain a burst of barrier; make sure you’re constantly attacking opponents with large health pools to deal massive damage and to gain larger barriers. Purchase cooldown reduction items to frequently use Lotus Strike and Kensho, for increased mobility and ability empowerment. When the time is right, deliver a fierce killing blow to anyone in Kensei’s path with his Ultimate ability, Path of the Ronin.",
    power = listOf(
        PowerStatus("Health", 2488.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 64.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 163.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 36.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = MELEE,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Immovable Mind (Perk)",
            skillDesc = "Kensei generates stacks by attacking enemy heroes or jungle monsters. Once enough stacks are obtained, Kensei’s next basic attack deals bonus damage and grants a burst of barrier. The strength of the barrier gained is dependent on target. Attacking heroes will generate a stronger barrier. Additionally, Kensei’s basic attacks deal increased damage to heroes with higher health.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/05/Perk.png",
        ), SkillStatus(
            skillName = "Lotus Strike",
            skillDesc = "Kensei rushes forward, swinging his blade and dealing basic attack damage in an arc in front of him. This ability can be reactivated two additional times within a short window of time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/05/A.png",
        ), SkillStatus(
            skillName = "Kensho",
            skillDesc = "Kensei strikes his target and leaps backward, entering Kensho Stance. Using another ability within a short duration provides bonus effects. Lotus Strike travels farther and slows. Path of the Ronin stuns.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/05/B.png",
        ), SkillStatus(
            skillName = "Path of the Ronin",
            skillDesc = "Kensei readies himself before quickly rushing forward, dealing basic attack plus bonus damage to all enemies in his wake.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/05/C.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/b/b5/Kensei_splash.jpg/revision/latest/scale-to-width-down/1000?cb=20190119154822"
        ),
        SkinStatus(
            skinName = "'Taizen Boss' Kensei (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/3/32/Kensei_skintaizenboss%28R%29.jpg/revision/latest?cb=20190119152135",
            skinType = SKIN.RARE,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xff802828,
        darkVibrant = 0xff583028,
        onDarkVibrant = 0x8bffffff,
    )
)