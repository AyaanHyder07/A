import React, { useEffect, useState } from "react"; 
import axios from "axios"; 
 
function UserList() { 
  const [users, setUsers] = useState([]); 
  useEffect(() => { 
    axios.get("https://jsonplaceholder.typicode.com/users") 
      .then(response => { 
        setUsers(response.data); 
      }) 
      .catch(error => { 
        console.log("Error fetching users", error); 
      }); 
  }, []); 
 
  return ( 
    <div> 
      <h1>User List</h1> 
      <ul> 
        {users.map(user => ( 
          <li key={user.id}> 
            {user.name}  
            ({user.email}) 
          </li> 
        ))} 
      </ul> 
    </div> 
); 
} 
export default UserList; 

// import React from 'react'; 
// import UserList from './UserList'; 
 
// function App() { 
//   return ( 
//     <div className="App"> 
//       <h1>Axios React Example</h1> 
//       <UserList /> 
//     </div> 
//   ); 
// } 
 
// export default App; 