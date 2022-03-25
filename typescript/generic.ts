/*
[generic]
generic은 type의 함수입니다.
*/

/*
[Mapped Type]
type P = {
[k in 'a' | 'b']: T[k]
};
[k in 'a' | 'b']: T[k]는 map + for in 함수와 비슷합니다.
['a', 'b'].map((k) => T[k])
*/

interface IServer {
  language: string;
  framework: string;
  cloud: string;
}

/*
[keyof]
key들의 union type을 반환합니다.
*/
type K = keyof IServer;

/*
[Partial]
- Partial<T>
- T의 모든 key를 optional로 바꾸어 반환합니다.
*/
type TPartialServer = Partial<IServer>;

/*
[Pick]
- Pick<T, K>
- K에서 지정한 T의 key들을 반환합니다.
*/
type TPickServer = Pick<IServer, "language" | "cloud">;

/*
[Readonly]
- Readonly<T>
- T의 모든 key를 readonly로 바꾸어 반환합니다.
*/
type TReadonlyServer = Readonly<IServer>;

/*
[함수]
generic으로 함수를 만들 수 있습니다.
*/
function funcA<T, U>(a: T, b: U): [T, U] {
  return [a, b];
}

const funcB = <T, U>(a: T, b: U): [T, U] => {
  return [a, b];
};

// extends를 통해 generic type에 constraint를 만들 수 있습니다.
const funcC = <T extends string | number>(a: T, b: T): [T, T] => {
  return [a, b];
};

funcC("typescript", "nodejs");
funcC<number>(3, 5);
