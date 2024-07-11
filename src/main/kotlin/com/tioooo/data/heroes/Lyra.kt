package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val lyra = Hero(
    id = 26,
    name = "Lyra",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/lyra.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/LyraActive.png",
    desc = "Drawing upon her training as a Gythian battlemage, Lyra uses healing and protective magic to turn enemy positions into powerful zones for her allies. Her portals also allow her team to bypass these positions entirely, avoiding defenses and terrain. Utility and defense items improve her role as a healer, while crystal items provide a devastating but fragile mage path.",
    power = listOf(
        PowerStatus("Health", 1256.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 58.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 94.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Principle Arcanum",
            skillDesc = "Lyra’s attacks are arcane missiles, dealing crystal damage. If she holds her ground after releasing an attack, she automatically channels and releases a much stronger arcane missile that deals additional crystal damage and briefly slows its target. Each channeled missile consumes energy, but Lyra can continue using these even if she runs out of energy.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_Ability_Icons_perk_square.png",
        ),
        SkillStatus(
            skillName = "Imperial Sigil",
            skillDesc = "Lyra forms a sigil at the target location, revealing surrounding enemies. While this sigil remains active, it heals nearby allied heroes and damages nearby enemy heroes. Lyra can reactivate this ability at any time to detonate the sigil, dealing heavy damage to surrounding enemies while providing a burst of healing and a moderate move speed boost to nearby allies.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_Ability_Icons_A1.png",
        ),
        SkillStatus(
            skillName = "Bright Bulwark",
            skillDesc = "After a brief delay, Lyra releases a pulse of magical energy, damaging and applying a decaying slow to surrounding enemies. The affected area then becomes a walled zone of protection that deals the same damage and slow to enemies attempting to cross its borders. Enemies inside the zone are snared, allowing them to move normally but preventing them from using movement abilities.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_Ability_Icons_B.png",
        ),
        SkillStatus(
            skillName = "Arcane Passage",
            skillDesc = "Lyra blinks to the target location, leaving portals at both the beginning and the end of the blink. Portals last for a few seconds, allowing allied and enemy heroes to move freely between them in both directions. Heroes must wait several seconds before they can re-enter a portal. This cooldown is also applied to enemies when Lyra hits them with the initial pulse of Bright Bulwark.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_Ability_Icons_C.png",
        ),
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vaingloryfire.com/images/heroes/potrait/lyra.png"
        ),
        SkinStatus(
            skinName = "School Days Lyra (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_SchoolDays-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Dear Diary Lyra (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2016/06/Lyra_Unicorn-web.jpg",
            skinType = SKIN.LEGENDARY,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffc85060,
        darkVibrant = 0xff481818,
        onDarkVibrant = 0x7dffffff,
    )
)