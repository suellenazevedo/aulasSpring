import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './componentes/home/home.component';
import { ListComponent } from './componentes/list/list.component';
import { LoginComponent } from './componentes/login/login.component';
import { TitleComponent } from './componentes/title/title.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListComponent,
    LoginComponent,
    TitleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
