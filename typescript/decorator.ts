/*
[decorator]
decorator는 class, method, accessor, property, parameter에 붙어 meta 정보 및 programming 로직을 더해줍니다.
*/

/*
[descriptor]
객체 key의 flag들을 담고 있는 객체입니다.
- enumerable: true면 반복문에 열거가능합니다.
- writable: true면 value 수정이 가능합니다.
- configurable: true면 key삭제 및 flag 수정이 가능합니다.
*/
const plane = {
  name: "kfx",
  kind: "fighter",
};

const descriptor = Object.getOwnPropertyDescriptor(plane, "name");
console.log(descriptor);
plane.name = "kf21";
Object.defineProperty(plane, "name", {
  writable: false,
  enumerable: true,
  configurable: true,
});
console.log(Object.getOwnPropertyDescriptor(plane, "name"));
plane.name = "kfx";

/*
[decorator]
*/
function deco(target, propertyKey, descriptor) {
  console.log("decorator");
  console.log("target");
  console.log(target, typeof target);
  console.log("propertyKey");
  console.log(propertyKey, typeof target);
  console.log("descriptor");
  console.log(descriptor, typeof descriptor);
}

class Plane {
  constructor(name) {
    this.name = name;
  }
  /* decorator는 method 선언때 실행됩니다.*/
  @deco
  takeoff() {
    console.log("🛩");
  }
}

const plane = new Plane();
plane.takeoff("kfx");

/*
[decorator factory]
decorator를 만듭니다.
*/
function deco(value) {
  console.log("decorator factory");
  console.log(value);
  return function (target, propertyKey, descriptor) {
    console.log("decorator");
    console.log("target");
    console.log(target, typeof target);
    console.log("propertyKey");
    console.log(propertyKey, typeof propertyKey);
    console.log("descriptor");
    console.log(descriptor, typeof descriptor);
  };
}
class Plane {
  constructor(name) {
    this.name = name;
  }
  /* decorator는 method 선언때 실행됩니다.*/
  @deco("kfx")
  takeoff() {
    console.log("🛩");
  }
}

const plane = new Plane("kfx");
plane.takeoff();

/*
[class decorator]
*/
function deco(target) {
  console.log("decorator");
  console.log("target");
  console.log(target, typeof target);
}

@deco
class Plane {
  /* decorator는 method 선언때 실행됩니다.*/
  takeoff() {
    console.log("🛩");
  }
}

const plane = new Plane("kfx");
plane.takeoff();

/*
[accessor decorator]
*/
function deco(target, propertyKey, descriptor) {
  console.log("decorator");
  console.log("target");
  console.log(target, typeof target);
  console.log("propertyKey");
  console.log(propertyKey, typeof propertyKey);
  console.log("descriptor");
  console.log(descriptor, typeof descriptor);
}

class Plane {
  name;
  constructor(name) {
    this.name = name;
  }

  takeoff() {
    console.log("🛩");
  }

  @deco
  /* decorator는 method 선언때 실행됩니다.*/
  get getName() {
    console.log(this.name);
    return this.name;
  }
}

const plane = new Plane("kfx");
plane.takeoff();

/*
[property decorator]
*/
function deco(target, propertyKey) {
  console.log("decorator");
  console.log("target");
  console.log(target, typeof target);
  console.log("propertyKey");
  console.log(propertyKey, typeof propertyKey);
}

class Plane {
  @deco
  /* decorator는 method 선언때 실행됩니다.*/
  name;
  constructor(name) {
    this.name = name;
  }

  takeoff() {
    console.log("🛩");
  }

  get getName() {
    console.log(this.name);
    return this.name;
  }
}

const plane = new Plane("kfx");
plane.takeoff();

/*
[parameter decorator]
*/
function deco(target, propertyKey, descriptor) {
  console.log("decorator");
  console.log("target");
  console.log(target, typeof target);
  console.log("propertyKey");
  console.log(propertyKey, typeof propertyKey);
  console.log("descriptor");
  console.log(descriptor, typeof descriptor);
}

class Plane {
  /* decorator는 method 선언때 실행됩니다.*/
  name;
  constructor(name) {
    this.name = name;
  }

  takeoff(@deco dir) {
    console.log("🛩", dir);
  }

  get getName() {
    console.log(this.name);
    return this.name;
  }
}

const plane = new Plane("kfx");
plane.takeoff(180);
