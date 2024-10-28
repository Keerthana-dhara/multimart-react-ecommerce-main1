import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './Login.css'

const Register = () => {
  const[id,setId]=useState('');
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [error,setError]=useState('');
  const navigate = useNavigate(); 

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
        const response = await fetch('http://localhost:8086/auth/register', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json',
            },
            body: JSON.stringify({id, username,email,password,firstName,lastName }),
          });
    
          if (!response.ok) {
            throw new Error('Already user is registered');
          }
    
          const data = "successful login" // Assuming response is plain text.
          alert(data);  // Display success message
          navigate('/');
    
        } catch (error) {
          setError(error.message);
        }
  };

  return (
    <div id="login">
      <h2>Register</h2>
      <br/>
      <form onSubmit={handleLogin}>
          <label>Username: </label>
          <input
            type="text"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
          />
          <br/>
          <label>Email: </label>
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
          <br/>
          <label>Password: </label>
          <input
            type="text"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
          <br/>
          <label>FirstName: </label>
          <input
            type="text"
            value={firstName}
            onChange={(e) => setFirstName(e.target.value)}
            required
          />
          <br/>
          <label>LastName: </label>
          <input
            type="text"
            value={lastName}
            onChange={(e) => setLastName(e.target.value)}
            required
          />
          <br/>
        <button type="submit">register</button><br/><br/>
      </form>
      {error && <p>{error}</p>}
    </div>
  );
};

export default Register;