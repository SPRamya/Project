import axios from 'axios'
import React, { useState } from 'react'
import { Link,useNavigate } from 'react-router-dom'

export default function AddUser() {
    let navigate=useNavigate()
    const [user,setUser]=useState({
        name:"",
        username:"",
        email:"",
        address:"",
        brand:"",
        colour:"",
        mileage:"",
        model:"",
        phno:"",
        price:""
    });
    const{name,username,email,address,brand,colour,mileage,model,phno,price}=user;
    const onInputChanges=(e)=>{
     setUser({...user,[e.target.name]:e.target.value});
    }

const onSubmit=async(e) =>{
e.preventDefault();
   await axios.post("http://localhost:8080/apppost",user);
   navigate("/home")
};

  return (
  <div className="container">
    <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
            <h2 className="text-center m-4">Register User</h2>
            <form onSubmit={(e)=>onSubmit(e)}>
            <div className="mb-3">
                <label htmlFor="Name" className="form-label">
                    Name
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your name"
                    name="name"
                    value={name}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>


            <div className="mb-3">
                <label htmlFor="UserName" className="form-label">
                    UserName
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your UserName"
                    name="username"
                    value={username}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>


            <div className="mb-3">
                <label htmlFor="Email" className="form-label">
                    Email
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your Email"
                    name="email"
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Address" className="form-label">
                    Address
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your address"
                    name="address"
                    value={address}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Brand" className="form-label">
                    Brand
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your brand"
                    name="brand"
                    value={brand}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Colour" className="form-label">
                    Colour
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your colour"
                    name="colour"
                    value={colour}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Mileage" className="form-label">
                    Mileage
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your mileage"
                    name="mileage"
                    value={mileage}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Model" className="form-label">
                    Model
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your model"
                    name="model"
                    value={model}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="PhNo" className="form-label">
                    PhNo
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your phno"
                    name="phno"
                    value={phno}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
            <div className="mb-3">
                <label htmlFor="Price" className="form-label">
                    Price
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter your price"
                    name="price"
                    value={price}
                    onChange={(e)=>onInputChanges(e)}
                    />
            </div>
              <button type="Submit" className="btn btn-outline-primary" >
                Submit 
            </button>
            <Link type="Cancel" className="btn btn-outline-danger mx-2" to="/home">
                Cancel 
            </Link>
            </form>
        </div>
        </div>
    </div>
  )
}
