import {Goal} from "./goal";

export class User {

  id: number;
  email: string;
  password: string;
  firstname: string;
  lastname: string;
  profession: string;
  bodytype: number;
  weight: number;
  height: string;
  goals: Goal[];
}
