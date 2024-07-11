package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val skaarf = Hero(
    id = 38,
    name = "Skaarf",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/skaarf.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/SkaarfActive.png",
    desc = "Skaarf blazes his way through the fold, incinerating everything in his path. He specializes in powerful abilities that set his enemies on fire, bringing them down from a distance.",
    power = listOf(
        PowerStatus("Health", 1347.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 148.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Fan The Flmaes(Perk)",
            skillDesc = "Skaarf’s fire-based abilities light the target ablaze, burning enemies for 1.5% of their max health for 3.5 seconds. Each of Skaarf’s basic attacks will refresh the burn duration by 2 seconds, and increase the damage of the burn by another 1.5%, up to 10% per second. Damages-per-stack increases by 1% for every 100 crystal power. This fire does not burn turrets and deals reduced damage to Kraken.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfPfan-the-flames.png",
        ), SkillStatus(
            skillName = "Spit Fire",
            skillDesc = "Skaarf spits a fireball that burns and damages anything in its path and collides with the first hero, structure, or boss monster it hits. Each target the fireball passthrough reduces its damage by 66%. Deals reduced damage to turrets if out of range.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfAspitfire.png",
        ), SkillStatus(
            skillName = "Goop",
            skillDesc = "Skaarf hurls goop onto the target location. Enemies walking through the sticky substance are slowed. Skaarf’s fire abilities will set the goop ablaze with a burst of damage that extends slightly beyond the gooped area. Once aflame, a gooped location will not slow but will apply damage over time.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfBgoop.png",
        ), SkillStatus(
            skillName = "Dragon Breath",
            skillDesc = "Skaarf inhales deeply for 1.5 seconds, slowing fleeing enemies and accelerating closing allies. Skaarf then exhales flame for 3 seconds, incinerating enemies in a cone in front of him. While exhaling, enemies moving against the flame are slowed while allies moving with the flame are accelerated. Skaarf may move freely while spewing fire, but he cannot basic attack or use other abilities. Each time Dragon Breath is upgraded it adds shield piercing to the exhale damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfCdragon-breath.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/3/32/Skaarf.jpg/revision/latest/scale-to-width-down/1000?cb=20170129135834"
        ),
        SkinStatus(
            skinName = "Infinity Skaarf (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfT1Flat.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Infinity Skaarf (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/SkaarfT2Flat.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Infinity Skaarf (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/skaarf_T3_site_splash.jpg",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Sparkler Skaarf (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/09/Skaarf_CNY_purple-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "Sparkler Skaarf (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/09/Skaarf_CNY_red-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "Sparkler Skaarf (SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/09/Skaarf_CNY_blue-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xfff0c038,
        darkVibrant = 0xff502018,
        onDarkVibrant = 0x81ffffff,
    )
)