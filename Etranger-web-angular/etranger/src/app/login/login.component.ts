import { Component, OnInit } from '@angular/core';
import { User } from '../login/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User={id:'',password:''};
  constructor() { }

  ngOnInit() {
  }

  forgetPsw(){
    alert("sdsdfsdf");
  }
}
