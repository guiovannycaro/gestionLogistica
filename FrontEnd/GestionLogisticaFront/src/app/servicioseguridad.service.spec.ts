import { TestBed } from '@angular/core/testing';

import { ServicioseguridadService } from './servicioseguridad.service';

describe('ServicioseguridadService', () => {
  let service: ServicioseguridadService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServicioseguridadService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
