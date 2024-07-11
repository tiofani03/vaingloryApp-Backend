package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.ATTACK_TYPE.MELEE
import com.tioooo.utils.ATTACK_TYPE.RANGED
import com.tioooo.utils.Constants
import com.tioooo.utils.POSITION
import com.tioooo.utils.ROLE
import com.tioooo.utils.SKIN

val kinetic = Hero(
    id = 21,
    name = "Kinetic",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/kinetic.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/06/KineticActive.png",
    desc = "Kinetic is a ranged carry who exerts her dominance in extended team fights by using her Perk, Tracer Shots; be sure that you’re constantly firing Plasma Drivers to optimize her damage and taking advantage of your Inertial Dash-charged Plasma Driver to create excellent engagements and disengagement opportunities. Want to deliver the final blow to an enemy hero? Charged Pulse is great for finishing off fleeing foes. Make sure to line up your shot when enemy heroes are preoccupied to avoid being blocked.",
    power = listOf(
        PowerStatus("Health", 2019.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 53.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 97.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Tracer Shots  (Perk)",
            skillDesc = "Landing Plasma Driver grants Kinetic Tracer Shots stacks.\n" +
                    "Tracer Shots: Kinetic fires a tracer at her target. Tracer damage increases when more stacks are gained.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/perk_kinetic_tracer_shots.jpg",
        ), SkillStatus(
            skillName = "Plasma Driver ",
            skillDesc = "Kinetic fires a shot from her Plasma Driver, dealing damage to the first enemy hit. If Kinetic has a stack of Tracer Shots, she consumes it to fire a charged shot that deals bonus damage and slows the target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/A_icon_kinetic_plasma_driver.jpg",
        ), SkillStatus(
            skillName = "Inertial Dash",
            skillDesc = "Kinetic dashes and temporarily becomes Charged; refreshes Plasma Driver’s cooldown.\n" +
                    "\n" +
                    "Charged: Kinetic’s next Plasma Driver deals more damage, has increased range, and slows her target.\n" +
                    "Overdrive: Kinetic’s next Plasma Driver briefly stuns her target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/B_icon_kinetic_inertial_dash.jpg",
        ), SkillStatus(
            skillName = "Charged Pulse",
            skillDesc = "Kinetic charges up a powerful blast and fires it at her target. Using Charged pulse Consumes all stacks of Tracer Shots to deal bonus damage per stack. Can be blocked by enemy heroes, structures, and jungle bosses.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/C_icon_kinetic_charged_pulse.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/c/c8/Kinetic_splash.jpg/revision/latest?cb=20190119023809"
        ),
        SkinStatus(
            skinName = "Kinetic skinenforcer (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/4/41/Kinetic_skinenforcer%28R%29.jpg/revision/latest?cb=20190119023825",
            skinType = SKIN.RARE,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xff28d8b8,
        darkVibrant = 0xff209888,
        onDarkVibrant = 0xbe000000,
    )
)