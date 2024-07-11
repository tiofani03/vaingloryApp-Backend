package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.ATTACK_TYPE.MELEE
import com.tioooo.utils.Constants
import com.tioooo.utils.POSITION
import com.tioooo.utils.ROLE
import com.tioooo.utils.SKIN

val tony = Hero(
    id = 41,
    name = "Tony",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/tony.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2018/03/TonyActive.png",
    desc = "Tony is a dwarven brawler who taunts and pummels enemies",
    power = listOf(
        PowerStatus("Health", 2544.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 60.4, Constants.MAX_ARMOR),
        PowerStatus("Attack", 164.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Come At Me (Perk)",
            skillDesc = "When Tony receives damage, he gains a health barrier for a short duration. Once activated, this ability will go on cooldown.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2019/10/Tony_PERK.jpg",
        ), SkillStatus(
            skillName = "Jawbreaker",
            skillDesc = "Tony's next three basic attacks are empowered. These attacks launch Tony toward his target, dealing bonus damage. The third attack is a two-handed strike that will stun his target.\n" +
                    "\n" +
                    "Tony also gains a decaying move speed bonus when activating this ability.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2019/10/Tony_E.jpg",
        ), SkillStatus(
            skillName = "Trash Talk",
            skillDesc = "Tony hurls insults in the target direction. All enemies hit receive damage and are forced to attack Tony. This also resets the cooldown of Come At Me, allowing it to trigger again.\n" +
                    "\n" +
                    "Tony gains damage reduction while taunting. The duration is further increased with weapon power up to a max.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2019/10/Tony_B.jpg",
        ), SkillStatus(
            skillName = "Bada Boom",
            skillDesc = "Tony winds up, then dashes to target location, releasing a massive spinning uppercut. This colossal punch deals crystal damage and knocks away all enemies caught in the area.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2019/10/Tony_C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vaingloryfire.com/images/heroes/potrait/tony.png"
        ),
        SkinStatus(
            skinName = "Steam Knight Tony (R)",
            skinImage = "https://en.vainglorygame.com/wp-content/uploads/2018/03/1000px_tony_streamknight_final_splash.jpg",
            skinType = SKIN.RARE,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffa0b040,
        darkVibrant = 0xFF1E1E1E,
        onDarkVibrant = 0xFFFFFFFF,
    )
)