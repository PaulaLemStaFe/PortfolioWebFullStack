import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BanneryquiensoyComponent } from './componentes/banneryquiensoy/banneryquiensoy.component';
import { HeaderComponent } from './componentes/header/header.component';
import { ExperienciaslaboralesComponent } from './componentes/experienciaslaborales/experienciaslaborales.component';
import { CertificadosComponent } from './componentes/certificados/certificados.component';
import { ConocimientosinformaticosComponent } from './componentes/conocimientosinformaticos/conocimientosinformaticos.component';
import { MisproyectosComponent } from './componentes/misproyectos/misproyectos.component';
import { HabilidadesblandasComponent } from './componentes/habilidadesblandas/habilidadesblandas.component';
import { AprendizajesdevidaComponent } from './componentes/aprendizajesdevida/aprendizajesdevida.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './componentes/login/login.component';
import { HomeComponent } from './componentes/home/home.component';
import { EditionComponent } from './componentes/edition/edition.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ExperiencesComponent } from './componentes/experiences/experiences.component';
import { EditionbannerComponent } from './componentes/editionbanner/editionbanner.component';
import { EditionheaderComponent } from './componentes/editionheader/editionheader.component';
import { EditioncertificatesComponent } from './componentes/editioncertificates/editioncertificates.component';

@NgModule({
  declarations: [
    AppComponent,
    BanneryquiensoyComponent,
    HeaderComponent,
    ExperienciaslaboralesComponent,
    CertificadosComponent,
    ConocimientosinformaticosComponent,
    MisproyectosComponent,
    HabilidadesblandasComponent,
    AprendizajesdevidaComponent,
    FooterComponent,
    LoginComponent,
    HomeComponent,
    EditionComponent,
    ExperiencesComponent,
    EditionbannerComponent,
    EditionheaderComponent,
    EditioncertificatesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
