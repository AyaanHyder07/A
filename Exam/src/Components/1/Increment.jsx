import { useState } from "react";
function Increment() {
  const [counter, setCounter] = useState(0);
  return (
    <div>
      Counter: {counter}
      <br />
      <button onClick={() => setCounter(() => counter + 1)}>Increment</button>
    </div>
  );
}
export default Increment;
