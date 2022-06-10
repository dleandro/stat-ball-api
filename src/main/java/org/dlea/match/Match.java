package org.dlea.match;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.dlea.common.JpaConverterJson;
import org.dlea.common.model.MatchResult;
import org.dlea.common.model.MatchStats;
import org.dlea.team.Team;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@RegisterForReflection
public class Match extends PanacheEntity {

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "home_team_id")
    public Team homeTeam;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "away_team_id")
    public Team awayTeam;

    @Convert(converter = JpaConverterJson.class)
    @Column(name = "expected_match_result")
    public MatchResult expectedMatchResult;

    @Convert(converter = JpaConverterJson.class)
    @Column(name = "actual_match_result")
    public MatchResult actualMatchResult;

    @Convert(converter = JpaConverterJson.class)
    @Column(name = "home_team_stats")
    public MatchStats homeTeamStats;

    @Convert(converter = JpaConverterJson.class)
    @Column(name = "away_team_stats")
    public MatchStats awayTeamStats;

    public Match() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public MatchResult getExpectedMatchResult() {
        return expectedMatchResult;
    }

    public void setExpectedMatchResult(MatchResult expectedMatchResult) {
        this.expectedMatchResult = expectedMatchResult;
    }

    public MatchResult getActualMatchResult() {
        return actualMatchResult;
    }

    public void setActualMatchResult(MatchResult actualMatchResult) {
        this.actualMatchResult = actualMatchResult;
    }

    public MatchStats getHomeTeamStats() {
        return homeTeamStats;
    }

    public void setHomeTeamStats(MatchStats homeTeamStats) {
        this.homeTeamStats = homeTeamStats;
    }

    public MatchStats getAwayTeamStats() {
        return awayTeamStats;
    }

    public void setAwayTeamStats(MatchStats awayTeamStats) {
        this.awayTeamStats = awayTeamStats;
    }


}
