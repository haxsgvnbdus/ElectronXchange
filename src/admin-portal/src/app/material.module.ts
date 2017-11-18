import { NgModule } from '@angular/core';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatListModule} from '@angular/material/list';
import {MatDialogModule} from '@angular/material/dialog';


@NgModule({

  imports: [
    MatToolbarModule,
    MatButtonModule,
    MatGridListModule,
	  MatInputModule,
    MatSelectModule,
    MatSlideToggleModule,
    MatListModule,
    MatDialogModule
  

   ],

  exports: [
    MatToolbarModule,
    MatButtonModule,
    MatGridListModule,
    MatInputModule,
    MatSelectModule,
    MatSlideToggleModule,
    MatListModule,
    MatDialogModule
   

  ],

})

export class MaterialModule { }
