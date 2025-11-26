import React, { useState } from "react"; 
 
function StudentForm(props) { 
11 
 
  const [registerNumber, setRegisterNumber] = useState(""); 
  const [name, setName] = useState(""); 
  const [semester, setSemester] = useState(""); 
  const [percentage, setPercentage] = useState(""); 
 
  const handleSubmit = (e) => { 
    e.preventDefault(); 
    props.addNewRecord(registerNumber, name, semester, percentage); 
  }; 
 
  return ( 
 
    <div> 
      <form > 
        <h2>Enter Student Details</h2> 
 
        <label htmlFor="registerNumber">Register Number:</label> 
        <input 
          type="text" 
          id="registerNumber" 
          placeholder="Enter register number" 
          value={registerNumber} 
          onChange={(e) => setRegisterNumber(e.target.value)} 
        /><br /> 
 
        <label htmlFor="name">Name:</label> 
        <input 
          type="text" 
          id="name" 
          placeholder="Enter name" 
          value={name} 
          onChange={(e) => setName(e.target.value)} 
        /><br /> 
 
        <label htmlFor="semester">Semester:</label> 
        <input 
          type="text" 
          id="semester" 
          placeholder="Enter semester" 
          value={semester} 
          onChange={(e) => setSemester(e.target.value)} 
        /><br /> 
 
        <label htmlFor="percentage">Percentage:</label> 
12 
 
        <input 
          type="text" 
          id="percentage" 
          placeholder="Enter percentage" 
          value={percentage} 
          onChange={(e) => setPercentage(e.target.value)} 
        /><br /> 
 
        <input type="Submit" onClick={handleSubmit}></input> 
      </form> 
    </div> 
  ); 
} 
 
export default StudentForm; 

// import React, { useState } from "react"; 
// import StudentForm from "./StudentForm"; 
// import StudentTable from "./StudentTable"; 
 
// function App() { 
//   const [studentData, setStudentData] = useState([]); 
 
//   const addNewRecord = (registerNumber, name, semester, percentage) => { 
//     const newRecord = { registerNumber, name, semester, percentage }; 
//             setStudentData(studentDate=>[...studentData, newRecord]); 
//   }; 
 
//   return ( 
//     <div> 
//       <h1>Student Management</h1> 
//       <StudentForm addNewRecord={addNewRecord} /> 
//       <StudentTable studentData={studentData} /> 
//     </div> 
//   ); 
// } 
 
// export default App; 