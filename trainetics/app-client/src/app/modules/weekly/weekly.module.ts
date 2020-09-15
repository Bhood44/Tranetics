import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WeeklyRoutingModule } from './weekly-routing.module';
import {WeeklyBoardComponent} from "../../components/weekly-board/weekly-board.component";
import {MatTabsModule} from "@angular/material";

@NgModule({
  declarations: [WeeklyBoardComponent],
  imports: [
    CommonModule,
    WeeklyRoutingModule,
    MatTabsModule
  ]
})
export class WeeklyModule { }
