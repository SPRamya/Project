import React, { useState } from 'react';
import './Loginform.css';
import axios from 'axios';
import {  Link, useNavigate } from 'react-router-dom';

const LoginForm = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate=useNavigate();


  const handleLogin = (e) => {
    e.preventDefault();
    // Perform login logic here
    // You can make an API call to authenticate the user
    // or implement your own login functionality
    console.log('Login:', email, password);

    (async () => {
  
        const data = {
     
          emailid:email,
       
          password:password,
          
        };
    try{
        const response = await axios.post('http://localhost:8080/login', data);
        // Handle successful response
        console.log(response.data);
        if (response.data === "Login Succesfull") {
          
          // alert(response.data);
          navigate("/Home")
        } else {
          alert(response.data);
        }
      }
    catch (error) {
        // Handle error
        console.error(error);
      }
  })();
    

  
  };



  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  return (
    <div className='logs'>
    <div className="login-forms">
      <h2>Login </h2>
      <form onSubmit={handleLogin}>
        <div className="form-groups">
          <label>Email</label>
          <input type="email" value={email} onChange={handleEmailChange} />
        </div>
        <div className="form-groups">
          <label>Password</label>
          <input type="password" value={password} onChange={handlePasswordChange} />
        </div>
        <center>
        <button type="submit" className='joo'>Login</button>
        </center>

      </form>
      <div className="signup-links">
              Don't have an account?
      </div>
      <center>
      <button type='submit' className='jo'><Link to='/signup'>Sign up</Link></button>
      </center>

    </div>
    </div>
  );
};

export default LoginForm;