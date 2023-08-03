import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import {  Route, Routes } from 'react-router-dom';
import Navbar from './component/Navbar';
import Home from './component/Home';
import AddUser from './component/AddUser';
import EditUser from './component/EditUser';
import ViewUser from './component/ViewUser';
import LoginForm from './loginPage/Loginform';
import Signup from './loginPage/signup';


function App() {
  return (
    <div className="App">
       <Routes>
       
    <Route exact path="/signup" element={<Signup/>}/>
       <Route exact path="/" element={<LoginForm/>}/>
    <Route exact path="/Home" element= {<><Navbar/><Home/></>}/>
    <Route exact path="/adduser" element= {<><Navbar/><AddUser/></>}/>
    <Route exact path="/edituser/:id" element={<><Navbar/><EditUser/></>}/>
    <Route exact path="/viewuser/:id" element={<><Navbar/><ViewUser/></>}/>
    </Routes>

    </div>
  );
}

export default App;
