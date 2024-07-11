package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val vox = Hero(
    id = 43,
    name = "Vox",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/vox.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/VoxActive.png",
    desc = "Vox is a mobile sniper with a high-energy playstyle, able to quickly and frequently dash around the battlefield. Vox deals significant damage either to a single target or to groups of enemies depending on his build. This allows Vox to react to the needs of his team.",
    power = listOf(
        PowerStatus("Health", 1465.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 79.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Julia's Song (Perk)",
            skillDesc = "Vox's basic attacks also deal 34-68 (level 1-12) +35% of crystal power as bonus damage. When attacking enemies with Resonance, this damage will bounce to two nearby enemies and refresh Resonance on that target.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Vox-P-julias-song.png",
        ), SkillStatus(
            skillName = "Sonic Zoom",
            skillDesc = "Vox dashes in the targeted direction, throwing two attacks to the nearest enemy marked by Resonance (prioritizing heroes).",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Vox-A-sonic-zoom.png",
        ), SkillStatus(
            skillName = "Pulse",
            skillDesc = "Vox emits a sonic pulse that echoes off nearby enemies and applies Resonance. The pulse applies a slow that is significantly stronger near its center. Each upgrade to Pulse increases the damage Vox's basic & bouncing attacks deal to targets with Resonance.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Vox-B-pulse.png",
        ), SkillStatus(
            skillName = "Wait For It",
            skillDesc = "Vox fires an ultrasonic wave that applies Resonance to enemies in its path and refreshes all Resonance. Shortly after, a wide shockwave explodes along the same path, dealing crystal damage and silencing enemies. Striking enemy heroes with the shockwave will also cause Resonance to bounce.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Vox-C-wait-for-it.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/b/bd/Vox.jpg/revision/latest/scale-to-width-down/1000?cb=20150410212900"
        ),
        SkinStatus(
            skinName = "Evolution Vox (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/8/8f/Vox_skinevolution%28L%29.jpg/revision/latest?cb=20190119160944",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "School Day Vox(E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/f/f8/Vox_skinschooldays%28E%29.jpg/revision/latest?cb=20190119160930",
            skinType = SKIN.EPIC,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff07838,
        darkVibrant = 0xff380808,
        onDarkVibrant = 0x78ffffff,
    )
)