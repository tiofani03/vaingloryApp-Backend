package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val taka = Hero(
    id = 40,
    name = "Taka",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/taka.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/TakaActive.png",
    desc = "Taka weaves through the battlefield, eliminating targets with his switchblades. He lives on the knife's edge, compensating for fragile defenses with agility and stealth.",
    power = listOf(
        PowerStatus("Health", 1555.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 72.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 124.8, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.ASSASSIN,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "House Kamuha(Perk)",
            skillDesc = "Taka's critical strikes have 20% lifesteal and grant a burst of speed. Every 5 seconds, Taka is guaranteed a critical strike. Taka gains 1 Ki stack when he performs an ability or critical strike (up to 5 stacks). Each stack of Ki speeds up his guaranteed critical strikes 0.9 secs and grants 25% cooldown acceleration.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Taka-P-house-kamuha.png",
        ), SkillStatus(
            skillName = "Kaiten",
            skillDesc = "Taka flips over his target, cutting it with his switchblade. Taka doesn't take damage while in mid-air",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Taka-A-kaiten.png",
        ), SkillStatus(
            skillName = "Kaku",
            skillDesc = "Taka throws a smoke bomb at his feet, vanishing from enemy sight and gaining move speed. This illusion ends early if he strikes a target or he takes direct damage. Turrets, Scout Traps and Flare Guns will see Taka while invisible. Overdrive: Kaku heals Taka for 1% of his max health per second while invisible.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Taka-B-kaku.png",
        ), SkillStatus(
            skillName = "X-Retsu",
            skillDesc = "Taka bursts through his target, carving an X with his switchblades for lethal damage. The target suffers a mortal wound, reducing its healing by 50% and taking damage per second over the next 3 seconds. Grants 3 stacks of Ki.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Taka-C-x-retsu.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/8/85/Taka.jpg/revision/latest/scale-to-width-down/1000?cb=20161211165402"
        ),
        SkinStatus(
            skinName = "Shiro Kage Taka (R)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/TakaT1Flat.jpg",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Shiro Kage Taka (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/ShiroKageTakaTII.png",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Shiro Kage Taka (L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/taka_T3-web.png",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Night Shadow Taka(LE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/taka_T3-web.png",
            skinType = SKIN.LIMITED_EDITION,
        ),
        SkinStatus(
            skinName = "Night Shadow Taka(SE)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Take_Nightshadow-web.png",
            skinType = SKIN.SPECIAL_EDITION,
        ),
        SkinStatus(
            skinName = "School Days Taka(L)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Taka_School_Days-web.png",
            skinType = SKIN.LEGENDARY,
        ),
    )
)