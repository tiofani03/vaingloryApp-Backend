package com.tioooo.data

import com.tioooo.model.News

fun generateNewsData(): ArrayList<News> {
    val list: ArrayList<News> = arrayListOf()

    val news1 = News(
        id = 1,
        title = "INTRODUCING THE RARE ‘ELITE FORCE’ IDRIS SKIN!",
        description = "The Churn whispers to ‘Elite Force’ Idris as he scouts inside the most mysterious place on the Fold: the Halcyon Well. Will he succumb to the evil that lives within him?",
        image = "https://id.vainglorygame.com/wp-content/uploads/2017/03/Idris_Elite_splash_1000px.jpg",
        fullUrl = "https://id.vainglorygame.com/news/introducing-the-rare-elite-force-idris-skin/"
    )

    val news2 = News(
        id = 2,
        title = "CHECK OUT THE RARE ‘ENFORCER’ KINETIC!",
        description = "Before she was commander of a mech army, ‘Enforcer’ Kinetic served in a Special Weapons Unit. Read more about this rare skin below!",
        image = "https://id.vainglorygame.com/wp-content/uploads/2018/06/1000px_Kinetic_Only_rare_splash_.jpg",
        fullUrl = "https://id.vainglorygame.com/news/check-rare-enforcer-kinetic/"
    )

    val news3 = News(
        id = 3,
        title = "MAKE A SPLASH WITH THE SPECIAL EDITION ‘SUMMER PARTY’ BLACKFEATHER!",
        description = "On the beach, every guy will have an impressive volleyball spike; even undead dudes can carve waves. Men seeking summertime romance must take to the sea. I suggest you take your favorite vixen on a moonlit boat ride, compliment the cut of her bikini and hand-squeeze some mango juice. If your date is not overcome with passion, jump into the water and grab a swordfish by the tail. Emerge from the sea, salty and dripping, and challenge the boat’s captain to a duel, making sure that the captain is your best wingman. Win the duel in spectacular fashion, with one arm outstretched to catch your darling when she swoons.",
        image = "https://id.vainglorygame.com/wp-content/uploads/2018/06/1000px_Summer_Party_Blackfeather.jpg",
        fullUrl = "https://id.vainglorygame.com/news/make-splash-special-edition-summer-party-blackfeather/"
    )

    val news4 = News(
        id = 4,
        title = "FLICKER ABILITIES & SPLASH ART REVEALED!",
        description = "Flicker is a sneaky trickster able to disrupt foes with his debilitating abilities. Utilizing his stealth, Flicker can plunge deep into enemy lines causing mayhem or grant his entire team stealth to initiate on unsuspecting prey.\n" +
                "\n" +
                "Flicker is one of the Bleekos — the mortal enemies of Petal’s Meekos. More on that troubled history is to come.\n" +
                "\n" +
                "Read on for Flicker’s abilities. …",
        image = "https://id.vainglorygame.com/wp-content/uploads/2016/10/Flicker_Hero_SplashArt_Final.jpg",
        fullUrl = "https://id.vainglorygame.com/news/flicker-abilities-splash-art-revealed/"
    )

    val news5 = News(
        id = 5,
        title = "SAMUEL HERO BREAKDOWN – GET AN EARLY EDGE",
        description = "Samuel is a dark mage who specializes in not only controlling zones, but advancing and breaking them. He is able to create a large creeping field of darkness that both augments his powers and damages foes. As a high damage-per-second hero, he wields two wands with gunslinger-like speed. He also has area of effect, draining and sleep abilities that round out his fearsome arsenal.",
        image = "https://id.vainglorygame.com/wp-content/uploads/2016/08/Samuel_splash-1.jpg",
        fullUrl = "https://id.vainglorygame.com/news/samuel-hero-breakdown-get-an-early-edge/"
    )


    list.add(news1)
    list.add(news2)
    list.add(news3)
    list.add(news4)
    list.add(news5)

    return list
}