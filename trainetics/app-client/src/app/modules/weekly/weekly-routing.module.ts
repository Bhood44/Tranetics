import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WeeklyBoardComponent} from "../../components/weekly-board/weekly-board.component";

const routes: Routes = [
  {
    path: '',
    component: WeeklyBoardComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class WeeklyRoutingModule { }
