public class Personality {
    private String personalityType;

public Personality(String personalityType){
    this.personalityType = personalityType;
}

public String getPersonalityType(){
    return personalityType;
}


public void setPersonalityType(String personalityType){
    this.personalityType = personalityType;
}

public String getPersonalityDialogue(String personalityType) {
    if (personalityType == "Arrogant") {
        return "You will never beat my score!";
    }
    else if (personalityType == "Kind") {
        return "You can beat me! I believe in you!";
    }
    else if (personalityType == "Mean"){
        return "You're so bad at this!";
    }
    else if (personalityType == "Sad"){
        return "You are so much better than me...";
    }
    else if (personalityType == "Competitive"){
        return "You think you can beat me? Be ready to lose!";
    }
    else if (personalityType == "Bored"){
        return "Let's just get this over with, I've got places to be.";
    }
    else {
        return "Error";
    }
}
}