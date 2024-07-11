package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val grace = Hero(
    id = 14,
    name = "Grace",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/grace.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/GraceActive.png",
    desc = "Grace leads her team into battle by charging forward with her giant mace. Utilizing the power of the Light, she protects her allies by granting them holy shields that greatly reduce incoming damage. When the fight seems bleak, she can turn the tides of battle by calling upon the Seraphim to dish out massive single-target heals.",
    power = listOf(
        PowerStatus("Health", 1452.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 158.2, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 37.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Retribution (Perk)",
            skillDesc = "Grace chains her normal basic attack into a ground slam, dealing bonus weapon damage and slowing enemies in a wide area. If any enemies are hit by the ground slam, her ability cooldowns are reduced.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/07/Grace_Perk.png",
        ), SkillStatus(
            skillName = "Benediction",
            skillDesc = "Grace dashes to an enemy striking them with Retribution and dealing bonus damage and gains a full holy shield while granting nearby allies a partial holy shield.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/07/Grace_A.png",
        ), SkillStatus(
            skillName = "Holy Nova",
            skillDesc = "Grace channels briefly before knocking surrounding enemies into the air to deal crystal damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/07/Grace_B.png",
        ), SkillStatus(
            skillName = "Divine Intervention",
            skillDesc = "Grace grants herself and her target a full holy shield and begins a channel after which her target is healed.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/07/Grace_C.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/a/a3/Grace_splash.jpg/revision/latest?cb=20190117054816"
        ),
        SkinStatus(
            skinName = "Valkyrie' Grace (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/9/93/Grace_skinvalkyrie%28E%29.jpg/revision/latest?cb=20190117084805",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Tea Party' Grace (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/3/30/Grace_skinteaparty%28L%29.jpg/revision/latest?cb=20190117084841",
            skinType = SKIN.LEGENDARY,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffd0b038,
        darkVibrant = 0xff882030,
        onDarkVibrant = 0xa2ffffff,
    )
)