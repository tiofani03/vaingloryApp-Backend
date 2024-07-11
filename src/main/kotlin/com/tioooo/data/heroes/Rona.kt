package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val rona = Hero(
    id = 34,
    name = "Rona",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/rona.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/RonaActive-1.png",
    desc = "Rona is a deadly berserker who is always ready to leap into battle. She holds her own in melee combat, unleashing enormous damage. Rona is best played in the jungle, pairs well with protectors and works well with both weapon and crystal builds.",
    power = listOf(
        PowerStatus("Health", 1789.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 152.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Berserkers' Fury (Perk)",
            skillDesc = "Rona attacks 50% faster than most heroes, but she deals only 80% damage with each attack.\n" +
                    "\n" +
                    "Additionally, Rona's abilities use Bloodrage instead of energy, a unique resource that is generated from basic attacks, abilities and taking damage from enemies. This caps at 100 and decays when Rona leaves combat. Energy and energy regeneration from items is converted to in-combat bloodrage generation.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/RonaPberserkers-fury.png",
        ), SkillStatus(
            skillName = "Into The Fray",
            skillDesc = "Rona leaps into battle, gaining bloodrage from colliding with enemies. She also gains damage reduction for 3 seconds based on the number of enemy heroes she hits. After a short delay, the ground ruptures for 3 seconds, slowing enemies who pass over it for 35%.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/RonaAinto-the-fray.png",
        ), SkillStatus(
            skillName = "Foesplitter",
            skillDesc = "Rona lunges to her target, landing a basic attack and gaining bloodrage. Briefly after using this ability she can reactivate it to attack again, consuming all of her bloodrage and applying a mortal wound to her target. The damage of the second attack is increased by 0.35% for each point of bloodrage consumed. Additionally, the cooldown for this ability is reduced by 1 second with Rona's basic attack.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/RonaBfoesplitter.png",
        ), SkillStatus(
            skillName = "Red Mist",
            skillDesc = "Rona begins an axe-wielding whirlwind, continually dealing weapon damage to nearby enemies. During the whirlwind she can move freely but at reduced speed. She can cancel the ability at any time by reactivating it or using another ability. Red Mist requires at least 75 bloodrage to activate.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/RonaCred-mist.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory/images/9/9b/Rona.jpg/revision/latest?cb=20151011062832"
        ),
        SkinStatus(
            skinName = "Fury Rona (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Rona_Fury_T1-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Fury Rona (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Rona_Fury_T2-web.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Fury Rona (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Rona_Fury_T3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Red Rona (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Rona_Red-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Killer Bunny (LE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/08/Rona_KillerBunny_LE-web.png",
            skinType = SKIN.LIMITED_EDITION,
        ),

        ),
    stateColor = StateColor(
        vibrant = 0xffb82820,
        darkVibrant = 0xff782820,
        onDarkVibrant = 0x98ffffff,
    )
)