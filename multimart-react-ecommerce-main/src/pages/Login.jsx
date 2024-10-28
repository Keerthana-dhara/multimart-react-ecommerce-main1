import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './Login.css'

const Login = () => {
  const [id, setId] = useState('');
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
        const response = await fetch('http://localhost:8086/login', {
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
      <h2>Login</h2>
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
          <label>Password: </label>
          <input
            type="text"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
          <br/>
        <button type="submit" onClick={() => navigate('/')}>login</button><br/><br/>
        <p>Don’t have an account? <span className="register-link" onClick={() => navigate('/register')}>Register</span></p>
      </form>
      {error && <p>{error}</p>}
    </div>
  );
};

export default Login;