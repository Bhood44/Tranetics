import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GoalRoutingModule } from './goal-routing.module';
import {GoalListComponent} from "../../components/goal-list/goal-list.component";

//Material components
import {MatTabsModule} from "@angular/material";
import {GoalCardComponent} from "../../components/goal-list/goal-card/goal-card.component";

@NgModule({
  declarations: [
    GoalListComponent,
    GoalCardComponent
  ],
  imports: [
    CommonModule,
    GoalRoutingModule,
    MatTabsModule
  ]
})
export class GoalModule { }
