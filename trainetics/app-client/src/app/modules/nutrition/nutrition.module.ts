import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NutritionRoutingModule } from './nutrition-routing.module';
import {NutritionGuideComponent} from "../../components/nutrition-guide/nutrition-guide.component";
import {MatTabsModule} from "@angular/material";

@NgModule({
  declarations: [NutritionGuideComponent],
  imports: [
    CommonModule,
    NutritionRoutingModule,
    MatTabsModule
  ]
})
export class NutritionModule { }
