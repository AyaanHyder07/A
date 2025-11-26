import React from "react"; 
 
function StudentTable(props) { 
 
  return ( 
    <div> 
      <h2>Student Data</h2> 
      <table> 
        <thead> 
          <tr> 
            <th>RegisterNumber</th> 
            <th>Name</th> 
            <th>Semester</th> 
            <th>Percentage</th> 
          </tr> 
        </thead> 
 
        <tbody> 
          {props.studentData.map((record) => ( 
            <tr key={record.registerNumber}> 
              <td>{record.registerNumber}</td> 
              <td>{record.name}</td> 
              <td>{record.semester}</td> 
              <td>{record.percentage}</td> 
            </tr> 

 
          ))} 
        </tbody> 
      </table> 
    </div> 
  ); 
} 
 
export default StudentTable; 