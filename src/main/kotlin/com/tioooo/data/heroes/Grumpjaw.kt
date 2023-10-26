package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val grumpjaw = Hero(
    id = 15,
    name = "Grumpjaw",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/grumpjaw.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/GrumpjawActive.png",
    desc = "Grumpjaw is a durable fighter, able to last in battles while maintaining stacks of his Living Armor through basic attacks. Grumpjaw can charge headlong into a fight, heavily damaging and slowing enemies at the end of his charge. Once he breaks through enemy lines, Grumpjaw can easily turn the tides of battle by devouring one of his enemies and briefly removing them from the fight.",
    power = listOf(
        PowerStatus("Health", 2107.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 90.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 153.7, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 34.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.WARRIOR,
    attackType = ATTACK_TYPE.MELEE,
    position = POSITION.JUNGLE,
    skills = listOf(
        SkillStatus(
            skillName = "Living Armor (Perk)",
            skillDesc = "Grumpjaw is a durable fighter, able to last in battles while maintaining stacks of his Living Armor through basic attacks. Grumpjaw can charge headlong into a fight, heavily damaging and slowing enemies at the end of his charge. Once he breaks through enemy lines, Grumpjaw can easily turn the tides of battle by devouring one of his enemies and briefly removing them from the fight.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/02/Perk.jpg",
        ), SkillStatus(
            skillName = "Grumpy",
            skillDesc = "Grumpjaw charges to a target location, dealing crystal damage and slowing enemies in an area upon reaching his destination. Grumpjaw deals bonus damage for each stack of Living Armor.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/02/A.jpg",
        ), SkillStatus(
            skillName = "Hangry",
            skillDesc = "Grumpjaw leaps toward his target and attacks them. Afterward, he gains bonus weapon damage and attack speed for several seconds.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/02/B.jpg",
        ), SkillStatus(
            skillName = "Stuffed",
            skillDesc = "Grumpjaw lunges forward, grabbing the first enemy hero in his path and devouring them whole. While the enemy is inside Grumpjaw’s belly, they are unable to move or act and their vision range is reduced to zero. After a few seconds, Grumpjaw will spit the enemy out in the direction he is facing. Grumpjaw can reactivate the ability to spit the enemy out early in a direction of his choice. If Grumpjaw is stunned, killed, or otherwise interrupted while eating, he will release his victim early..",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2017/02/C.jpg",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://en.vainglorygame.com/wp-content/uploads/2017/02/1000x500_Grumpjaw.jpg"
        ),
        SkinStatus(
            skinName = "'Carnivore' Grumpjaw (E)",
            skinImage = "https://th.vainglorygame.com/wp-content/uploads/2018/03/1000px_Carnivore_Grumpjaw_02.jpg",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "'Lapdog' Grumpjaw (R)",
            skinImage = "https://jp.vainglorygame.com/wp-content/uploads/2017/05/Grumpjaw_dog_Splash_1000px.jpg",
            skinType = SKIN.RARE,
        ),
    )
)