import { enableProdMode } from '@angular/core';
import { platformBrowser } from '@angular/platform-browser';
import './content/scss/vendor.scss';

// @ts-ignore
import { AppModuleNgFactory } from './app/app.module.ngfactory';

enableProdMode();

platformBrowser().bootstrapModuleFactory(AppModuleNgFactory);
