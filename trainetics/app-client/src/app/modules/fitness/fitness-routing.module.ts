import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FitnessTrackerComponent} from "../../components/fitness-tracker/fitness-tracker.component";

const routes: Routes = [
  {
    path: '',
    component: FitnessTrackerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FitnessRoutingModule { }
