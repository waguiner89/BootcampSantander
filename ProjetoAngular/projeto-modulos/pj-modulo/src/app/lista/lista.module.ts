import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EntradaComponent } from './entrada/entrada.component';
import { ListagemComponent } from './listagem/listagem.component';



@NgModule({
  declarations: [
    EntradaComponent,
    ListagemComponent
  ],

  exports:[
    EntradaComponent,
    ListagemComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ListaModule { }
