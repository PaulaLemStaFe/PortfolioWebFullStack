import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';

import { LoginComponent } from './login.component';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  const formBuilder: FormBuilder = new FormBuilder();

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginComponent ],
      imports: [ ReactiveFormsModule ],
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should detect form is valid', () => {
    fixture.nativeElement.querySelector('button').click();
    expect(component.login()).toEqual('invalid_form');
  });
  
  it('should validate correct user and password', () => {
    component.loginForm = formBuilder.group({
      email: 'paulalemosdeveloper@gmail.com',
      password: 'Portfolio2022AP'
    });
    fixture.nativeElement.querySelector('button').click();
    expect(component.login()).toEqual('login_valid');
  });
  
  it('should deny access with incorrect password', () => {
    component.loginForm = formBuilder.group({
      email: 'paulalemosdeveloper@gmail.com',
      password: 'Portfolio2022'
    });
    fixture.nativeElement.querySelector('button').click();
    expect(component.login()).toEqual('login_invalid');
  });
});
