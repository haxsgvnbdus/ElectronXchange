import { NgModule } from '@angular/core';

import {MatButtonModule} from '@angular/material/button';
import {MatTabsModule} from '@angular/material/tabs';
import {MatInputModule} from '@angular/material/input';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';

@NgModule({

  imports: [
    MatButtonModule,
 	  MatTabsModule,
	  MatInputModule, 
    MatProgressSpinnerModule,

   ],

  exports: [
    MatButtonModule,
    MatTabsModule,
    MatInputModule, 
    MatProgressSpinnerModule,

    
  ],

  providers: [

  ],

})

export class MaterialModule { }
