import React, { useState } from 'react';
import './signup.css';
import axios from 'axios';
import {  useNavigate } from 'react-router-dom';


const SignupForm = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [contactNumber, setContactNumber] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const navigate=useNavigate();

  const handleSignup = async (e) => {
    e.preventDefault();
    // Perform sign-up logic here
    // You can make an API call to register the user
    // or implement your own sign-up functionality
    console.log('Sign up:', name, email, contactNumber, password, confirmPassword);

    if (password !== confirmPassword) {
      alert("Password and Confirm Password do not match.");
      return;
    }

    (async () => {
      try {
        const data = {
          username:name,
          emailid:email,
          phonenumber:contactNumber,
          password:password,
          confirm_password:confirmPassword,
          
        };
    
        const response = await axios.post('http://localhost:8080/postsignup', data);
        // Handle successful response
        console.log(response.data);
        navigate("/")
    // Handle successful signup response
    alert(response.data);
    // Redirect to homepage or perform any desired actions
  } catch (error) {
    console.error(error);
    // Handle signup error
    
      }
    })();
    
    
    
  };

  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handleContactNumberChange = (e) => {
    setContactNumber(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleConfirmPasswordChange = (e) => {
    setConfirmPassword(e.target.value);
  };

  return (
    <div className="signup">
      <div className="signup-form">
        <h2>Create an Account</h2>
        <form onSubmit={handleSignup}>
          <div className="form-group">
            <label>Name</label>
            <input type="text" value={name} onChange={handleNameChange} required />
          </div>

          <div className="form-group">
            <label>Email</label>
            <input type="email" value={email} onChange={handleEmailChange} required />
          </div>
          <div className="form-group">
            <label>Contact Number</label>
            <input type="tel" value={contactNumber} onChange={handleContactNumberChange} required />
          </div>
          <div className="form-group">
            <label>Password</label>
            <input type="password" value={password} onChange={handlePasswordChange} required />
          </div>
          <div className="form-group">
            <label>Confirm Password</label>
            <input
              type="password"
              value={confirmPassword}
              onChange={handleConfirmPasswordChange}
              required
            />
          </div>
          <button type="submit"  className="logbutton">Sign up</button>
        </form>
      </div>
    </div>
  );
};

export default SignupForm;