package me.whiteship.java8to11.바_Optional소개와API;

import java.time.Duration;

public class Progress {
    private Duration studyDuration;

    private boolean finished;

    public Duration getStudyDuration(){
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration){
        this.studyDuration = studyDuration;
    }
}
