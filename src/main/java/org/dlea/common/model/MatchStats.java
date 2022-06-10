package org.dlea.common.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MatchStats {

    public String ballPossession;

    public MatchStats() {}

    public MatchStats(String ballPossession) {
        this.ballPossession = ballPossession;
    }

    public String getBallPossession() {
        return ballPossession;
    }

    public void setBallPossession(String ballPossession) {
        this.ballPossession = ballPossession;
    }
}
