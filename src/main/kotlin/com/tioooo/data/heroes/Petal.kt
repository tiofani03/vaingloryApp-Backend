package com.tioooo.data.heroes

import com.tioooo.model.Hero
import com.tioooo.model.PowerStatus
import com.tioooo.model.SkillStatus
import com.tioooo.model.SkinStatus
import com.tioooo.utils.*

val petal = Hero(
    id = 29,
    name = "Petal",
    image = "https://www.vaingloryfire.com/images/heroes/potrait/petal.png",
    imageBackground = "https://www.vainglorygame.com/wp-content/uploads/2017/09/PetalActive.png",
    desc = "Petal plants seeds that slowly heal her and her friends. She can grow these seeds into minions that fight alongside her, and she can blow them up to obliterate vulnerable targets.",
    power = listOf(
        PowerStatus("Health", 1453.0, Constants.MAX_HEALTH),
        PowerStatus("Armor", 64.5, Constants.MAX_ARMOR),
        PowerStatus("Attack", 87.4, Constants.MAX_ATTACK),
        PowerStatus("Movement Speed", 31.0, Constants.MAX_MOVEMENT_SPEED),
    ),
    role = ROLE.SNIPER,
    attackType = ATTACK_TYPE.RANGED,
    position = POSITION.LANE,
    skills = listOf(
        SkillStatus(
            skillName = "Bramblethorn Munions(Perk)",
            skillDesc = "Petal controls three 'munion' pets. Pets have 150 (+95 per level, +40% of crystal) health and 8 (+11 per level, +40% of crystal) damage. Petal's home platform will automatically create seeds that can be sprouted into munions.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Petal-P-bramblethorn-munions.png",
        ), SkillStatus(
            skillName = "Bramblethorn Seeds",
            skillDesc = "Petal plants a seed right in front of her. Bramblethorn Seeds provide a small healing and armor aura when near them. Healing aura can stack up to 5 times from multiple seeds. Seeds last 2 minutes and do NOT grant vision.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Petal-A-bramblethorn-seed.png",
        ), SkillStatus(
            skillName = "Yay, Pets!",
            skillDesc = "Petal sprouts nearby seeds into Bramblethorn Munions that fight for her. Enemies standing on sprouting seeds take damage. Activating this ability will also heal any pets already present.",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Petal-B-yay-pets.png",
        ), SkillStatus(
            skillName = "Spontaneous Combustion",
            skillDesc = "Petal commands her pets to explode one by one, dealing massive splash damage. Pets are invincible during channeling. Detonated pets become Bramblethorn Seeds.\n" +
                    "\n",
            skillImage = "https://www.vainglorygame.com/wp-content/uploads/2015/05/Petal-C-spontaneous-combustion.png",
        )
    ),
    skins = listOf(
        SkinStatus(
            skinName = "Default",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/6/63/Petal.jpg/revision/latest/scale-to-width-down/1000?cb=20161217131653"
        ),
        SkinStatus(
            skinName = "Bug Petal (R)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/b/b1/BPetalR.jpg/revision/latest?cb=20161218205757",
            skinType = SKIN.RARE,
        ),
        SkinStatus(
            skinName = "Bug Petal (E)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/5/54/BPetalE.jpg/revision/latest/scale-to-width-down/1000?cb=20161218205837",
            skinType = SKIN.EPIC,
        ),
        SkinStatus(
            skinName = "Bug Petal (L)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/1/1f/BPetalL.png/revision/latest/scale-to-width-down/1000?cb=20170212103936",
            skinType = SKIN.LEGENDARY,
        ),
        SkinStatus(
            skinName = "Pumpkin Special Petal(LE)",
            skinImage = "https://static.wikia.nocookie.net/vainglory_gamepedia/images/a/a4/PSPetalLE.jpg/revision/latest/scale-to-width-down/1000?cb=20161217131950",
            skinType = SKIN.LIMITED_EDITION,
        ),
    )
)