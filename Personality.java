public class Personality {
    private String personalityType;

public personality(String personalityType){
    this.personalityType = personalityType;
}

public String getPersonalityType(){
    return personalityType;
}


public void setPersonalityType(String personalityType){
    this.personalityType = personalityType;
}

def get_personality_dialogue(personality_type):
    if (personality_type == "Arrogant"){
        return You will never beat my score
    }
    else if (personality_type == "Kind"){
        return "You can do it I believe in you"
    }
    else if (personality_type == "Mean"){
        return "You are so bad at this"
    }
    else if (personality_type == "Sad"){
        return "You are so much better than me"
    }
    else if (personality_type == "Competitive"){
        return "You think you can beat me? Be ready to lose!"
    }
    else if (personality_type == "Bored"){
        return "Let's just get this over with, I've got places to be."
    }
    else {
        return "Error"
    }
}