package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val reza = Hero(
    id = 32,
    name = "Reza",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/reza.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/RezaActive.png",
    desc = "Reza is a fiery assassin who melts enemy heroes by stringing together a series of devastating abilities. His Firestarter perk adds even more damage to basic attacks while Troublemaker allows him to finish off fleeing foes or escape near-death situations. ",
    power = listOf(
        PowerStatus("Health", 1464.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 154.4, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 35.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Firestarter (Perk)",
            skillDesc = "Scorcher and Netherform Detonator apply Firestarter to enemy targets.\n" +
                    "\n" +
                    "• Reza's basic attacks consume Firestarter, dealing crystal damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/08/Reza_Perk.png",
        ), SkillStatus(
            skillName = "Scorcher",
            skillDesc = "Reza smashes the ground, creating a fiery shockwave in front of him. This deals crystal damage to anything it passes through and collides with the first enemy hero or jungle monster hit.\n" +
                    "\n" +
                    "• Scorcher applies Firestarter on impact.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/08/Reza_A.png",
        ), SkillStatus(
            skillName = "Troublemaker",
            skillDesc = "Reza dashes to the target location, dealing crystal damage to enemies he passes through.\n" +
                    "\n" +
                    "• Reza's next basic attack deals bonus crystal damage.\n" +
                    "• This ability has 2 charges.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/08/Reza_C.png",
        ), SkillStatus(
            skillName = "Netherform Detonator",
            skillDesc = "Reza vanishes, then reappears at the target location in empowered demon form.\n" +
                    "\n" +
                    "• Upon reappearing, he unleashes a blazing explosion, damaging enemies and consuming Firestarter within the target radius.\n" +
                    "• Reza then applies Firestarter to all enemies nearby.\n" +
                    "• Each basic attack now applies Firestarter on enemies without Firestarter on them.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/08/Reza_B.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/9/9d/Reza_splash.jpg/revision/latest/scale-to-width-down/1000?cb=20190120134233"
        ),
        SkinStatus(
            skinName = "Nether Knight (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/8/82/Reza_skinnetherkinight%28E%29.jpg/revision/latest?cb=20190120134254",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Red Lantern' Reza (SE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/e/ee/Reza_skinredlantern%28SE%29.jpg/revision/latest?cb=20190120134245",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff0d810,
        darkVibrant = 0xff681820,
        onDarkVibrant = 0x8bffffff,
    )
)