import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FitnessRoutingModule } from './fitness-routing.module';
import {FitnessTrackerComponent} from "../../components/fitness-tracker/fitness-tracker.component";
import {MatTabsModule} from "@angular/material";

@NgModule({
  declarations: [FitnessTrackerComponent],
  imports: [
    CommonModule,
    FitnessRoutingModule,
    MatTabsModule
  ]
})
export class FitnessModule { }
