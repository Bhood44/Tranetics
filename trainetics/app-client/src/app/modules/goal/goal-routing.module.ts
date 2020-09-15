import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {GoalListComponent} from "../../components/goal-list/goal-list.component";
import {GoalCardComponent} from "../../components/goal-list/goal-card/goal-card.component";

const routes: Routes = [
  {
    path: '',
    component: GoalListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GoalRoutingModule { }
