import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './component/Navbar';
import Home from './component/Home';
import {BrowserRouter as Router, Routes, Route, BrowserRouter} from "react-router-dom"; 
import AddUser from './component/AddUser';
import EditUser from './component/EditUser';
import LoginForm from './loginPage/Loginform';
import Signup from './loginPage/signup';




const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  
  <BrowserRouter>
    <App/>
    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
