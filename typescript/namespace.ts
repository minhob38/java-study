/*
[namespace]
- namespace는 typescript에서 code를 분리하는 단위입니다.
- ///<reference>로 가져옵니다.
- --outfile을 통해 하나의 file로 transfile해야합니다.
- namespace는 js bundle file에 namespace 이름을 가진 객체로 만들어집니다.
- dependency(require 및 import)가 없기 때문에, js bundle file의 전역변수들을 덮어씌울수 있습니다.
*/

namespace NM {
  /* namespace 안에서 접근 가능 */
  const str = "print namespace";

  /* namespace 바깥에서 접근 가능 */
  export function printNM() {
    console.log(str);
  }

  /* namespace 바깥에서 접근 가능 */
  export const nm = "namespace";
}
