package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.ATTACK_TYPE.MELEE
import com.tioooo.utils.ATTACK_TYPE.RANGED
import com.tioooo.utils.Constants
import com.tioooo.utils.POSITION
import com.tioooo.utils.ROLE
import com.tioooo.utils.SKIN

val malene = Hero(
    id = 27,
    name = "Malene",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/malene.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/06/MaleneActive.png",
    desc = "A form-swapping spellcaster who deals massive crystal damage with light and shadow abilities",
    power = listOf(
        PowerStatus("Health", 2148.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 53.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 110.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Masked Ball (Perk)",
            skillDesc = "Malene’s ultimate is available at level 1 and allows her to switch between Light Form and Shadow Form. Additionally, Malene’s basic attacks deal crystal damage.\n" +
                    "\n" +
                    "For a short duration after switching forms, Malene’s next basic attack is empowered.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/04/Malene_Perk.png",
        ), SkillStatus(
            skillName = "Light Ribbons (LIGHT FORM) / Shadow Tendrils (SHADOW FORM)",
            skillDesc = "LIGHT RIBBONS (LIGHT FORM)\n" +
                    "\n" +
                    "Malene sends ribbons of light in a chosen direction, damaging and immobilizing the first enemy hit.\n" +
                    "\n" +
                    "SHADOW TENDRILS (SHADOW FORM)\n" +
                    "\n" +
                    "Malene unleashes three shadow tendrils in a chosen direction, dealing crystal damage to all enemies along their path.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/Malene-A-Merged.jpg",
        ), SkillStatus(
            skillName = "Royal Amnesty (LIGHT FORM) / Wicked Escapade (SHADOW FORM)",
            skillDesc = "ROYAL AMNESTY (LIGHT FORM)\n" +
                    "\n" +
                    "Malene imbues herself with light, granting herself a barrier and movement speed for boost.\n" +
                    "\n" +
                    "WICKED ESCAPADE (SHADOW FORM)\n" +
                    "\n" +
                    "Malene becomes invulnerable and untargetable for for a short time, slowing enemies she passes through and leaving behind a pit of shadow. Enemies inside the pit are dealt damage when Malene reappears.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/Malene_B-Merged.jpg",
        ), SkillStatus(
            skillName = "Enhanced Transformation",
            skillDesc = "Malene switches between Light Form and Shadow Form, swapping abilities and gaining an empowerment on her next basic attack. The empowerment gained is dependent on the form she switches into.\n" +
                    "\n" +
                    "Shadow Empowerment: deals bonus damage\n" +
                    "\n" +
                    "Light Empowerment: slows target",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2018/06/Malene_C_Merged.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/9H2Xp_HWB8o/maxresdefault.jpg"
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xff50b8d0,
        darkVibrant = 0xff582838,
        onDarkVibrant = 0x88ffffff,
    )
)