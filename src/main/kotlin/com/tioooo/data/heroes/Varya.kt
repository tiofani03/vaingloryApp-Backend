package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*
import com.tioooo.utils.ATTACK_TYPE.MELEE

val varya = Hero(
    id = 42,
    name = "Varya",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/varya.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/01/VaryaActive-1.png",
    desc = "Shocking valkyrie who chains massive damage across enemy teams",
    power = listOf(
        PowerStatus("Health", 2127.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 50.3, Constants.MAX_ARMOR),
        PowerStatus("Attack", 94.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Chain Lightning (Perk)",
            skillDesc = "Varya’s attacks deal crystal damage. If Varya holds her ground after attacking, she will strike her target and additional enemies with a bolt of Chain Lightning. This bolt deals the same damage and consumes energy.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/12/Perk_varya_chain_lightning.jpg",
        ), SkillStatus(
            skillName = "Stromforged Spear",
            skillDesc = "Varya throws a lightning spear that deals damage to the first enemy hero hit. The lightning will then bounce to nearby enemies dealing damage. Stormforged Spear has a reduced cast time when used during or after Arc Recursion.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/12/A_icon_varya_lightning_bolt.jpg",
        ), SkillStatus(
            skillName = "Arc Recursion",
            skillDesc = "After gathering power, Varya’s next two move commands will instantly dash in the chosen direction, dealing damage to nearby enemies upon arrival. Varya gains energy and some of her health as barrier for each enemy hit. Varya can cancel this early to dash a single time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/12/B_icon_varya_Charge_dash.jpg",
        ), SkillStatus(
            skillName = "Anvil’s Hammer",
            skillDesc = "After channeling, Varya calls down a series of lightning strikes on all enemy heroes, dealing damage per hit.\n" +
                    "\n" +
                    "Ranking up this ability increases Varya’s attack speed and the number of enemies struck by Chain Lightning and Stormforged Spear.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/12/C_icon_varya_Lightning_storm.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://64.media.tumblr.com/3576eada472dda2bf8dbfce2b3210bfc/tumblr_p0k55cdhMZ1urxtd9o1_1280.jpg"
        ),
        SkinStatus(
            skinName = "Winter Varya (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/11/1000px_Winter_Varya_Skin_edit_final.jpg",
            skinType = SKIN.RARE,
        ),
    )
)