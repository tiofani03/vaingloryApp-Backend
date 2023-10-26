package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val ardan = Hero(
    id = 4,
    name = "Ardan",
    image = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan.png?alt=media&token=cf5eb444-0a85-4cc1-a8ee-26126b1bae9f",
    imageBackground = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2FArdanActive.png?alt=media&token=d965be01-8935-485f-87ed-d184e4a97397",
    desc = "Ardan is a protector who can dash to and through enemies, and who bolsters his teammates with a protective barrier.",
    power = listOf(
        PowerStatus("Health", 1615.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 96.0, Constants.MAX_ARMOR),
        PowerStatus("Attack", 153.7, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Julia's Gift (Perk)",
            skillDesc = "Ardan heals for 1% of his missing health every time he takes damage. The healing can never exceed 75% of the damage taken. Instead of energy, Ardan uses a yellow meter called Vengeance. Vengeance builds over time and can also be gained with basic attacks, critical strikes and abilities. Because Ardan has no energy, any bonus energy (5%) and energy regeneration (50%) are converted to crystal power.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan_p.webp?alt=media&token=fbe54198-b918-4861-a426-cdc4c78ac67b",
        ),
        SkillStatus(
            skillName = "Vanguard",
            skillDesc = "Ardan dashes to an ally, damaging and slowing nearby enemies while granting the target a burst of move speed and a 3-second barrier that scales with 50% of Ardan's bonus health. Any time the ally takes damage, Ardan gains vengeance. This ability can be used on Ardan, but the barrier, speed boost and vengeance gain is only half as strong. Overdrive: Vanguard grants 30% vengeance when cast on an ally.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan_a.webp?alt=media&token=fd40cc4f-c2f1-4234-8d16-2974085ae9ce",
        ),
        SkillStatus(
            skillName = "Blood for Blood",
            skillDesc = "Ardan leaps forward and punches his target. This deals crystal as well as weapon damage (that can crit) and is treated like a basic attack. Blood for Blood can only be activated when Ardan has 100% vengeance and will consume all of it. Overdrive: Blood for Blood deals an additional 25% weapon and crystal damage.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan_b.webp?alt=media&token=f59ddeb3-deda-4046-9c9b-46391e654b6f",
        ),
        SkillStatus(
            skillName = "Gauntlet",
            skillDesc = "Ardan throws down the gauntlet, projecting a perimeter around the target area and gaining full vengeance. Enemies who cross the perimeter are stunned and take crystal damage. Successfully stunning an enemy grants Ardan vengeance. If Ardan leaves the perimeter it is immediately destroyed.",
            skillImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan_c.webp?alt=media&token=89e54d58-2093-4fc7-b7f0-0ae8b543ec22",
        ),
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Ardan Default Skin",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardan.png?alt=media&token=cf5eb444-0a85-4cc1-a8ee-26126b1bae9f"
        ),
        SkinStatus(
            skinName = "Stormload Ardan (R)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardant1.webp?alt=media&token=b0652493-4cb2-4b99-90e6-c10ecf49e73b",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Stormload Ardan (E)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardant2.webp?alt=media&token=cd9ff5f6-f221-4441-8bce-ec1f974e5d68",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Stormload Ardan (L)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2Fardant3.webp?alt=media&token=0033c477-fb41-4412-b8a2-09dbd7a416a1",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Gladiator Ardan (E)",
            skinImage = "https://firebasestorage.googleapis.com/v0/b/notess-c8095.appspot.com/o/heroes%2Fardan%2FardanG.webp?alt=media&token=f2a4e72b-8a91-443a-8bdb-25ab61669bb6",
            skinType = SKIN.EPIC,
        ),
    )
)