package org.dlea.common.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MatchResult {

    public int homeTeamGoals;
    public int awayTeamGoals;

    public MatchResult(int homeTeamGoals, int awayTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
    }

    public MatchResult() {

    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(int awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }
}
