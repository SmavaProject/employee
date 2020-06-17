import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Team} from "../Team";
import {TeamServiceService} from "../team-service.service";

@Component({
  selector: 'app-team-list',
  templateUrl: './team-list.component.html',
  styleUrls: ['./team-list.component.css']
})
export class TeamListComponent implements OnInit {

  teams: Observable<Team[]>;
  constructor(private teamService: TeamServiceService) { }

  ngOnInit(): void {
    this.loadData();
  }

  deleteTeam(id: string){}

  loadData() {
    this.teams = this.teamService.getTeamsList();
  }
}
