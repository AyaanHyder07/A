function Employees(props) {
  return (
    <>
      <table>
        <thead>
          <tr>
            <th>EmpId</th>
            <th>Name</th>
            <th>Designation</th>
          </tr>
        </thead>
        <tbody>
          {props.employees.map((employee) => (
            <tr key={employee.empId}>
              <td>{employee.empId}</td>
              <td>{employee.name}</td>
              <td>{employee.designation}</td>3
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}
export default Employees;


// import { useState } from 'react'; 
// import Employees from './Employees'; 
// function App() { 
// const [employees, setEmployees] = useState([ 
// { empId: 101, name: "John", designation: "SE" }, 
// { empId: 102, name: "Tom", designation: "SSE" }, 
// { empId: 103, name: "Kevin", designation: "TA" } 
// ]); 
// return ( 
// <> 
// <Employees employees={employees} /> 
// </> 
// ); 
// } 
// export default App; 