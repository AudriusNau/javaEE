package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.mybatis.dao.TeamMapper;
import vu.lt.mybatis.model.Team;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class TeamsMyBatis {
    @Inject
    private TeamMapper teamMapper;

    @Getter
    private List<Team> allTeams;

    @Getter @Setter
    private Team teamToCreate = new Team();

    @PostConstruct
    public void init() {
        this.loadAllTeams();
    }

    private void loadAllTeams() {
        this.allTeams = teamMapper.selectAll();
    }

    @Transactional
    public String createTeam() {
        teamMapper.insert(teamToCreate);
        return "/myBatis/teams?faces-redirect=true";
    }
}