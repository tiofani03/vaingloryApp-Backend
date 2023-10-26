package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val samuel = Hero(
    id = 35,
    name = "Samuel",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/samuel.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/SamuelActive.png",
    desc = "Samuel is a dark mage who controls large areas with his abilities. Samuel is able to deal damage on the move, but he may be caught out of position if played too aggressively. He is well suited in the lane, able to bully his victim while draining health and energy to sustain himself.",
    power = listOf(
        PowerStatus("Health", 1479.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 147.96, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 32.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Corrupted Genius (Perk)",
            skillDesc = "Every 6 seconds, Samuel’s next basic attack fires a bolt of dark power at the target, dealing 50-160 (+60% CP) bonus crystal damage. Samuel then draws that power back to himself, restoring 50-160 health and 50-160 energy. The restorative effects are only 25% as effective against non-heroes.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/08/corrupted-genius.png",
        ), SkillStatus(
            skillName = "Malice & Verdict",
            skillDesc = "Samuel fires two quick shots from his wands at a target location that impact on the first enemy hit. Samuel can move between the shots.\n" +
                    "\n" +
                    "If Samuel is standing inside the field from Drifting Dark, this ability is empowered. While empowered, the shots move faster, travel farther, deal additional damage and burst upon impact dealing damage in a small area. In addition, the cooldown for this ability is significantly reduced.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/08/malice-verdict.png",
        ), SkillStatus(
            skillName = "Drifting Dark",
            skillDesc = "Samuel creates a large field of darkness that slowly drifts forward, damaging enemies who stand inside it. If Samuel also stands inside, he heals for a small amount for each affected target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/08/drifting-dark.png",
        ), SkillStatus(
            skillName = "Oblivion",
            skillDesc = "After a short delay, Samuel summons a phantasm at the target location, which puts nearby enemies to sleep. Enemies inflicted are unable to move or act.\n" +
                    "\n" +
                    "Dealing direct damage to a sleeping enemy with an attack or ability will wake them up.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/08/oblivion.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/S01AKcC0TR0/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "'Apprentice' Samuel (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/09/Samuel_Apprentice-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "'Evolution' Samuel (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/09/Samuel_Cuber-web.png",
            skinType = SKIN.EPIC,
        ),
    )
)