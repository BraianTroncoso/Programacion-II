import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { ServiciosComponent } from './pages/servicios/servicios.component';
import { QuienesSomosComponent } from './pages/quienes-somos/quienes-somos.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';

const routes: Routes = [
{path:'servicios',component:ServiciosComponent},
{path:'quienes-somos',component:QuienesSomosComponent},
{path:'home',component:DashboardComponent},
{path: 'quienes-somos', component: QuienesSomosComponent},
{path: 'quienes-somos/:id', component: IntegranteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
