package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*
import com.tioooo.utils.ATTACK_TYPE.MELEE

val lorelai = Hero(
    id = 25,
    name = "Lorelai",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/lorelai.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/11/LorelaiActive-2.png",
    desc = "Lorelai is a happy sea creature who enjoys her simple life of piranha dancing and clam gossip. Once every one thousand years, she follows Adagio's song to the surface and brings him a dragon egg in exchange for a Hardy orange. But one day, the Storm Queen sings Adagio's song and takes several eggs away. Only then does Lorelai discover that the dragons are being used to destroy the race of men. Now aware of the truth and her complicity, Lorelai is determined to make up for releasing widespread destruction upon the world.\n" +
            "\n" +
            "Lorelay controls the ebb and the flow of teamfights, and it all revolves around her heroic perk",
    power = listOf(
        PowerStatus("Health", 2253.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 50.3, Constants.MAX_ARMOR),
        PowerStatus("Attack", 94.0, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 33.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.PROTECTOR,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "That's Swell (Perk)",
            skillDesc = "Lorelai's basic attacks deal crystal damage and she becomes empowered when she's on a source of water from her abilities. Using an ability while Lorelai's on a source of water consumes the water she's on and empowers the ability used.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/Perk_thats_swell.jpg",
        ), SkillStatus(
            skillName = "Fish Food",
            skillDesc = "Lorelai calls upon her aquatic friends at the target location. After 0.8 seconds, her pet clam snaps the area, dealing damage to enemy units inside and stunning them.\n" +
                    "\n" +
                    "A pool filled with small piranhas persists for 8 seconds afterwards, dealing damage over time to enemy units inside",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/A_icon_Fish_Food.jpg",
        ), SkillStatus(
            skillName = "Splashdown",
            skillDesc = "Lorelai throws a sphere of water at target location. After a short delay, the water forms a pool for 8 seconds, speeding up allies and slowing enemies inside.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/B_Icon_Splashdown.jpg",
        ), SkillStatus(
            skillName = "Waterwall",
            skillDesc = "Lorelai forms a protective veil of water on target allied hero cleansing the target of any movement-impairing effects.\n" +
                    "\n" +
                    "After a short delay, the water barrier drops on the ground, leaving behind a pool for 8 seconds.\n" +
                    "\n" +
                    "Temporarily grants the target a large barrier.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/10/C_Icon_Waterfall.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/11/FullHD_Hor_Lorelai.jpg"
        ),
        SkinStatus(
            skinName = "Dark Siren Lorelai (E)",
            skinImage = "https://dmu9n6at1rzsj.cloudfront.net/uploads/db3297/optimized/2X/0/0be63e6f31f0286b99fad7d94148c6de473106e0_2_1380x776.jpeg",
            skinType = SKIN.EPIC,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xff4888a0,
        darkVibrant = 0xff482038,
        onDarkVibrant = 0x7fffffff,
    )
)