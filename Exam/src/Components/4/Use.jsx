import React, { useState, useEffect } from "react";

function Use() {
  const [name, setName] = useState("Jack");
  const [age, setAge] = useState(20);

  useEffect(() => {
    console.log("useEffect called");
  });

  return (
    <>
      <h1>Your name is: {name}</h1>
      <h1>Your age is: {age}</h1>

      <button onClick={() => setName("Tom")}>Update Name</button>
      <button onClick={() => setAge(age + 1)}>Increment Age</button>
    </>
  );
}

export default Use;
