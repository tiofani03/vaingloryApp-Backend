package com.tioooo.data.heroes

import com.tioooo.model.*
import com.tioooo.utils.*

val baptiste = Hero(
    id = 5,
    name = "Baptiste",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/baptiste.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/BaptisteActive.png",
    desc = "Baptiste dictates battle by striking fear into the heart of his enemies. Reaping the souls of his opponents, he both sustains himself and empowers his attacks and abilities. He commands his army of shades to either lock down unsuspecting victims or terrorize entire teams, forcing them to flee from him.",
    power = listOf(
        PowerStatus("Health", 1571.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 86.1, Constants.MAX_ARMOR),
        PowerStatus("Attack", 167.1, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.MAGE,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Reap (Perk)",
            skillDesc = "Baptiste generates soul fragments through combat and is healed for each soul fragment acquired. Upon reaching max soul fragments, Baptiste is empowered for a few seconds and deals increased damage but generates no additional soul fragments.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/05/Baptiste_perk.png",
        ), SkillStatus(
            skillName = "Bad Mojo",
            skillDesc = "Baptiste pulls a vial of liquid from his vest and throws it. The vial explodes upon reaching its target or when colliding with an enemy.\n" +
                    "\n" +
                    "• Enemies near the explosion take damage and the first enemy hit is slowed.\n" +
                    "• Deals reduced damage to minions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/05/Baptiste_A.png",
        ), SkillStatus(
            skillName = "Ordained",
            skillDesc = "Baptiste ordains a target enemy, damaging them and creating an ethereal prison around them. If the ordained target leaves the area, they are stunned and take additional damage.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/05/Baptiste_B.png",
        ), SkillStatus(
            skillName = "Fearsome Shade",
            skillDesc = "Baptiste summons waves of shade that terrorize enemies caught in their path. Enemies struck by the shade run from the source in fear and take damage each second.\n" +
                    "\n" +
                    "• Deals reduced damage to minions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/05/Baptiste_C.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://cdnb.artstation.com/p/assets/images/images/008/054/211/large/mushk-rizvi-baptiste.jpg?1513291053"
        ),
        SkinStatus(
            skinName = "'Anubis' Baptiste (E)",
            skinImage = "https://chesbay-vgforums-uploads.s3-us-east-2.amazonaws.com/original/2X/0/0fd52c70202ae0eac8f15804031a069324552d9a.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Scarecrow' Baptiste (E)",
            skinImage = "https://www.vainglorygame.com/wp-content/uploads/2017/09/baptiste_scarecrow_painting1000px.jpg",
            skinType = SKIN.EPIC,
        ),
    ),
    stateColor = StateColor(
        vibrant = 0xffc04858,
        darkVibrant = 0xff602020,
        onDarkVibrant = 0x89ffffff,
    )
)