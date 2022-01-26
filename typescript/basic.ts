/*
const
*/
const a = "typescript"; // const에 type을 지정하지 않으면, type 추론으로 const a: "typescript" = "typescript";와 같아집니다.

/*
let
*/
let b = "typescript"; // let에 type을 지정하지 않고, 초기화하면 type 추론으로 let b: string = "typescript";와 같아집니다.
let c; // let에 type을 지정하지 않고, 초기화를 하지 않으면 type 추론으로 let b: any;와 같아집니다.

/*
index signature
*/
type TObj = { [key: string]: string | number };
const obj: TObj = {
  a: "typescript",
  b: 3,
};

/*
array
*/
const arr: string[] = ["typescript", "javascript"];

/*
function
- 함수는 type 정의를 해주는게 좋습니다.
- 함수 body에서 인자들의 type을 정의하지 않는게 좋습니다. (가독성↓)
*/
type TFuncA = (m: number, n: number) => number;
const funcA: TFuncA = (m, n) => m + n;

type TFuncB = {
  (m: number, n: number): number;
};
const funcB: TFuncB = (m, n) => m + n;

interface IFuncC {
  (m: number, n: number): number;
}
const funcC: IFuncC = (m, n) => m + n;

const funcD = (m: number, n: number): number => m + n;

function funcE(m: number, n: number): number {
  return m + n;
}

const funcF = function (m: number, n: number): number {
  return m + n;
};
