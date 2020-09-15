import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {NutritionGuideComponent} from "../../components/nutrition-guide/nutrition-guide.component";

const routes: Routes = [
  {
    path: '',
    component: NutritionGuideComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NutritionRoutingModule { }
