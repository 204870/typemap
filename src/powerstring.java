class Main{
    public static void main(String[] args) {
        String[] strarr = {"Though it might be far away",
                "We'll be okay",
                "As long as there's some way",
                "To cure it",
                "Though our safety's compromised",
                "We're still alive",
                "And we'll still burn brighter",
                "than any other star in the sky",
                "The burning flame inside you see",
                "It burns a name I'd rather be",
                "And to express and dress",
                "in a way that's reflecting me",
                "Our bodies filled with golden flares",
                "Shouting our names into the air",
                "Hoping to live a little longer",
                "than thirty years",
                "Although there's something on your mind",
                "You know that there's always the time",
                "That's ticking on and on and knows",
                "that you've always tried",
                "In this new life so crystalline",
                "It's almost like the stars aligned",
                "In their entropical, paradoxical design",
                "PFFT",
                "HAHAHA",
                "Oh my gosh, that's what started it?",
                "Nawh that's great",
                "Oh wow",
                "I've heard of you",
                "And what you go through",
                "So tell me",
                "if I have the same feelings too",
                "I've realized in time",
                "I'm not different to you",
                "oooh",
                "Seeking a new truth",
                "clearing my mind-view",
                "I know we'll do Better",
                "Together",
                "watching our people",
                "slain by the evil and",
                "still burning bright",
                "no matter what the media says",
                "hit it!"};

        for (int j = 0; j < strarr.length; j++) {
            for (int i = 0; i <= strarr[j].length(); i++) {
                System.out.println(strarr[j].substring(0, i));
            }
        }
    }
}