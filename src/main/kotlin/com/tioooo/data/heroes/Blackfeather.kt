package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val blackfeather = Hero(
    id = 7,
    name = "Blackfeather",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/blackfeather.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/BlackfeatherActive.png",
    desc = "Blackfeather is a striking duelist who pierces the hearts of his opponents. When building weapon items, he becomes a powerful assassin. Building crystal and utility items instead unlocks powerful effects for himself and his team. He performs well in the lane where he can focus on accumulating gold early in the match.",
    power = listOf(
        PowerStatus("Health", 1489.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 159.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Heartthrob (Perk)",
            skillDesc = "Blackfeather’s attacks and abilities apply Heartthrob stacks to enemies. This stacks twice on minions and monsters and up to five times on heroes and objectives. Any time stacks are added or refreshed, Blackfeather also deals bonus crystal damage for each stack of Heartthrob already on the target.\n" +
                    "\n" +
                    "Instead of energy, Blackfeather uses Focus for his abilities. Focus is capped at 100 and naturally regenerates 7.5 per second. Blackfeather also recovers an additional 10 focus for each basic attack he lands.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/10/Blackfeather_Perk.jpg",
        ), SkillStatus(
            skillName = "Feint Of Hearth",
            skillDesc = "Blackfeather lunges to his target and basic attacks. For the next 4 seconds, the target leaves behind a rose trail that grants Blackfeather and his allies move speed when moving through it. When this ability is used against a target with full Heartthrob stacks (shown as broken hearts), it will execute the target for bonus true damage based on the target’s missing health (capped against non-heroes).\n" +
                    "\n" +
                    "Overdrive: The rose trail also makes Blackfeather and allies unslowable. Additionally, the cooldown for Feint of Heart is reset if the target is killed within 0.5 seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/10/Blackfeather_C.jpg",
        ), SkillStatus(
            skillName = "On Point",
            skillDesc = "Blackfeather pierces all enemies in a line, damaging them and applying a decaying slow for 1 second. The duration of this slow is increased by 0.3 seconds for each stack of Heartthrob on the target. If this hits at least one enemy hero, Blackfeather also gains a barrier that scales with a percentage of his bonus health and recovers focus. The amount of focus recovered is further increased with a percentage of his max energy and a percentage of his energy recharge.\n" +
                    "\n" +
                    "Overdrive: On Point gains increased range.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/10/Blackfeather_B.jpg",
        ), SkillStatus(
            skillName = "Rose Offensive",
            skillDesc = "Blackfeather cuts through his opponents, basic attacking all enemies along his path. During the dash, Blackfeather is immune to negative effects and takes greatly reduced damage. This ability has 2 charges.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/10/Blackfeather_A.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/d7-fyE9P7QI/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "Dynasties Blackfeather (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/11/blackfeather_dynasties-web.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Champion Fate Blackfeather (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/11/Blackfeather_ChampionsFate-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Love Bites Blackfeather (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/11/Blackfeather-LoveBites-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffd04840,
        darkVibrant = 0xff682028,
        onDarkVibrant = 0x8dffffff,
    )
)