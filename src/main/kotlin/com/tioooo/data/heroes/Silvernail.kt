package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val silvernail = Hero(
    id = 37,
    name = "Silvernail",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/silvernail.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/06/silvernail_active.png",
    desc = "Take control of Silvernail, a ranged carry who wields a powerful crossbow that fires massive bolts, and tripwires that’ll stop enemies in their tracks. Silvernail specializes in controlling the battlefield through strategic use of his tripwires to block off entire sections of the map. Once he isolates his target, he uses his giant crossbow to send his foes to the afterlife.",
    power = listOf(
        PowerStatus("Health", 2175.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 42.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 151.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 35.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Double Shot (Perk)",
            skillDesc = "Silvernail loads an extra bolt into his crossbow which can be expended to chain a follow-up basic attack, dealing damage. The availability of Double Shot is shown by the white bar underneath his energy.\n" +
                    "\n" +
                    "• Attack speed reduces load time",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/08/Silvernail-Icon-Perk.jpg",
        ), SkillStatus(
            skillName = "Stake",
            skillDesc = "When Silvernail activates his first ability, he plants a Stake into the ground that can form a tripwire between any other nearby Stakes. This means that Silvernail can create tripwires in all kinds of configurations in order to best suit the battle at a given time.\n" +
                    "\n" +
                    "Enemy heroes that cross through tripwires are briefly slowed, silenced and take damage over time. These tripwires will also block dashes.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/08/Silvernail-Icon-A.jpg",
        ), SkillStatus(
            skillName = "Caustic Blessing",
            skillDesc = "Silvernail’s Caustic Blessing lobs a flask that deals damage in an area and reveals enemies hit for a short period of time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/08/Silvernail-Icon-B.jpg",
        ), SkillStatus(
            skillName = "Rebuke",
            skillDesc = "Silvernail’s ultimate, Rebuke, fires a piercing bolt that deals damage and impales every enemy in its path. Those struck by the bolt are dragged along the path and are stunned if they collide into a wall, structure or tripwire.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/08/Silvernail-Icon-C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/d/dd/Silvernail_splash.jpg/revision/latest?cb=20190121150111"
        ),
        SkinStatus(
            skinName = "'Tribal' Silvernail (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/4/4c/Silvernail_skinDD%28R%29.jpg/revision/latest/scale-to-width-down/1000?cb=20190121150310",
            skinType = SKIN.RARE,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffa0b040,
        darkVibrant = 0xFF1E1E1E,
        onDarkVibrant = 0xFFFFFFFF,
    )
)