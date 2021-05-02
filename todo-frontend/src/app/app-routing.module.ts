import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
      path:'login',
      loadChildren: () => import('./login/login.module').then(m => m.LoginModule)
  },
  {
    path:'about',
    loadChildren: () => import('./about/about.module').then(m => m.AboutModule)
  },
  {
    path:'contact',
    loadChildren: () => import('./contact/contact.module').then(m => m.ContactModule)
  },
  {
      path: '',
      redirectTo: '',
      pathMatch: 'full'
  },
  {
    path: '**',
    redirectTo: '',
    pathMatch: 'full'
}        
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
