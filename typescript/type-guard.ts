/*
[type guard]
- type guard는 type을 좁혀 type을 보호하는 것을 의미합니다. (typescript가 type을 정확히 추론하여 error가 발생하지 않도록 합니다.)
- 조건문을 통해 type을 좁힙니다.
- null check, typeof, instanceof, in, user-defined function, tagged union 등으로 type guard를 합니다.
*/

class Plane {
  fly() {
    console.log("🛩");
  }
}

class Train {
  run() {
    console.log("🚂");
  }
}

/* null check 기반 type guard */
function funcA(m: null | string): void {
  if (!m) {
    return console.log("null");
  }
  console.log(m.length);
}

/* typeof 기반 type guard */
function funcB(m: number | string): void {
  if (typeof m === "string") {
    return console.log("string");
  }
  console.log("number");
}

/* instanceof 기반 type guard */
function funcC(m: Plane | Train): void {
  if (m instanceof Plane) {
    return m.fly();
  }
  m.run();
}

/* in 기반 type guard */
function funcD(m: Plane | Train): void {
  if ("fly" in m) {
    return m.fly();
  }
  m.run();
}

/* 사용자 정의 type guard function */
function isPlane(n: Plane | Train): n is Plane {
  return n instanceof Plane;
}

function funcE(m: Plane | Train): void {
  if (isPlane(m)) {
    return m.fly();
  }
  m.run();
}
