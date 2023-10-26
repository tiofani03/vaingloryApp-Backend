package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val celeste = Hero(
    id = 9,
    name = "Celeste",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/celeste.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/CelesteActive-1.png",
    desc = "Celeste lights the way for her team, calling upon her stars for both artillery and long-range reconnaissance. Though fragile, she is well-suited to fighting from the furthest edges of battle.",
    power = listOf(
        PowerStatus("Health", 1347.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 83.5, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Julia's Light (Perk)",
            skillDesc = "Celeste's basic attacks have a spell component, dealing 65-115 (level 1-12) crystal damage with a 50% crystal ratio. Celeste's basic attacks also reveal enemy heroes for 1.5 seconds - even after the target leaves vision range.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste-P-julias-light.png",
        ), SkillStatus(
            skillName = "Helio Genesis",
            skillDesc = "Celeste forms a small star at a target location, dealing crystal damage to nearby enemies. The star will briefly linger on the field. If Celeste uses this ability on an existing star, the star will go supernova, dealing more crystal damage in a larger area. Deals reduced damage to minions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste-A-heliogenesis.png",
        ), SkillStatus(
            skillName = "Core Collapse",
            skillDesc = "After a brief delay, the target location collapses and nearby enemies are stunned and take crystal damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste-B-core-collapse.png",
        ), SkillStatus(
            skillName = "Solar Storm",
            skillDesc = "Celeste launches a storm of stars that travel across the world. Stars collide with the first enemy they hit, dealing crystal damage in an area. The number of stars increases each time Solar Storm is upgraded. Deals 50% damage to non-heroes and does not damage structures.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste-C-solar-storm.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://i.ytimg.com/vi/rC-vkqUkERY/maxresdefault.jpg"
        ),
        SkinStatus(
            skinName = "Star Queen Celeste (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/StarQueenCelesteI.png",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Star Queen Celeste (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste_Tier2_Splash-copy.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Star Queen Celeste (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste_StormQueen_T3-Splash.jpg",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Baewitched Celest(LE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/BaewitchedCeleste.png",
            skinType = SKIN.LIMITED_EDITION,
        ),
        SkinStatus(
            skinName = "Butterfly Celeste (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Butterfly-Celeste.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Moon Princess Celeste (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Celeste_1.22_splash_edit.jpg",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    )
)