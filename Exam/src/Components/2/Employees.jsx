import { useState } from "react";
function Employees() {
  const [employees, setEmployees] = useState([
    { empId: 101, name: "John", designation: "SE" },
    { empId: 102, name: "Tom", designation: "SSE" },
    { empId: 103, name: "Kevin", designation: "TA" },
  ]);
  const addEmployee = () => {
    setEmployees([
      ...employees,
      { empId: 104, name: "Sanvi", designation: "TL" },
    ]);
    1;
  };
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
          {employees.map((employee) => (
            <tr key={employee.empId}>
              <td>{employee.empId}</td>
              <td>{employee.name}</td>
              <td>{employee.designation}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <button onClick={addEmployee}>Add an employee </button>
    </>
  );
}
export default Employees;
