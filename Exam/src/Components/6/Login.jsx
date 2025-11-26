
import React, { useState } from 'react'; 
 
function Login() { 
  const [status, setStatus] = useState(null); 
  const [data, setData] = useState({ 
    userName: "", 
    password: "" 
  }); 
 
  const handleSubmit = (event) => { 
    event.preventDefault(); 
    if (!data.userName || !data.password) { 
      setStatus(false); 
    } else { 
      setStatus(true); 
    } 
  }; 
 
  const handleChange = (event) => { 
    const { name, value } = event.target; 
    setData({ ...data, [name]: value }); 
  }; 
 
  return ( 
    <div> 
      <form onSubmit={handleSubmit}> 
        <div> 
          <label htmlFor="userName">Username:</label> 
          <input 
            type="text" 
            id="userName" 
            name="userName" 
            value={data.userName} 
            onChange={handleChange} 
 
            placeholder="Enter username" 
          /> 
        </div> 
 
        <div> 
          <label htmlFor="password">Password:</label> 
          <input 
            type="password" 
            id="password" 
            name="password" 
            value={data.password} 
            onChange={handleChange} 
            placeholder="Enter password" 
          /> 
        </div> 
 
        <button type="submit">Login</button> 
 
        {status === false &&<div style={{ color: 'red' }}>Enter username and password</div>} 
        {status === true &&<div style={{ color: 'green' }}>Login Successful</div>} 
      </form> 
    </div> 
  ); 
} 
 
export default Login; 