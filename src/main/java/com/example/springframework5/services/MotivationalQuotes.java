package com.example.springframework5.services;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class MotivationalQuotes {

    private List<String> quotes;

    public  MotivationalQuotes(){

        quotes= Arrays.asList(
                "He who conquers himself is the mightiest warrior.",
                "Try not to become a man of success, but rather become a man of value.",
                "One man with courage makes a majority.",
                "One secret of success in life is for a man to be ready for his opportunity when it comes.",
                "A man who has committed a mistake and doesn’t correct it is committing another mistake.",
                "The successful man will profit from his mistakes and try again in a different way.",
                "A successful man is one who can lay a firm foundation with the bricks others have thrown at him.",
                "He is a wise man who does not grieve for the things which he has not, but rejoices for those which he has.",
                "You've got to get up every morning with determination if you're going to go to bed with satisfaction.",
                "Education is the most powerful weapon which you can use to change the world.",
                "The most difficult thing is the decision to act, the rest is merely tenacity.",
                "You’ll find that education is just about the only thing lying around loose in this world, and it’s about the only thing a fellow can have as much of as he’s willing to haul away.",
                "Take the attitude of a student, never be too big to ask questions, never know too much to learn something new.",
                "It is remarkable how much long-term advantage people like us have gotten by trying to be consistently not stupid, instead of trying to be very intelligent.",
                "You can’t be that kid standing at the top of the waterslide, overthinking it. You have to go down the chute.",
                "When I believe in something, I’m like a dog with a bone.",
                "And the day came when the risk to remain tight in a bud was more painful than the risk it took to blossom.",
                "The standard you walk past, is the standard you accept.",
                "I've searched all the parks in all the cities and found no statues of committees.",
                "Success is stumbling from failure to failure with no loss of enthusiasm.",
                "Keep your eyes on the stars, and your feet on the ground.",
                "Do not stop thinking of life as an adventure. You have no security unless you can live bravely, excitingly, imaginatively; unless you can choose a challenge instead of competence.",
                "Perfection is not attainable. But if we chase perfection we can catch excellence.",
                "Get a good idea and stay with it. Dog it, and work at it until it’s done right.",
                "Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence.",
                "The elevator to success is out of order. You’ll have to use the stairs, one step at a time.",
                "Be a positive energy trampoline – absorb what you need and rebound more back.",
                "People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily.",
                "Work until your bank account looks like a phone number.",
                "I am so clever that sometimes I don’t understand a single word of what I am saying.",
                "People say nothing is impossible, but I do nothing every day.",
                "Life is like a sewer… what you get out of it depends on what you put into it.",
                "I always wanted to be somebody, but now I realise I should have been more specific.",
                "Talent wins games, but teamwork and intelligence win championships.",
                "Individual commitment to a group effort—that is what makes a team work, a company work, a society work, a civilisation work.",
                "Teamwork is the ability to work together toward a common vision. The ability to direct individual accomplishments toward organizational objectives. It is the fuel that allows common people to attain uncommon results.",
                "Coming together is a beginning. Keeping together is progress. Working together is success.",
                "Alone we can do so little, together we can do so much.",
                "Remember, teamwork begins by building trust. And the only way to do that is to overcome our need for invulnerability.",
                "I invite everyone to choose forgiveness rather than division, teamwork over personal ambition.",
                "Just one small positive thought in the morning can change your whole day.",
                "Opportunities don't happen, you create them.",
                "Love your family, work super hard, live your passion.",
                "It is never too late to be what you might have been.",
                "Don't let someone else's opinion of you become your reality",
                "If you’re not positive energy, you’re negative energy."
        );

    }
    public String getRandomQuote (){
        return quotes.get(ThreadLocalRandom.current().nextInt(0, quotes.size()));
    }
}
