import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'tracker',
    loadChildren: './modules/fitness/fitness.module#FitnessModule'
  },
  {
    path: 'goal',
    loadChildren: './modules/goal/goal.module#GoalModule'

  },
  {
    path: 'nutrition',
    loadChildren: './modules/nutrition/nutrition.module#NutritionModule'
  },
  {
    path: 'profile',
    loadChildren: './modules/profile/profile.module#ProfileModule'
  },
  {
    path: 'weekly',
    loadChildren: './modules/weekly/weekly.module#WeeklyModule'
  },
  {
    path: '',
    redirectTo: '',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
